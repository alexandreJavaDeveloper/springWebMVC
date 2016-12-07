package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.spring.vo.UserVO;

@Component("userDAO")
public class UserDAO
{
    private final Map<Integer, UserVO> mapUser;

    private int currentKey;

    public UserDAO()
    {
        this.mapUser = new HashMap<>();
        this.fillListUser();
    }

    @SuppressWarnings("boxing")
    private void fillListUser()
    {
        this.mapUser.put(1, new UserVO(this.getNextKey(), "Alexandre Silva", 26));
        this.mapUser.put(2, new UserVO(this.getNextKey(), "Carlos Martins", 33));
        this.mapUser.put(3, new UserVO(this.getNextKey(), "Jose Dalla Riva", 16));
        this.mapUser.put(4, new UserVO(this.getNextKey(), "Marcelo Rodrigues", 46));
        this.mapUser.put(5, new UserVO(this.getNextKey(), "Ronilda da Silva", 20));
    }

    public List<UserVO> getListUser()
    {
        return this.mapUser.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
    }

    @SuppressWarnings("boxing")
    public void createOrUpdate(final UserVO userVO)
    {
        if (this.mapUser.containsKey(userVO.getId()))
            this.mapUser.put(userVO.getId(), userVO);// update
        else
        {
            userVO.setId(this.getNextKey());
            this.mapUser.put(userVO.getId(), userVO); // new
        }
    }

    private int getNextKey()
    {
        return ++this.currentKey;
    }

    @SuppressWarnings("boxing")
    public void delete(final int id)
    {
        this.mapUser.remove(id);
    }

    @SuppressWarnings("boxing")
    public UserVO findById(final int id)
    {
        return this.mapUser.get(id);
    }
}