package com.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.UserDAO;
import com.spring.vo.UserVO;

@Controller
public class UserController
{
    @Resource(name = "userDAO")
    private UserDAO userDAO;

    @RequestMapping("/listUsers")
    public ModelAndView listUsers(final Model model)
    {
        System.out.println("\nListing users...");
        model.addAttribute("userForm", new UserVO());
        model.addAttribute("userNameLogged", "Alexandre da Silva");
        model.addAttribute("listUser", this.userDAO.getListUser());

        return new ModelAndView("users/listUsers", "command", model);
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute("userForm")
    final UserVO userVO)
    {
        this.userDAO.createOrUpdate(userVO);
        return new ModelAndView("redirect:/listUsers");
    }
}