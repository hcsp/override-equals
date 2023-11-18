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

    @Override
    public boolean equals(Object obj){
        if (obj instanceof User)  //避免出现空指针问题，同时getID()返回一个类
            return ((User)obj).getId().equals(id) && ((User)obj).getName().equals(name) ;
        return false;
    }



    public static void main(String[] args) {
        System.out.println(new User(1, "user1") == new User(1, "user1"));
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
        System.out.println(new User(1, "").equals(new User(2, "")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true

}
