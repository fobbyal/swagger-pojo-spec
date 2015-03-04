package org.al.swagger.v2;

/**
 * Created by showdown on 3/3/2015 at 9:48 PM.
 * Project Pojo Swagger Spec
 */
public class ExternalDocumentation {
    String description;
    String url;

    public ExternalDocumentation(String description, String url) {
        this.description = description;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
