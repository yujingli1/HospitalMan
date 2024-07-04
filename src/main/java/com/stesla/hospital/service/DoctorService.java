package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Doctor;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface DoctorService {
    Doctor login(int dId, String dPassword);
    HashMap<String, Object> findAllDoctors(int pageNumber, int size, String query);
    Doctor findDoctor(int dId);
    Boolean addDoctor(Doctor doctor);
    Boolean deleteDoctor(int dId);
    Boolean modifyDoctor(Doctor doctor);
    HashMap<String, Object> findDoctorBySection(String dSection);
    HashMap<String, Object> findDoctorBySectionPage(int pageNumber, int size, String query, String arrangeDate, String dSection);
    Boolean updateStar(int dId, Double dStar);
    Boolean uploadExcel(MultipartFile multipartFile) throws Exception;
    Boolean downloadExcel(HttpServletResponse response) throws IOException, IOException;
    List<Doctor> findAll();
}