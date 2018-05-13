package com.gs.mapper;

import com.gs.pojo.Admin;

public interface AdminMapper {
	Admin findByUsername(String username);
}
