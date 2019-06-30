package io.zipcoder;

public class Pet {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String speak(){return "PET"; }

    public String name(){return this.name=name;}
}
