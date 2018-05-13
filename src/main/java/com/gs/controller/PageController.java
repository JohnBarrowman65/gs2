
package com.gs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PageController {
    @RequestMapping("registerPage")
    public String registerPage() {
        return "fore/register";
    }
    @RequestMapping("registerSuccessPage")
    public String registerSuccessPage() {
        return "fore/registerSuccess";
    }
    @RequestMapping("loginPage")
    public String loginPage() {
        return "fore/login";
    }
    @RequestMapping("forealipay")
    public String alipay(){
        return "fore/alipay";
    }
    @RequestMapping("userMsgPage")
    public String userMsgPage(){return  "fore/userMsg";}
    @RequestMapping("userMsgChangeSuccessPage")
    public String userMsgChangeSuccessPage() {
        return "fore/userMsgChangeSuccessPage";
    }
}

