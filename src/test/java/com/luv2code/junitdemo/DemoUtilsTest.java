package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
class DemoUtilsTest {

    DemoUtils demoUtils = null;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach\n");
    }

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Before all executes once before all test methods execution in the class");
    }

    @AfterAll
    static void setUpAfterAll() {
        System.out.println("After all executes once after all the test methods execution in the class");
    }

    //    @DisplayName("Equals and Not Equals")
    @Test
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");
        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(5, demoUtils.add(2, 4), "2 + 4 must be 6");
    }

    //    @DisplayName("Null and Not NUll")
    @Test
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");
        String str1 = null;
        String str2 = "dennis";

        assertNull(demoUtils.checkNull(str1), "str1 is null");
        assertNotNull(demoUtils.checkNull(str2), "str2 is not null");
    }

}