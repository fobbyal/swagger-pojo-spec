package org.al.swagger.v2;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by showdown on 3/4/2015 at 1:11 AM.
 * Project Pojo Swagger Spec
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Header extends GenericSwaggerSchema {
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
