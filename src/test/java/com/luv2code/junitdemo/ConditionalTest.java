package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {
    @Test
    @Disabled("Do not run untill JIRA #123 is resolved")
    void basicTest() {
        //execute
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {

    }


    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void testForWindowsAndMac() {

    }


    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnlyForJava17() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testOnlyForJava13() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_18)
    void testOnlyForJavaRange() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13)
    void testForJavaRangeMin() {

    }

    @Test
    @EnabledIfSystemProperty(named = "DENNIS_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "DENNIS_ENV", matches = "DEV")
    void testOnlyForDevEnviroment() {

    }
}
