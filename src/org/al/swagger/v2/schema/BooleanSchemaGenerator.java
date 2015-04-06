package org.al.swagger.v2.schema;

/**
 * Created by showdown on 4/5/2015 at 6:47 PM.
 * Project REST-POJO
 */
public class BooleanSchemaGenerator extends AbstractSchemaGenerator {
    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public String getType() {
        return "boolean";
    }
}
