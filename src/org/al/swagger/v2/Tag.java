package org.al.swagger.v2;

/**
 * Created by showdown on 3/4/2015 at 1:44 AM.
 * Project swagger-pojo-spec
 */
public class Tag {
    String name;
    String description;
    ExternalDocumentation externalDocs;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
