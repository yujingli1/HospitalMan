package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Checks;

import java.util.HashMap;

public interface CheckService {
    HashMap<String, Object> findAllChecks(int pageNumber, int size, String query);
    Checks findCheck(int chId);
    Boolean addCheck(Checks checks);
    Boolean deleteCheck(int chId);
    Boolean modifyCheck(Checks checks);
}