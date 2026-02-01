package io.github.wwwwaterson.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void shouldFindElement() {
        int[] data = { 1, 3, 5, 7, 9 };
        assertEquals(2, BinarySearch.search(data, 5));
    }

    @Test
    public void shouldReturnMinusOneWhenNotFound() {
        int[] data = { 1, 3, 5, 7, 9 };
        assertEquals(-1, BinarySearch.search(data, 4));
    }
}
