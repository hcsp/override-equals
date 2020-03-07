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

    // 如果参数类型填User，此时无法使用Override注解，因为参数类型变了，此时相当于另写了一个equals方法，而没有覆盖Object.equals()
    @Override
    public boolean equals(Object anotherUser){
//        // 需要考虑null并做类型判断
//        if(anotherUser == null){
//            return false;
//        }
//        else if (this.getClass() != anotherUser.getClass()) {
//            return false;
//        }
//        return this.id.equals(((User)anotherUser).id);

        // 更好的写法
        if(anotherUser instanceof User) {
            return this.id.equals(((User) anotherUser).id);
        }
        return false;
    }

    // 重写equals方法也需要重写hashcode方法，确保相同的对象具有相同的散列码
    @Override
    public int hashCode(){
        return id.hashCode() + name.hashCode();
    }
}
