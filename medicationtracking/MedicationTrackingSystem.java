package medicationtracking;

import java.util.*;

public class MedicationTrackingSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Medication> medications = new ArrayList<>();
    private List<Prescription> prescriptions = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addMedication(Medication m) {
        medications.add(m);
    }

    public void acceptPrescription(Prescription p) {
        prescriptions.add(p);
        p.getPatient().addPrescription(p);
    }

    public void generateReport() {
        System.out.println("=== System Report ===");
        System.out.println("Patients: " + patients.size());
        System.out.println("Doctors: " + doctors.size());
        System.out.println("Medications: " + medications.size());
        System.out.println("Prescriptions: " + prescriptions.size());
    }

    public void checkExpiredMedications() {
        for (Medication m : medications) {
            if (m.isExpired()) {
                System.out.println("Expired Medication: " + m.getName() + " | Expired: " + m.getExpiryDate());
            }
        }
    }

    public void printPrescriptionsByDoctor(String doctorName) {
        for (Prescription p : prescriptions) {
            if (p.getDoctor().name.equalsIgnoreCase(doctorName)) {
                System.out.println("Doctor: " + doctorName + " prescribed " + p.getMedication().getName());
            }
        }
    }

    public void restockMedications() {
        for (Medication m : medications) {
            m.restock((int) (Math.random() * 100));
        }
    }

    public void printPatientPrescriptions(String patientName) {
        for (Patient p : patients) {
            if (p.name.equalsIgnoreCase(patientName)) {
                for (Prescription pres : p.getPrescriptions()) {
                    System.out.println("Medication: " + pres.getMedication().getName());
                }
            }
        }
    }
}
