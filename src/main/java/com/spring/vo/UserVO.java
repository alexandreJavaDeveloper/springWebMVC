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
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.age;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final UserVO other = (UserVO) obj;
        if (this.age != other.age)
            return false;
        if (this.id == null)
        {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Id: " + this.getId() + " - Name: " + this.getName() + " - Age: " + this.getAge();
    }
}