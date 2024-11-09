package com.amalitech.models;

import java.util.Objects;

public sealed class ProductBase permits Electronic, Clothing {
    private final String name;
    private final String description;

    public ProductBase(String name, String description) {
        this.name = Objects.requireNonNull(name);
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
