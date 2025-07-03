# S3-Java-Misterm  

# 💊 Pharmacy Medication Tracking System

## 📋 Overview

This Java console-based application simulates a **Pharmacy Medication Tracking System** that manages the relationships between **patients**, **doctors**, **medications**, and **prescriptions**. It is built using **object-oriented programming (OOP)** principles and allows for interaction via a simple CLI (command-line interface).

This project is designed for educational purposes, with modular Java classes and a scanner-based menu system that supports multiple functionalities like adding new entities, restocking inventory, checking for expired medications, and generating reports.

---

## 🏗️ Project Structure

The code is organized into the `medicationtracking` package and includes the following classes:

### 📦 Classes

- **Person.java** – A superclass for shared attributes between patients and doctors.
- **Patient.java** – Represents a patient and holds a list of prescriptions.
- **Doctor.java** – Represents a doctor with a list of patients and a specialization.
- **Medication.java** – Contains details about a medication including name, dosage, quantity, and expiry.
- **Prescription.java** – Connects a doctor, patient, and medication, with an expiry date (default: 1 year from issue).
- **MedicationTracking.java** – The central manager class that handles all entities and provides system-wide functionality.
- **EmptyMenu.java** – Contains the CLI menu logic and acts as the program's entry point.

---

## ▶️ How to Run

1. **Compile** all files from the root directory (one level above the `medicationtracking` folder):

   ```bash
   javac medicationtracking/*.java

   
