package com.gs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.mapper.AdminMapper;
import com.gs.pojo.Admin;
import com.gs.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	
	public Admin checkLogin(String username, String password) {
		 Admin admin = adminMapper.findByUsername(username);
	        if(admin != null && admin.getPassword().equals(password)){
	        
	            return admin;
	        }
	        return null;
	}

}
