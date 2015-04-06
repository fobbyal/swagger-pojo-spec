package org.al.swagger.v2;

import java.util.List;
import java.util.Map;

/**
 * Created by showdown on 3/3/2015 at 12:02 AM.
 * Project Pojo Swagger Spec
 */
public class SwaggerSpecV2 {
    String swagger = "2.0";
    Info info;
    String host;
    List<String> schemes;
    String basePath;
    
    List<String> consumes;
    List<String> produces;
    Map<String, Path> paths;
    Map<String, Object> definitions;
    Map<String, Parameter> parameters;
    Map<String, Response> responses;
    Map<String, SecurityScheme> securityDefinitions;
    Map<String, List<String>> security;
    List<Tag> tags;
    ExternalDocumentation externalDocs;

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public List<String> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<String> consumes) {
        this.consumes = consumes;
    }

    public Map<String, Object> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(Map<String, Object> definitions) {
        this.definitions = definitions;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Map<String, Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Map<String, Path> getPaths() {
        return paths;
    }

    public void setPaths(Map<String, Path> paths) {
        this.paths = paths;
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

    public Map<String, SecurityScheme> getSecurityDefinitions() {
        return securityDefinitions;
    }

    public void setSecurityDefinitions(Map<String, SecurityScheme> securityDefinitions) {
        this.securityDefinitions = securityDefinitions;
    }

    public String getSwagger() {
        return swagger;
    }

    public void setSwagger(String swagger) {
        this.swagger = swagger;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
