package com.github.hcsp.inheritance;

import com.github.hcsp.test.helper.ProjectSourceFileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void test() {
        Assertions.assertEquals(new User(1, ""), new User(1, ""));
        Assertions.assertNotEquals(new User(1, ""), new User(2, ""));
        Assertions.assertFalse(new User(1, "").equals(null));
    }

    @Test
    public void hasOverride() {
        Assertions.assertTrue(
                ProjectSourceFileReader.readAsString(User.class).contains("@Override"));
    }
}
