
package com.gs.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gs.pojo.User;
import com.gs.service.UserService;
import com.gs.util.Page;
import org.springframework.web.util.HtmlUtils;


@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;
 
    @RequestMapping("admin_user_list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());

        List<User> us= userService.list();

        int total = (int) new PageInfo<>(us).getTotal();
        page.setTotal(total);

        model.addAttribute("us", us);
        model.addAttribute("page", page);

        return "admin/listUser";
    }

    @RequestMapping("updateUserMsg")
    public String updateUserMsg(User user){
        Date day=new Date();
        java.sql.Date loginDate = new java.sql.Date(day.getTime());
        user.setFailureNum(0);
        user.setLockFlag("0");
        user.setLoginDate(loginDate);
        userService.updateUserMsg(user);
        return "redirect:userMsgChangeSuccessPage";
    }

}
