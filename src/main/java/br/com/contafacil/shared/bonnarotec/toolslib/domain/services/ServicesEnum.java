package br.com.contafacil.shared.bonnarotec.toolslib.domain.services;

public enum ServicesEnum {
    REGISTRY("cfregistry"),
    STORAGE("cfstorage"),
    GATEWAY("cfgateway"),
    EMISSION("cfemission");

    private final String url;

    ServicesEnum(String url) {
        this.url = url;
    }
}
