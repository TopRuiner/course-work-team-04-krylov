package com.polyclinic.mis.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private Date BirthDate;
    private String PolyclinicUserID;
    //public PolyclinicUser PolyclinicUser
    private int PolisID;
    private String PoilsCompany;
    private Date PolisEndDate;
    private int SnilsNumber;
    private String WorkPlace;
    @OneToMany
    private List<Analysis> Analyses;
    //public List<Examination> Examinations;
    //public List<Inspection> Inspections;
    public String ReturnBirthDateForDisplay()
    {
            return this.BirthDate.toString();
    }
    public String ReturnPolisEndDateForDisplay()
    {
            return this.PolisEndDate.toString();
    }
    public String ReturnFIO()
    {
            return LastName + " " + FirstName + " " + MiddleName;
    }
    public String ReturnFIOAndBirthDate()
    {
            return LastName + " " + FirstName + " " + MiddleName + " " + this.BirthDate.toString();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
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

    public int getPolisID() {
        return PolisID;
    }

    public void setPolisID(int polisID) {
        PolisID = polisID;
    }

    public String getPoilsCompany() {
        return PoilsCompany;
    }

    public void setPoilsCompany(String poilsCompany) {
        PoilsCompany = poilsCompany;
    }

    public Date getPolisEndDate() {
        return PolisEndDate;
    }

    public void setPolisEndDate(Date polisEndDate) {
        PolisEndDate = polisEndDate;
    }

    public int getSnilsNumber() {
        return SnilsNumber;
    }

    public void setSnilsNumber(int snilsNumber) {
        SnilsNumber = snilsNumber;
    }

    public String getWorkPlace() {
        return WorkPlace;
    }

    public void setWorkPlace(String workPlace) {
        WorkPlace = workPlace;
    }

    public List<Analysis> getAnalyses() {
        return Analyses;
    }

    public void setAnalyses(List<Analysis> analyses) {
        Analyses = analyses;
    }
}
