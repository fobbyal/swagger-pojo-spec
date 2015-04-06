package org.al.swagger.v2.schema;

import org.al.swagger.v2.GenericSwaggerSchema;


/**
 * Created by showdown on 4/5/2015 at 6:24 PM.
 * Project REST-POJO
 */
public interface SchemaGenerator {
    public GenericSwaggerSchema generateSchema(Class<?> clazz);

}
