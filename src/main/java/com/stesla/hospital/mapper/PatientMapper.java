package com.stesla.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stesla.hospital.pojo.Patient;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper extends BaseMapper<Patient> {
    /**
     * 统计患者男女人数
     */
    Integer patientAge(@Param("startAge") int startAge, @Param("endAge") int endAge);
}
