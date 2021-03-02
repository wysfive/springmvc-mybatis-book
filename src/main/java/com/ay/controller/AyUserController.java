package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class AyUserController {
    @Resource
    private AyUserService ayUserService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<AyUser> ayUserList = ayUserService.findAll();
        for (AyUser ayUser : ayUserList) {
            System.out.println("id : "+ayUser.getId());
            System.out.println("name : "+ayUser.getName());
        }
        return "hello";
    }
}
