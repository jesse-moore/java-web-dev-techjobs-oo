package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private boolean isInitialized;

    public Job() {
        id = nextId;
        name = "Data not available";
        isInitialized = false;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        if(name != null && !name.isBlank()) this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        isInitialized = true;
    }

    @Override
    public String toString(){
        if(!isInitialized) return "OOPS! This job does not seem to exist.";

        String output = "\nID: " + this.id + "\n";
        output += "Name" + ": " + this.name + "\n";
        output += "Employer" + ": " + this.getEmployer() + "\n";
        output += "Location" + ": " + this.getLocation() + "\n";
        output += "Position Type" + ": " + this.getPositionType() + "\n";
        output += "Core Competency" + ": " + this.getCoreCompetency() + "\n";
        output += "\n";
        return output;
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
