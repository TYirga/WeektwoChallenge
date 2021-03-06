package com.example.demo;


import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Resume {

    private long id;
    @Size(min=1)

    private String lastname;

    @Size(min=1)
    private String firstname;

    private String skil;
    @Size(min=6, max=1000)
    //VARIABLES FOR EDUCATION
    private String education;
private String major;
private String universityName;
private String graduatedYear;
private String educationLevel;
//VARIABLES FOR EXPERIANCE
    String position;
    String companyName;
    String startingDate;
    String endingDate;
    String duties;

    public String getSkillsName() {
        return skillsName;
    }

    public void setSkillsName(String skillsName) {
        this.skillsName = skillsName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    //Variables for experiance
    String skillsName;
    String rating;
    public String getSkil() {
        return skil;
    }

    public void setSkil(String skil) {
        this.skil = skil;
    }

    private String education2;
    private String education3;
    @Size(min=4)
    private String email;

    @Size(min=5, max=100)
    private String skills;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGraduatedYear() {
        return graduatedYear;
    }

    public void setGraduatedYear(String graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }
}