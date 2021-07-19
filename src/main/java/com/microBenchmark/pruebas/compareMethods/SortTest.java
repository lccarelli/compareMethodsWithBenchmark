package com.microBenchmark.pruebas.compareMethods;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
    @DisplayName("Test Bubble Sort With Simple List Order")
    public void testBubbleSortListOrder() {
        List<Integer> result = Sort.BubbleSortWithList(getListOrder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    @DisplayName("Test Bubble Sort With Simple List Desorder")
    public void testBubbleSortListDesorder() {
        List<Integer> result = Sort.BubbleSortWithList(getListDesorder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    @DisplayName("Test Method Sort With Simple List Order")
    public void testMethodSortListOrder() {
        List<Integer> result = Sort.methodSortList(getListOrder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    @DisplayName("Test Method Sort With Simple List Desorder")
    public void testMethodSortListDesorder() {
        List<Integer> result = Sort.methodSortList(getListDesorder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }



    public static LinkedList<Integer> getLinkedListOrder() {
        LinkedList<Integer> result = new LinkedList<>();
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

    public static LinkedList<Integer> getLinkedListDesorder() {
        LinkedList<Integer> result = new LinkedList<>();
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
    @DisplayName("Test Bubble Sort With LinkedList Order")
    public void testBubbleSortLinkedListOrder() {
        LinkedList<Integer> result = Sort.BubbleSortWithLinkedList(getLinkedListOrder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    @DisplayName("Test Bubble Sort With LinkedList Desorder")
    public void testBubbleSortLinkedListDesorder() {
        LinkedList<Integer> result = Sort.BubbleSortWithLinkedList(getLinkedListDesorder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }


    public static Stack<Integer> getStackOrder() {
        Stack<Integer> result = new Stack<>();
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

    public static Stack<Integer> getStackDesorder() {
        Stack<Integer> result = new Stack<>();
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
    @DisplayName("Test Bubble Sort With Stack Order")
    public void testBubbleSortStackOrder() {
        Stack<Integer> result = Sort.BubbleSortWithStack(getStackOrder());
        assertNotNull(result, "The result cannot be null");
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    @DisplayName("Test Bubble Sort With Stack Desorder")
    public void testBubbleSortStackDesorder() {
        Stack<Integer> result = Sort.BubbleSortWithStack(getStackDesorder());
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

    @Test
    @DisplayName("Test buubleSort with List of 10mil")
    public void testBubbleSortListRandom10mill() {
        List<Integer>result = Sort.BubbleSortWithList(MathHelper.generateList(100));
        assertNotNull(result, "The result cannot be null");
        System.out.println(result);
        for(int i=0; i<99; i++) {
            int first = result.get(i);
            int second = result.get(i+1);
            assertTrue(first < second);
        }

    }

    @Test
    @DisplayName("Test buubleSort with List of 10mil")
    public void testSortListRandom10mill() {
        List<Integer>result = Sort.methodSortList(MathHelper.generateList(100));
        assertNotNull(result, "The result cannot be null");
        System.out.println(result);

    }

}
