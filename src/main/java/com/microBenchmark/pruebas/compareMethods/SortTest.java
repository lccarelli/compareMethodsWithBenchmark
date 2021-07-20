package com.microBenchmark.pruebas.compareMethods;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest {

    @Test
    @DisplayName("Test Bubble Sort With LinkedList")
    public void testBubbleSortLinkedList() {
        LinkedList<Integer> result = Sort.BubbleSortWithLinkedList(MathHelper.generateLinkedList(20));
        assertNotNull(result, "The result cannot be null");
        for(int i=0; i<19; i++) {
            int first = result.get(i);
            int second = result.get(i+1);
            assertTrue(first < second);
        }
    }

    @Test
    @DisplayName("Test Bubble Sort With Stack")
    public void testBubbleSortStack() {
        Stack<Integer> result = Sort.BubbleSortWithStack(MathHelper.generateStack(20));
        assertNotNull(result, "The result cannot be null");
        for(int i=0; i<19; i++) {
            int first = result.get(i);
            int second = result.get(i+1);
            assertTrue(first < second);
        }
    }



    int[] a = MathHelper.generateArray(20);
    @Test
    @DisplayName("Tests QuickSort Desorder")
    public void testQuickSort() {
        Sort.QuickSort(a, 0, 19);
        assertNotNull(a, "The result cannot be null");
        for(int i=0; i<19; i++) {
            int first = a[i];
            int second = a[i+1];
            assertTrue(first < second);
        }
    }

    @Test
    @DisplayName("Test buubleSort with List")
    public void testBubbleSortList() {
        List<Integer>result = Sort.BubbleSortWithList(MathHelper.generateList(20));
        assertNotNull(result, "The result cannot be null");
        for(int i=0; i<19; i++) {
            int first = result.get(i);
            int second = result.get(i+1);
            assertTrue(first < second);
        }
    }

    @Test
    @DisplayName("Test Java Sort with List")
    public void testSortList() {
        List<Integer>result = Sort.methodSortList(MathHelper.generateList(20));
        assertNotNull(result, "The result cannot be null");
        for(int i=0; i<19; i++) {
            int first = result.get(i);
            int second = result.get(i+1);
            assertTrue(first < second);
        }
    }

}
