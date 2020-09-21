package org.launchcode.techjobs_oo;

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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the

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

    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString(){


        String idString = "ID: " + this.id + "\n";

        String nameString;

        String employerString;

        String locationString;

        String positionTypeString;

        String coreCompetencyString;

        if (this.name == ""){
            nameString = "Name: Data not available\n";
        }else {
            nameString = "Name: " + this.name + "\n";
        }

        if (this.employer.getValue() == ""){
            employerString = "Employer: Data not available\n";
        }else {
            employerString = "Employer: " + this.employer.getValue() + "\n";
        }

        if (this.location.getValue() == ""){
            locationString = "Location: Data not available\n";
        }else {
            locationString = "Location: " + this.location.getValue() + "\n";
        }

        if (this.positionType.getValue() == ""){
            positionTypeString = "Position Type: Data not available\n";
        }else {
            positionTypeString = "Position Type: " + this.positionType.getValue() + "\n";
        }

        if (this.coreCompetency.getValue() == ""){
            coreCompetencyString = "Core Competency: Data not available\n";
        }else {
            coreCompetencyString = "Core Competency: " + this.coreCompetency.getValue() + "\n";
        }

        return idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
    }
}
