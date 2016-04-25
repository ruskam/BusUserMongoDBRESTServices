package com.buser.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Rusta Kamberov on 25/04/16.
 */

@SuppressWarnings("serial")
@Document(collection = "person")
public class Person {

    @Id
    private String id;

    private String username;
    private String firstName;
    private String lastName;

    //@GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
    private GeoJsonPoint location;

    public Person(){

    }

    public Person(String username, String firstName, String lastName, GeoJsonPoint location) {
        super();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public GeoJsonPoint getLocation() {
        return location;
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}