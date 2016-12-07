package com.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/editUser/{id}")
    public ModelAndView editUser(@PathVariable
        final int id)
    {
        final UserVO userVO = this.userDAO.findById(id);
        this.userDAO.createOrUpdate(userVO);
        return new ModelAndView("redirect:/listUsers");
    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable
        final int id)
    {
        this.userDAO.delete(id);
        return new ModelAndView("redirect:/listUsers");
    }

    /**
     * Methods of controller to prepare the object and to open the form
     */

    @RequestMapping("/createForm")
    public ModelAndView createForm(final Model model)
    {
        model.addAttribute("userForm", new UserVO());
        model.addAttribute("action", "saveUser");
        return new ModelAndView("users/formUser", "saveUser", model);
    }

    @RequestMapping(value = "/editForm/{id}")
    public ModelAndView editForm(@PathVariable
        final int id, final Model model)
    {
        final UserVO userVO = this.userDAO.findById(id);
        model.addAttribute("userForm", userVO);
        model.addAttribute("action", "../saveUser");
        return new ModelAndView("users/formUser", "../saveUser", model);
    }
}