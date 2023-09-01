package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(5, demoUtils.add(2, 4), "2 + 4 must be 6");
    }

    @Test
    void testNullAndNotNull() {
        DemoUtils demoUtils = new DemoUtils();
        String str1 = null;
        String str2 = "dennis";

        assertNull(demoUtils.checkNull(str1), "str1 is null");
        assertNotNull(demoUtils.checkNull(str2), "str2 is not null");
    }

}