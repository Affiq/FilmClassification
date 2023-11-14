package com.sparta.ak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationsTest {

    @ParameterizedTest
    @ValueSource(ints ={7, 9, 11})
    @DisplayName("Test Below 12 returns \"U & PG films are available.\"")
    public void testBelow12(int age) {
        String expectedResult = "U & PG films are available.";
        Assertions.assertEquals(expectedResult, FilmClassifications.getClassification(age));
    }
    // Also covers boundary test for 12.
    @ParameterizedTest
    @ValueSource(ints ={12,13,14})
    @DisplayName("Test Below 15 returns \"U, PG & 12 films are available.\"")
    public void testBelow15(int age) {
        String expectedResult = "U, PG & 12 films are available.";
        Assertions.assertEquals(expectedResult, FilmClassifications.getClassification(age));
    }

    // Also covers boundary test for 15.
    @ParameterizedTest
    @ValueSource(ints ={15,16,17})
    @DisplayName("Test below 18 returns \"U, PG, 12 & 15 films are available.\"")
    public void testBelow18(int age) {
        String expectedResult = "U, PG, 12 & 15 films are available.";
        Assertions.assertEquals(expectedResult, FilmClassifications.getClassification(age));
    }

    // Also covers boundary test for 18.
    @ParameterizedTest
    @ValueSource(ints ={18,25,86})
    @DisplayName("Test 18 and above returns \"All films are available.\"")
    public void test18AndAbove(int age) {
        String expectedResult = "All films are available.";
        Assertions.assertEquals(expectedResult, FilmClassifications.getClassification(age));
    }

}
