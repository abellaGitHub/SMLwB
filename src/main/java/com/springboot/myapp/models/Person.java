package com.springboot.myapp.models;

import javax.persistence.*;

/**
 * Created by abella on 2017-07-03.
 */

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue
    private Long personId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "STATUS")
    private String status;

    public Person() {}

    public Person(String firstName, String lastName, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
