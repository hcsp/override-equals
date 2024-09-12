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
    public boolean equals(Object obj) {
        // 首先检查是否为同一个对象
        if (this == obj) {
            return true;
        }
        // 检查对象是否为User类型
        if (obj instanceof User) {
            // 将 obj 对象转换为 User 类型。
            User other = (User) obj;
            // 比较两个User的id是否相同
            return this.id != null && this.id.equals(other.id);
        }
        // 如果对象类型不同，返回false
        return false;
    }

}
