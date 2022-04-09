package com.ramazankayis.controller;

import com.ramazankayis.dao.AdminDao;
import com.ramazankayis.dao.IDaoConnection;
import com.ramazankayis.dto.AdminDto;

import java.util.ArrayList;

public class AdminController implements IDaoConnection<AdminDto> {
    AdminDao adminDao;
    public AdminController() {
        adminDao=new AdminDao();
    }

    @Override
    public void create(AdminDto adminDto) {
        adminDao.create(adminDto);
    }

    @Override
    public void delete(AdminDto adminDto) {
        adminDao.delete(adminDto);
    }

    @Override
    public void update(AdminDto adminDto) {
        adminDao.update(adminDto);
    }

    @Override
    public ArrayList<AdminDto> list() {
        return adminDao.list();
    }
}
