package org.al.swagger.v2.schema;

/**
 * Created by showdown on 4/5/2015 at 6:40 PM.
 * Project REST-POJO
 */
public class DateTimeSchemaGenerator extends AbstractSchemaGenerator {
    @Override
    public String getFormat() {
        return "date-time";
    }

    @Override
    public String getType() {
        return "string";
    }
}
