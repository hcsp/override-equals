package com.github.hcsp.inheritance;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class User{
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
    public boolean equals(Object Object){
            if(Object instanceof User) {
                User O = (User) Object;
                if (this.id.equals(O.id)) {
                    return true;
                } else {
                    return false;
                }
            }else{
                return false;
            }
    }

    public static void main(String[] args) {
        System.out.println(new User(1, "user1") == new User(1, "user1"));
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true

}
