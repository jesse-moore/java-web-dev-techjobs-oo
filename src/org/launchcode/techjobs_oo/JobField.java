package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private String value;
    private static int nextId = 1;

    public JobField() {
        value = "Data not available";
        id = nextId;
        nextId++;
     }

    public JobField(String value) {
        this();
        if(value != null && !value.isBlank()) this.value = value;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
