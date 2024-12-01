package br.com.contafacil.shared.bonnarotec.toolslib.domain.services;

public enum ServicesNameEnum {
    REGISTRY("cfregistry"),
    STORAGE("cfstorage"),
    GATEWAY("cfgateway"),
    EMISSION("cfemission");

    private final String name;

    ServicesNameEnum(String name) {
        this.name = name;
    }
}
