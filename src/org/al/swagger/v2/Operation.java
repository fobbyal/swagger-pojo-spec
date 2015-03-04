package org.al.swagger.v2;

import java.util.List;
import java.util.Map;

/**
 * Created by showdown on 3/3/2015 at 9:39 PM.
 * Project Pojo Swagger Spec
 */
public class Operation {
    List<String> tags;
    String summary;
    String description;
    ExternalDocumentation externalDocs;

    String operationalID;
    List<String> consumes;
    List<String> produces;
    List parameters;
    Map<String, Response> responses;
    List<String> schemes;
    Boolean deprecated = false;
    Map<String, List<String>> security;

    public List<String> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<String> consumes) {
        this.consumes = consumes;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

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

    public String getOperationalID() {
        return operationalID;
    }

    public void setOperationalID(String operationalID) {
        this.operationalID = operationalID;
    }

    public List getParameters() {
        return parameters;
    }

    public void setParameters(List parameters) {
        this.parameters = parameters;
    }

    public List<String> getProduces() {
        return produces;
    }

    public void setProduces(List<String> produces) {
        this.produces = produces;
    }

    public Map<String, Response> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, Response> responses) {
        this.responses = responses;
    }

    public List<String> getSchemes() {
        return schemes;
    }

    public void setSchemes(List<String> schemes) {
        this.schemes = schemes;
    }

    public Map<String, List<String>> getSecurity() {
        return security;
    }

    public void setSecurity(Map<String, List<String>> security) {
        this.security = security;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
