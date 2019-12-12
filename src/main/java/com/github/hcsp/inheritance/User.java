package com.github.hcsp.inheritance;

public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
    	if(id <= 127) {
    		this.id = id;
    	    this.name = name;
    	}else {
    		this.id = 127;
    		this.name = name;
    	}
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
    public boolean equals(Object user) {
    	if(user == null)return false;
    	
    	if(this.id == ((User)user).getId()) {
    		return true;
    	}return false;	
    }
}
