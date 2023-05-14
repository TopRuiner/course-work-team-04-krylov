package com.polyclinic.mis.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Пациент
 */
@Entity
@Data
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    //public PolyclinicUser PolyclinicUser

    //ТУт
    private String polisId;
    private String poilsCompany;
    private Date polisEndDate;
    //Тут
    private String  snilsNumber;
    private String homeAddress;
    private String workPlace;
    private String workPosition;
    @OneToOne
    private PolyclinicUser user;
//    @OneToMany
//    private List<Analysis> Analyses;
//    @OneToMany
//    private List<Examination> Examinations;
//    @OneToMany
//    private List<Inspection> Inspections;

    @Transient
    private String polisEndDateString;


    public Patient(String firstName, String lastName, String middleName, Date birthDate, String polisId, String poilsCompany, String snilsNumber, String homeAddress, String workPlace, String workPosition, Date polisEndDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.polisId = polisId;
        this.poilsCompany = poilsCompany;
        this.polisEndDate = polisEndDate;
        this.snilsNumber = snilsNumber;
        this.homeAddress = homeAddress;
        this.workPlace = workPlace;
        this.workPosition = workPosition;
    }
    public Patient(String firstName, String lastName, String middleName, Date birthDate, String polisId, String poilsCompany, String snilsNumber, String homeAddress, String workPlace, String workPosition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.polisId = polisId;
        this.poilsCompany = poilsCompany;
        this.snilsNumber = snilsNumber;
        this.homeAddress = homeAddress;
        this.workPlace = workPlace;
        this.workPosition = workPosition;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                ", polisId=" + polisId +
                ", poilsCompany='" + poilsCompany + '\'' +
                ", polisEndDate=" + polisEndDate +
                ", snilsNumber=" + snilsNumber +
                ", homeAddress='" + homeAddress + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", workPosition='" + workPosition + '\'' +
                ", user=" + user +
                '}';
    }

    public String ReturnBirthDate()
    {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(this.birthDate);
    }
    public String getFIOForRequest(){
        return lastName+"+"+firstName+"+"+middleName+"+";
    }
    public String getBirthDateForRequest(){
        String pattern = "yyyy+MM+dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(birthDate);
        return date;
    }
    public String ReturnPolisEndDate()
    {
            return this.polisEndDate.toString();
    }
    public String ReturnFIO()
    {
            return lastName + " " + firstName + " " + middleName;
    }
    public String ReturnFIOAndBirthDate()
    {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return lastName + " " + firstName + " " + middleName + " " + simpleDateFormat.format(this.birthDate);
    }
}
