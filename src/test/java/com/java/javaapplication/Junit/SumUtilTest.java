package com.java.javaapplication.Junit;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumUtilTest {

    @Test
    public void sum1() {
        int result = SumUtil.sum1(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void sum2() {
    }
}