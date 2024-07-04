package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Patient;
import java.util.HashMap;
import java.util.List;

public interface PatientService {
    Boolean addPatient(Patient patient);
    Boolean deletePatient(int pId);
    Patient login(int pId, String pPassword);
    HashMap<String, Object> findAllPatients(int pageNumber, int size, String query);
    Patient findPatientById(int pId);
    List<Integer> patientAge();
}