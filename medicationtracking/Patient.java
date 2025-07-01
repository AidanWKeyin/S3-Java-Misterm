package medicationtracking;

import java.util.*;

public class Patient extends Person {
    private List<Prescription> prescriptions = new ArrayList<>();

    public Patient(int id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
    }

    public void addPrescription(Prescription p) {
        prescriptions.add(p);
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }
}
