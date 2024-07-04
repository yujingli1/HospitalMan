package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Admin;

public interface AdminService {
    Admin login(int aId, String aPassword);
}