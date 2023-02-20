package com.polyclinic.mis.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private Date BirthDate;
    private String PolyclinicUserID;
    //public PolyclinicUser PolyclinicUser;
    private String Speciality;
    private String Category;
    private String Degree;
    public String ReturnDateForDisplay()
    {
            return this.BirthDate.toString();
    }
    public String ReturnFIO()
    {
            return LastName + " " + FirstName + " " + MiddleName;
    }
    public String ReturnFIOAndSpeciality()
    {
            return LastName + " " + FirstName + " " + MiddleName + " (" + Speciality + ")";
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getPolyclinicUserID() {
        return PolyclinicUserID;
    }

    public void setPolyclinicUserID(String polyclinicUserID) {
        PolyclinicUserID = polyclinicUserID;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }
}
