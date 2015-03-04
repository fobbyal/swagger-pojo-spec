package org.al.swagger.v2;

/**
 * Created by showdown on 3/4/2015 at 12:36 AM.
 * Project Pojo Swagger Spec
 */
public class BodyParameter extends Parameter {
    public BodyParameter() {
        in = "body";
    }

    /**
     * JsonSchema or RefSchema *
     */
    Object schema;

    public Object getSchema() {
        return schema;
    }

    public void setSchema(Object schema) {
        this.schema = schema;
    }
}
