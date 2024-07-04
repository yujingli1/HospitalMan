package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Bed;

import java.util.HashMap;
import java.util.List;

public interface BedService {
    List<Bed> findNullBed();
    Boolean updateBed(Bed bed);
    List<Bed> findBedByPid(int pId);
    HashMap<String, Object> findAllBeds(int pageNumber, int size, String query);
    Bed findBed(int bId);
    Boolean addBed(Bed bed);
    Boolean deleteBed(int bId);
    Boolean emptyBed(int bId);
    int bedPeople(String bStart);
}