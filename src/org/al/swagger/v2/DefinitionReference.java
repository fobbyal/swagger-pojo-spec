package org.al.swagger.v2;

/**
 * Created by showdown on 3/4/2015 at 2:16 AM.
 * Project swagger-pojo-spec
 */
public class DefinitionReference {

    String $ref;

    public DefinitionReference(String $ref) {
        this.$ref = "#/definitions/" + $ref;
    }

    public String get$ref() {
        return $ref;
    }

    public void set$ref(String $ref) {
        this.$ref = $ref;
    }
}
