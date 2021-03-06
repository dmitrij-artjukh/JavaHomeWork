package com.pb.artjukh.hm7;

public enum Size {
    XXS("Детский", 32),
    XS("Взрослый",34),
    S("Взрослый",36),
    M("Взрослый",38),
    L("Взрослый",40);
private String description;
private Integer euroSize;

    Size(String description, Integer euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public Integer getEuroSize() {
        return euroSize;
    }

}
