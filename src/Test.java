package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getaFloat1() {
        float course = 70.06f;
        Float a = new Float("0.70059997");
        Float b = Main.getaFloat1(course,(float)100);
        assertEquals(a,b);
    }

    @Test
    public void getaFloat() {
        float course = 70.06f;
        Float a = new Float("1.4273479874393");
        Float b = Main.getaFloat(course,(float)100);
        assertEquals(a,b);
    }
}