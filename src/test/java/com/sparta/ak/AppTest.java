package com.sparta.ak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Check 6 returns \"Good morning!\"")
    public void goodMorningTest() {
        Assertions.assertEquals("Good morning!",App.getGreeting(6));
    }

    @Test
    @DisplayName("Check 14 returns \"Good afternoon!\"")
    public void goodAfternoonTest() {
        Assertions.assertEquals("Good afternoon!",App.getGreeting(14));
    }

    @Test
    @DisplayName("Check 20 returns \"Good evening!\"")
    public void goodEveningTest() {
        Assertions.assertEquals("Good evening!", App.getGreeting(20));
    }

    @Test
    @DisplayName("Check 12 returns \"Good afternoon!\"")
    public void boundaryMorningTest() {
        Assertions.assertEquals("Good afternoon!",App.getGreeting(12));
    }

    @Test
    @DisplayName("Check 18 returns \"Good evening!\"")
    public void boundaryAfternoonTest() {
        Assertions.assertEquals("Good evening!",App.getGreeting(18));
    }
}
