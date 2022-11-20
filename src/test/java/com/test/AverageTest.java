package com.test;

import com.main.Average;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {
    Average avg = new Average();

   @Test
    public void nullListKGreaterThanZero() {
        assertEquals((Integer) null,avg.average(1, null) );
    }
    @Test
    public void emptyListKGreaterThanZero() {
        assertEquals((Integer) null,avg.average(1, new int[]{}) );
    }
    @Test
    public void nonEmptyListKGreaterThanZero() {
        assertEquals(4,avg.average(1, new int[]{4}) );
    }
    @Test
    public void nullListKIsZero() {
        assertEquals((Integer) null,avg.average(0, null) );
    }
    @Test
    public void emptyListKIsZero() {
        assertEquals((Integer) null,avg.average(0, new int[]{}) );
    }
    @Test
    public void nonEmptyListKIsZero() {
        assertEquals((Integer) null,avg.average(0, new int[]{4}) );
    }
    @Test
    public void nullListKLessThanZero() {
        assertEquals((Integer) null,avg.average(-1, null) );
    }
    @Test
    public void emptyListKLessThanZero() {
        assertEquals((Integer) null,avg.average(-1, new int[]{}) );
    }
    @Test
    public void nonEmptyListKLessThanZero() {
        assertEquals((Integer) null,avg.average(-1, new int[]{4}) );
    }
    @Test
    public void KEqualsListSize() {
        assertEquals(5,avg.average(4, new int[]{3,4,5,8}) );
    }
    @Test
    public void KLessThanListSize() {
        assertEquals(4,avg.average(3, new int[]{3,4,5,8}) );
    }
    @Test
    public void KGreaterThanListSize() {
        Float val = 4.5f;
        assertEquals( val, avg.average(5, new int[]{3,4,5,6}) );
    }

}