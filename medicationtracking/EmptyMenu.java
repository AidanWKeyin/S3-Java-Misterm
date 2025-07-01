package medicationtracking;

import java.util.Scanner;

public class EmptyMenu {
    public static void main(String[] args) {
        MedicationTrackingSystem medicationTracking = new MedicationTrackingSystem();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit){
            System.out.println("=====Welcome To The Pharmacy Med Tracking System=====");
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
                    // TODO: implement add patient
                    break;
                case 2:
                    // TODO: implement add doctor
                    break;
                case 3:
                    // TODO: implement add medication
                    break;
                case 4:
                    medicationTracking.generateReport();
                    break;
                case 5:
                    medicationTracking.checkExpiredMedications();
                    break;
                case 6:
                    // TODO: implement process prescription
                    break;
                case 7:
                    System.out.print("Enter doctor name: ");
                    String docName = scanner.nextLine();
                    medicationTracking.printPrescriptionsByDoctor(docName);
                    break;
                case 8:
                    medicationTracking.restockMedications();
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
