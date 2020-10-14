/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.ood.example2.test;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.solent.com504.ood.example2.SimpleMathClass;

/**
 *
 * @author cgallen
 */
public class SimpleMathClassTest {

    @Test
    public void testMain() {
        String[] args = {"add", "1.5", "300"};
        SimpleMathClass.main(args);
    }

    @Test
    public void testAdd() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.add(1.5, 300);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);
    }

    @Test
    public void testParseAdd() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();

        String[] args = {"add", "1.5", "300"};
        double result = simpleMathClass.parseArguments(args);

        // expected, result, delta (compare floating point numbers
        Assert.assertEquals(301.5, result, 0.00001);

    }

    // add tests for subtract, multiply, divide
     

    @Test
    public void testParseSubtract() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        String[] arg2 = {"subtract", "50", "30"};
        double result = simpleMathClass.parseArguments(arg2);
        Assert.assertEquals(20, result, 0.00001);
    }
    
        @Test
    public void testMultiply() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        double result = simpleMathClass.multiply(10, 30);       
        Assert.assertEquals(300, result, 0.00001);
    }

    @Test
    public void tesParseMultiply() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        String[] arg3 = {"multiply","10","30"};
        double result = simpleMathClass.parseArguments(arg3);
      Assert.assertEquals(300, result, 0);
    }

    @Test
    public void testParseDivide() {
        SimpleMathClass simpleMathClass = new SimpleMathClass();
        String[] arg4 = {"divide","30","10"};
        double result = simpleMathClass.parseArguments(arg4);

        Assert.assertEquals(3, result, 0);
    }

}
