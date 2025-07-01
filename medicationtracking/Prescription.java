package medicationtracking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prescription {
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate expiryDate;

    public Prescription(int id, Doctor doctor, Patient patient, Medication medication) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.expiryDate = LocalDate.now().plus(1, ChronoUnit.YEARS);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

