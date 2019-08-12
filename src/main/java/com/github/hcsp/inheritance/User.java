package com.github.hcsp.inheritance;

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
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return id.equals(user.getId());
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        return result * 31;
    }
}
