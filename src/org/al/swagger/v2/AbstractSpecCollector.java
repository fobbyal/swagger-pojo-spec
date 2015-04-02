package org.al.swagger.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
                                     String basepath, List<String> transPortSchemes) throws IOException {
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
        swager.setBasepath(basepath);

        //todo: tag missing need to generate from all services
        swager.setTags(new ArrayList<>());

        //todo: settings should be loaded from some kinda properties.xml
        swager.setSchemes(transPortSchemes);

        swager.setConsumes(Arrays.asList(jsonFormat));
        swager.setProduces(Arrays.asList(jsonFormat));

        swager.setPaths(generatePaths());

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL).configure(SerializationFeature.INDENT_OUTPUT, true).writeValue(stream, swager);

    }

    public abstract Map<String, Path> generatePaths();
}
