package org.al.swagger.v2.schema;

/**
 * Created by showdown on 4/5/2015 at 6:28 PM.
 * Project REST-POJO
 */
public class DoubleSchemaGenerator extends AbstractSchemaGenerator {
    @Override
    public String getFormat() {
        return "double";
    }

    @Override
    public String getType() {
        return "number";
    }
}