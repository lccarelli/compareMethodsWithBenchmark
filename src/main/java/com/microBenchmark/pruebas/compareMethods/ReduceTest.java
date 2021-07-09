package com.microBenchmark.pruebas.compareMethods;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReduceTest {
    @Test
    @DisplayName("Tests happy path")
    public void testmanualReduceHappyPath() {
        Integer result = Reduce.manualReduce(List.of(1, 2, 4));
        assertNotNull(result, "The result cannot be null");
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Tests happy path")
    public void testStreamReduceHappyPath() {
        Integer result = Reduce.streamReduce(List.of(1, 2, 4));
        assertNotNull(result, "The result cannot be null");
        assertEquals(7, result);
    }

}
