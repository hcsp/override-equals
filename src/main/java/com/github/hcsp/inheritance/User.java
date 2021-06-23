package com.github.hcsp.inheritance;

public class User<equals> {
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
        System.out.println(new User(1, "") == new User(1, ""));
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
        System.out.println(new User(1234, "").equals(new User(1234, "")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true
    @Override
    public boolean equals (Object user) {
        if (user == null) {
            return false;
        } else {
            return this.id.intValue() == ((User) user).id.intValue();
        }
    }
}