package org.al.swagger.v2.schema;

/**
 * Created by showdown on 4/5/2015 at 6:42 PM.
 * Project REST-POJO
 */
public class ByteSchemaGenerator extends AbstractSchemaGenerator {

    @Override
    public String getFormat() {
        return "byte";
    }

    @Override
    public String getType() {
        return "string";
    }
}
