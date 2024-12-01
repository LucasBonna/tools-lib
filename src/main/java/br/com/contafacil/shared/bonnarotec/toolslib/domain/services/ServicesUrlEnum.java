package br.com.contafacil.shared.bonnarotec.toolslib.domain.services;

public enum ServicesUrlEnum {
    REGISTRY("http://cfregistry:8004/cfregistry"),
    STORAGE("http://cfstorage:8002/cfstorage"),
    EMISSION("http://cfemission:8001/cfemission");

    private final String url;

    ServicesUrlEnum(String url) {
        this.url = url;
    }
}
