package com.polyclinic.mis.models;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class DoctorReferral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String DiagnosisId;
    @ManyToOne
    private Diagnosis Diagnosis;
    private int DoctorIdInitial;
    @ManyToOne
    private Doctor DoctorInitial;
    private int PatientId;
    @ManyToOne
    private Patient Patient;
    private String Type;
    private int DoctorIdTarget;
    @ManyToOne
    private Doctor DoctorTarget;
    private String СabinetNum;
    private Date DateTime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDiagnosisId() {
        return DiagnosisId;
    }

    public void setDiagnosisId(String diagnosisId) {
        DiagnosisId = diagnosisId;
    }

    public com.polyclinic.mis.models.Diagnosis getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(com.polyclinic.mis.models.Diagnosis diagnosis) {
        Diagnosis = diagnosis;
    }

    public int getDoctorIdInitial() {
        return DoctorIdInitial;
    }

    public void setDoctorIdInitial(int doctorIdInitial) {
        DoctorIdInitial = doctorIdInitial;
    }

    public Doctor getDoctorInitial() {
        return DoctorInitial;
    }

    public void setDoctorInitial(Doctor doctorInitial) {
        DoctorInitial = doctorInitial;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
        PatientId = patientId;
    }

    public com.polyclinic.mis.models.Patient getPatient() {
        return Patient;
    }

    public void setPatient(com.polyclinic.mis.models.Patient patient) {
        Patient = patient;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getDoctorIdTarget() {
        return DoctorIdTarget;
    }

    public void setDoctorIdTarget(int doctorIdTarget) {
        DoctorIdTarget = doctorIdTarget;
    }

    public Doctor getDoctorTarget() {
        return DoctorTarget;
    }

    public void setDoctorTarget(Doctor doctorTarget) {
        DoctorTarget = doctorTarget;
    }

    public String getСabinetNum() {
        return СabinetNum;
    }

    public void setСabinetNum(String сabinetNum) {
        СabinetNum = сabinetNum;
    }

    public Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(Date dateTime) {
        DateTime = dateTime;
    }
}
