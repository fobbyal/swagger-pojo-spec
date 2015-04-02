package org.al.swagger.v2;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by showdown on 3/4/2015 at 12:39 AM.
 * Project Pojo Swagger Spec
 */
public class NonBodyParameter extends Parameter {
    String type;
    String format;
    Object Object;
    String collectionFormat = "csv";
    @XmlElement(name = "default")
    Object defaultVaule;
    Double maxinum;
    Boolean exclusiveMaximum;
    Double minimum;
    Boolean exclusiveMinimum;
    java.lang.Integer maxLength;
    Integer minLength;
    String pattern;
    Integer maxObject;
    Integer minObject;
    Boolean uniqueObject;
    @XmlElement(name = "enum")
    List enumeration;
    Double multipleOf;

    public String getCollectionFormat() {
        return collectionFormat;
    }

    public void setCollectionFormat(String collectionFormat) {
        this.collectionFormat = collectionFormat;
    }

    public Object getDefaultVaule() {
        return defaultVaule;
    }

    public void setDefaultVaule(Object defaultVaule) {
        this.defaultVaule = defaultVaule;
    }

    public List getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(List enumeration) {
        this.enumeration = enumeration;
    }

    public Boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public Boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getObject() {
        return Object;
    }

    public void setObject(Object Object) {
        this.Object = Object;
    }

    public Double getMaxinum() {
        return maxinum;
    }

    public void setMaxinum(Double maxinum) {
        this.maxinum = maxinum;
    }

    public Integer getMaxObject() {
        return maxObject;
    }

    public void setMaxObject(Integer maxObject) {
        this.maxObject = maxObject;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Integer getMinObject() {
        return minObject;
    }

    public void setMinObject(Integer minObject) {
        this.minObject = minObject;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Double getMultipleOf() {
        return multipleOf;
    }

    public void setMultipleOf(Double multipleOf) {
        this.multipleOf = multipleOf;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
