package org.al.swagger.v2.schema;

/**
 * Created by showdown on 4/5/2015 at 6:28 PM.
 * Project REST-POJO
 */
public class IntegerSchemaGenrator extends AbstractSchemaGenerator {
    @Override
    public String getFormat() {
        return "int32";
    }

    @Override
    public String getType() {
        return "number";
    }
}