package com.pb.psenychko.hw7;

public enum Size {
    XXS("Child size",32),
    XS("Adult size",34),
    S("Adult size",36),
    M("Adult size",38),
    L("Adult size",40);

    private final String description;
    private final int euroSize;

    Size(String description,int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this.name() == "XXS") {
            return "Child size";
        } else {
            return "Adult size";
        }
    }

    public int getEuroSize() {
        switch (this.name()) {
            case "XXS": return 32;
            case "XS": return 34;
            case "S": return 36;
            case "M": return 38;
            default: return 40;
        }
    }
}
