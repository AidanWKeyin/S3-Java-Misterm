package medicationtracking;

import java.time.LocalDate;
import java.util.Scanner;

public class EmptyMenu {
    public static void main(String[] args) {
        MedicationTrackingSystem medicationTracking = new MedicationTrackingSystem();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("===== Welcome To The Pharmacy Med Tracking System =====");
            System.out.println("What would you like to do? ");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Add A New Doctor");
            System.out.println("3: Add A New Medication To The Pharmacy");
            System.out.println("4: Print System Report");
            System.out.println("5: Check If Meds Are Expired");
            System.out.println("6: Process A New Prescription");
            System.out.println("7: Print All Scripts For Specific Doctor");
            System.out.println("8: Restock the drugs in the pharmacy");
            System.out.println("9: Print All Scripts For Specific Patient");
            System.out.println("10: Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int pid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter patient name: ");
                    String pname = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int page = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String pphone = scanner.nextLine();
                    medicationTracking.addPatient(new Patient(pid, pname, page, pphone));
                    break;
                case 2:
                    System.out.print("Enter doctor ID: ");
                    int did = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter doctor name: ");
                    String dname = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int dage = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String dphone = scanner.nextLine();
                    System.out.print("Enter specialization: ");
                    String spec = scanner.nextLine();
                    medicationTracking.addDoctor(new Doctor(did, dname, dage, dphone, spec));
                    break;
                case 3:
                    System.out.print("Enter med ID: ");
                    int mid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter med name: ");
                    String mname = scanner.nextLine();
                    System.out.print("Enter dose: ");
                    String dose = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiry (YYYY-MM-DD): ");
                    LocalDate exp = LocalDate.parse(scanner.nextLine());
                    medicationTracking.addMedication(new Medication(mid, mname, dose, qty, exp));
                    break;
                case 4:
                    medicationTracking.generateReport();
                    break;
                case 5:
                    medicationTracking.checkExpiredMedications();
                    break;
                case 6:
                    System.out.print("Enter prescription ID: ");
                    int presId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter doctor name: ");
                    String drName = scanner.nextLine();
                    System.out.print("Enter patient name: ");
                    String ptName = scanner.nextLine();
                    System.out.print("Enter medication name: ");
                    String medName = scanner.nextLine();
                    Doctor doctor = medicationTracking.findDoctorByName(drName);
                    Patient patient = medicationTracking.findPatientByName(ptName);
                    Medication medication = medicationTracking.findMedicationByName(medName);
                    if (doctor != null && patient != null && medication != null) {
                        Prescription p = new Prescription(presId, doctor, patient, medication);
                        medicationTracking.acceptPrescription(p);
                        System.out.println("Prescription added successfully.");
                    } else {
                        System.out.println("Doctor, patient or medication not found.");
                    }
                    break;
                case 7:
                    System.out.print("Enter doctor name: ");
                    String docName = scanner.nextLine();
                    medicationTracking.printPrescriptionsByDoctor(docName);
                    break;
                case 8:
                    medicationTracking.restockMedications();
                    System.out.println("All medications restocked.");
                    break;
                case 9:
                    System.out.print("Enter patient name: ");
                    String patName = scanner.nextLine();
                    medicationTracking.printPatientPrescriptions(patName);
                    break;
                case 10:
                    exit = true;
                    System.out.println("Exiting The System! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}