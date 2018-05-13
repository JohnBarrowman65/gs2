package com.gs.service;

import com.gs.pojo.Admin;

public interface AdminService {
	Admin checkLogin(String username,String password);
}
