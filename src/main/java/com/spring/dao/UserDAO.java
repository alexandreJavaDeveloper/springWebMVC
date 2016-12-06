package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.vo.UserVO;

@Component("userDAO")
public class UserDAO
{
    private final List<UserVO> listUser;

    public UserDAO()
    {
        this.listUser = new ArrayList<>();
        this.fillListUser();
    }

    private void fillListUser()
    {
        this.listUser.add(new UserVO("Alexandre Silva", 26));
        this.listUser.add(new UserVO("Carlos Martins", 33));
        this.listUser.add(new UserVO("Jose Dalla Riva", 16));
        this.listUser.add(new UserVO("Marcelo Rodrigues", 46));
        this.listUser.add(new UserVO("Ronilda da Silva", 20));
    }

    public List<UserVO> getListUsers()
    {
        return this.listUser;
    }
}