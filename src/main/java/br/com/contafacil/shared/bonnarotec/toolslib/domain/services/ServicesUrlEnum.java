package br.com.contafacil.shared.bonnarotec.toolslib.domain.services;

public enum ServicesUrlEnum {
    REGISTRY("http://cfregistry:8004"),
    STORAGE("http://cfstorage:8002"),
    GATEWAY("http://cfgateway:8000"),
    EMISSION("http://cfemission:8001");

    private final String url;

    ServicesUrlEnum(String url) {
        this.url = url;
    }
}
