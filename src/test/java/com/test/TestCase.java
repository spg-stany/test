package com.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.test.Main.calculate;

public class TestCase {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCalculate() throws Exception {
        Assert.assertEquals(calculate(new int[]{5, 2, 3, 4, 5, 4, 1, 3, 1}), 8);

        Assert.assertEquals(calculate(new int[]{2, 5, 1, 3, 1, 2, 1, 7, 7, 6}), 17);
        Assert.assertEquals(calculate(new int[]{4, 3, 1, 5, 8, 0, 4, 0, 0, 5, 5, 7, 5, 8, 3, 3}), 42);
        Assert.assertEquals(calculate(new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9}), 45);
        Assert.assertEquals(calculate(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), 0);
    }

    @Test
    public void testValues() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Value exceeds allowed size");

        calculate(new int[]{35000, 2, 3, 4, 5, 4, 1, 3, 1});
    }
}
