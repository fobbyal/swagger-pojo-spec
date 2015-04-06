package org.al.swagger.v2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.al.swagger.v2.schema.JDKPrimitiveType;
import org.al.swagger.v2.schema.SchemaGenerator;
import org.al.swagger.v2.schema.SimpleTypeFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by showdown on 4/2/2015 at 1:34 AM.
 * Project REST-POJO
 */
public abstract class AbstractSpecCollector {
    public static final String jsonFormat = "application/json";


    public void collectAndOutputSpec(OutputStream stream,
                                     String host,
                                     String description,
                                     String version,
                                     String title,
                                     String contactEmail,
                                     String contactName,
                                     String contactURL,
                                     String basePath,
                                     List<String> transportSchemas) throws IOException {
        SwaggerSpecV2 swager = new SwaggerSpecV2();

        swager.setSwagger("2.0");
        Info info = new Info();

        info.setDescription(description);
        info.setVersion(version);

        info.setTitle(title);

        //todo: term of use missing
        Contact contact = new Contact();
        contact.setEmail(contactEmail);
        contact.setName(contactName);
        contact.setUrl(contactURL);
        info.setContact(contact);
        License license = new License();
        license.setName("Copyright © 2015 Integ Enterprise Consulting Inc.");
        license.setUrl("http://www.integconsulting.com");
        info.setLicense(license);
        swager.setInfo(info);
        swager.setHost(host);
        swager.setBasePath(basePath);


        swager.setTags(generateTags());

        swager.setSchemes(transportSchemas);

        swager.setConsumes(Arrays.asList(jsonFormat));
        swager.setProduces(Arrays.asList(jsonFormat));

        swager.setPaths(generatePaths());

        swager.setDefinitions(generateDefinitions());
        
        

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL).configure(SerializationFeature.INDENT_OUTPUT, true).writeValue(stream, swager);

    }


    public abstract Map<String, Object> generateDefinitions();

    public abstract List<Tag> generateTags();

    public Object createSchemaObject(Class<?> aClass) {
        if (aClass.isArray()) {
            GenericSwaggerSchema schema = new GenericSwaggerSchema();
            schema.setType("array");
            schema.setCollectionFormat("csv");
            schema.setItems(createSchemaObject(aClass.getComponentType()));
            return schema;

        } else if (JDKPrimitiveType.isPrimitiveType(aClass)) {

            SchemaGenerator generator = SimpleTypeFactory.getInstance().getSchemaGenerator(aClass);
            if (generator != null) {
                return generator.generateSchema(aClass);
            } else {
                throw new RuntimeException("Type " + aClass + " not supporeted");

            }

        } else {


            Map<String, Object> schemaMap = new LinkedHashMap<>();


            Map<String, Object> properties = new LinkedHashMap<>();
            schemaMap.put("properties", properties);

            List<Field> fields = Stream.of(aClass.getDeclaredFields()).
                    filter(f -> !f.isAnnotationPresent(JsonIgnore.class) && !Modifier.isStatic(f.getModifiers())).collect(Collectors.toList());
            for (Field f : fields) {
                if (f.getName().equalsIgnoreCase("rowId")) {
                    properties.put(f.getName(), SimpleTypeFactory.getInstance().getSchemaGenerator(String.class).generateSchema(String.class));
                } else {
                    Object schemaObject = createSchemaObject(f.getType());
                    properties.put(f.getName(), schemaObject);
                }


            }

            return schemaMap;
        }


    }

   

    
    

    public abstract Map<String, Path> generatePaths();
}
