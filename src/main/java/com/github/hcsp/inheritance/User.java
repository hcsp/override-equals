package com.github.hcsp.inheritance;

import java.util.Objects;

public class User {
    private Integer id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
// 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true

}
