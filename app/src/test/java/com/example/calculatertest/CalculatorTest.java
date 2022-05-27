package com.example.calculatertest;

import junit.framework.TestCase;
import junit.framework.TestFailure;

public class CalculatorTest extends TestCase {
    public void testAdd(){
        calcuator calculatorIns = new calcuator();
        int expexted =30;
        int actual=calcuator.add(10,20);
        assertEquals(expexted,actual);
    }
}
