package com.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.dao.UserDAO;

@Controller
public class UserController
{
    @Resource(name = "userDAO")
    private UserDAO userDAO;

    @GetMapping("/listUsers")
    public String listUsers(final Model model)
    {
        model.addAttribute("name", "Alexandre Silva");
        model.addAttribute("listUser", this.userDAO.getListUsers());
        return "users/listUsers";
    }
}