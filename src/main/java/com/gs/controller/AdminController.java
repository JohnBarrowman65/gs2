package com.gs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gs.pojo.Admin;
import com.gs.service.AdminService;

@Controller
@RequestMapping("")
@SessionAttributes("admin")
public class AdminController {
    
    @Autowired
    private AdminService adminService;
    
    
    //正常访问login页面
    @RequestMapping("/glLogin")
    public String login(){
        return "include/glLogin";
    }
    
    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(Admin admin,Model model){
        //调用service方法
    	admin = adminService.checkLogin(admin.getUsername(), admin.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(admin != null){
            model.addAttribute("admin",admin);
            return "include/success";
        }
        return "include/glLogin";
    }
    
  
    

}