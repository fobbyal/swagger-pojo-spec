package org.al.swagger.v2;

import java.util.Map;

/**
 * Created by showdown on 3/4/2015 at 1:07 AM.
 * Project Pojo Swagger Spec
 */
public class Response {
    String description;
    Object schema;
    Map<String, Header> headers;
    Map<String, Object> examples;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getExamples() {
        return examples;
    }

    public void setExamples(Map<String, Object> examples) {
        this.examples = examples;
    }

    public Map<String, Header> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Header> headers) {
        this.headers = headers;
    }

    public Object getSchema() {
        return schema;
    }

    public void setSchema(Object schema) {
        this.schema = schema;
    }
}
