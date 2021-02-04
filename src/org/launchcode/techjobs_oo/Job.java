package org.launchcode.techjobs_oo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
        if(this.getEmployer() != null && this.getLocation() != null && this.getPositionType() != null && this.getCoreCompetency() != null) {
            String[] names = {"Name", "Employer", "Location", "Position Type", "Core Competency"};
            String[] values = { this.name, this.employer.toString(), this.location.toString(), this.positionType.toString(), this.coreCompetency.toString() };

            String output = "\nID: " + this.id + "\n";
            String emptyString = "Data not available";
            for (int i = 0; i < names.length; i++) {
                String value = values[i]==null || values[i].isBlank()?emptyString:values[i];
                output += names[i] + ": " + value + "\n";
            }
            output += "\n";
            return output;
        } else {
            return "OOPS! This job does not seem to exist.";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
