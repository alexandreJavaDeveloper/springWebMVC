package com.spring.vo;

public class UserVO
{
    private Integer id;

    private String name;

    private int age;

    public UserVO()
    {
        // Do nothing
    }

    public UserVO(final Integer id, final String name, final int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(final Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return this.id;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAge(final int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }

    @Override
    public String toString()
    {
        return "Id: " + this.getId() + " - Name: " + this.getName() + " - Age: " + this.getAge();
    }
}