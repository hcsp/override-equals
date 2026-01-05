package com.github.hcsp.inheritance;

import java.util.Objects;

public class User {
    private Integer id;    // 成员变量
    private String name;

    public User(Integer id, String name) {   // 构造器
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    public static void main(String[] args) {
        System.out.println(new User(1, "user1") == new User(1, "user1"));
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true

}
