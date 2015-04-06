package org.al.swagger.v2.schema;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by showdown on 4/5/2015 at 6:26 PM.
 * Project REST-POJO
 */
public class SimpleTypeFactory {
    private static SimpleTypeFactory ourInstance = new SimpleTypeFactory();

    public static SimpleTypeFactory getInstance() {
        return ourInstance;
    }

    private Map<Class<?>, SchemaGenerator> factoryMap = new HashMap<>();

    public SchemaGenerator getSchemaGenerator(Class<?> aClass) {
        return factoryMap.get(aClass);
    }

    private SimpleTypeFactory() {
        factoryMap.put(Integer.class, new IntegerSchemaGenrator());
        factoryMap.put(Integer.TYPE, new IntegerSchemaGenrator());
        factoryMap.put(Double.class, new DoubleSchemaGenerator());
        factoryMap.put(Double.TYPE, new DoubleSchemaGenerator());
        factoryMap.put(Long.class, new LongSchemaGenerator());
        factoryMap.put(Long.TYPE, new LongSchemaGenerator());
        factoryMap.put(Boolean.class, new BooleanSchemaGenerator());
        factoryMap.put(Boolean.TYPE, new BooleanSchemaGenerator());
        factoryMap.put(Date.class, new DateTimeSchemaGenerator());
        factoryMap.put(Instant.class, new DateTimeSchemaGenerator());
        factoryMap.put(String.class, new StringSchemaGenerator());
        factoryMap.put(Byte.class, new ByteSchemaGenerator());
        factoryMap.put(Byte.TYPE, new ByteSchemaGenerator());
        factoryMap.put(Character.TYPE, new StringSchemaGenerator());
        factoryMap.put(Character.class, new StringSchemaGenerator());
    }
}
