package org.al.swagger.v2;

/**
 * Created by showdown on 3/3/2015 at 9:49 PM.
 * Project Pojo Swagger Spec
 */
public class Parameter {
    String name;
    String in;
    String description;
    Boolean required = false;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
