package org.al.swagger.v2;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by showdown on 3/4/2015 at 1:37 AM.
 * Project swagger-pojo-spec
 */
public class GenericSwaggerType {
    String type;
    String format;
    Items items;
    String collectionFormat = "csv";
    @XmlElement(name = "default")
    Object defaultVaule;
    Double maxinum;
    Boolean exclusiveMaximum;
    Double minimum;
    Boolean exclusiveMinimum;
    Integer maxLength;
    Integer minLength;
    String pattern;
    Integer maxItems;
    Integer minItems;
    Boolean uniqueItems;
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

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Double getMaxinum() {
        return maxinum;
    }

    public void setMaxinum(Double maxinum) {
        this.maxinum = maxinum;
    }

    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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

    public Integer getMinItems() {
        return minItems;
    }

    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
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

    public Boolean getUniqueItems() {
        return uniqueItems;
    }

    public void setUniqueItems(Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }
}
