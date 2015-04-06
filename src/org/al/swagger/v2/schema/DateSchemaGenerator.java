package org.al.swagger.v2.schema;

/**
 * Created by showdown on 4/5/2015 at 6:30 PM.
 * Project REST-POJO
 */
public class DateSchemaGenerator extends AbstractSchemaGenerator {
    @Override
    public String getFormat() {
        return "date";
    }

    @Override
    public String getType() {
        return "string";
    }


}
