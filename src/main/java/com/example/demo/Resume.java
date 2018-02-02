package com.example.demo;


import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Resume {

    private long id;

    private String lastname;


    private String firstname;


    @Size(min=7, max=100)
    private String education;

private String education2;
private String education3;
    private String email;

    @Size(min=7, max=100)
    private String skills;
private String skiills2;
private String skills3;
    @Size(min=7, max=500)
    private String experiance;
private String experiance2;
private String experiance3;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

    public String getEducation2() {
        return education2;
    }

    public void setEducation2(String education2) {
        this.education2 = education2;
    }

    public String getEducation3() {
        return education3;
    }

    public void setEducation3(String education3) {
        this.education3 = education3;
    }

    public String getSkiills2() {
        return skiills2;
    }

    public void setSkiills2(String skiills2) {
        this.skiills2 = skiills2;
    }

    public String getSkills3() {
        return skills3;
    }

    public void setSkills3(String skills3) {
        this.skills3 = skills3;
    }

    public String getExperiance2() {
        return experiance2;
    }

    public void setExperiance2(String experiance2) {
        this.experiance2 = experiance2;
    }

    public String getExperiance3() {
        return experiance3;
    }

    public void setExperiance3(String experiance3) {
        this.experiance3 = experiance3;
    }
}