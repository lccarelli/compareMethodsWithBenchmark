package com.microBenchmark.pruebas.compareMethods;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FilterTest {

    @Test
    @DisplayName("Tests Manual Filter happy path")
    public void testmanualFilterHappyPath() {
        List<Integer> result = Filter.manualFilter(List.of(1, 2, 4, 5, 6, 7, 8, 9));
        assertNotNull(result, "The result cannot be null");
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(8, result.get(3));
    }

    @Test
    @DisplayName("Tests Stream Filter happy path")
    public void testStreamFilterHappyPath() {
        List<Integer> result = Filter.streamFilter(List.of(1, 2, 4, 5, 6, 7, 8, 9));
        assertNotNull(result, "The result cannot be null");
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(8, result.get(3));
    }

    @Test
    @DisplayName("Tests Stream Filter happy path")
    public void tesParallelStreamFilterHappyPath() {
        List<Integer> result = Filter.streamParallelFilter(List.of(1, 2, 4, 5, 6, 7, 8, 9));
        assertNotNull(result, "The result cannot be null");
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(8, result.get(3));
    }


}
