package org.al.swagger.v2.schema;

import org.al.swagger.v2.GenericSwaggerSchema;

/**
 * Created by showdown on 4/5/2015 at 6:37 PM.
 * Project REST-POJO
 */
public abstract class AbstractSchemaGenerator implements SchemaGenerator {
    @Override
    public GenericSwaggerSchema generateSchema(Class<?> clazz) {
        GenericSwaggerSchema schema = new GenericSwaggerSchema();
        schema.setType(getType());
        schema.setFormat(getFormat());

        return schema;
    }

    public abstract String getType();

    public abstract String getFormat();
}
