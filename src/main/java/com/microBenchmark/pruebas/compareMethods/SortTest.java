package com.microBenchmark.pruebas.compareMethods;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest {

    public static List<Integer> getListOrder() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        return result;
    }

    public static List<Integer> getListDesorder() {
        List<Integer> result = new ArrayList<>();
        result.add(9);
        result.add(8);
        result.add(7);
        result.add(6);
        result.add(5);
        result.add(4);
        result.add(3);
        result.add(2);
        result.add(1);
        return result;
    }


    @Test
    @DisplayName("Tests bubbleSortOrder")
    public void testBubbleSortOrder() {
        List<Integer> result = Sort.BubbleSort(getListOrder(), getListOrder().size());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    @DisplayName("Tests bubbleSortDesorder")
    public void testBubbleSortDesorder() {
        List<Integer> result = Sort.BubbleSort(getListDesorder(), getListDesorder().size());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    int[] a = {9,8,7,6,5,4,3,2,1};
    @Test
    @DisplayName("Tests QuickSort Desorder")
    public void testQuickSortDesorder() {
        Sort.QuickSort(a, 0, 8);
        assertNotNull(a, "The result cannot be null");
        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
        assertEquals(3, a[2]);
        assertEquals(4, a[3]);
        assertEquals(5, a[4]);
    }

}
