package com.github.hcsp.inheritance;

import java.util.Objects;

public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new User(1, "user1") == new User(1, "user1"));
        System.out.println(new User(2, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true
    @Override
    public boolean equals(Object o) {
        //如果这个User对象等于o 返回true
        if (this == o) return true;
        //判断这个对象是否符合条件
        if (o == null || getClass()!=o.getClass())return  false;
       //把o赋值给user
        User user= (User)o;
        //参数对比
        return Objects.equals(id,user.id)&& Objects.equals(name,user.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
