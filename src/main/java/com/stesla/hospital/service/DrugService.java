package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Drug;

import java.util.HashMap;

public interface DrugService {
    HashMap<String, Object> findAllDrugs(int pageNumber, int size, String query);
    Drug findDrug(int drId);
    Boolean reduceDrugNumber(int drId, int usedNumber);
    Boolean addDrug(Drug drug);
    Boolean deleteDrug(int drId);
    Boolean modifyDrug(Drug drug);
}