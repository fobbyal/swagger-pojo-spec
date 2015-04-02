package org.al.swagger.v2;

/**
 * Created by showdown on 3/4/2015 at 2:16 AM.
 * Project swagger-pojo-spec
 */
public class ParameterReference {

    String $ref;

    public ParameterReference(String $ref) {
        this.$ref = "#/parameters/" + $ref;
    
    }


}
