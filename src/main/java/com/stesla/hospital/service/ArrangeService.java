package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Arrange;

import java.util.List;

public interface ArrangeService {
    List<Arrange> findByTime(String arTime, String dSection);
    Boolean addArrange(Arrange arrange);
    Boolean deleteArrange(String arId);
}