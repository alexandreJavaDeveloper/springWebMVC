package com.spring.vo;

public class UserVO
{
    private final String name;

    private final int age;

    public UserVO(final String name, final int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}