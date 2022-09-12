/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }
    @Test (timeout = 10)
    public void testLinSanfo() {
        String expected = "Hey! My name is Sanford! I like dogs more than cats! What am I doing here?";
        String actual = IntroLab.linSanfo();
        assertEquals(expected, actual);
    }
}