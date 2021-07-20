package com.microBenchmark.pruebas.compareMethods;

import java.util.*;

public class MathHelper {

    public static int[] generateArray(int size) {
        if (size <= 0 || size > Integer.MAX_VALUE)
            return null;

        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            result[i] = random.nextInt(10000);

        return result;
    }

    public static double[] sequenatialSort(double[] array) {

        Arrays.sort(array);
        return array;

    }

    public static double[] parallelSort(double[] array) {

        Arrays.parallelSort(array);
        return array;

    }

    public static List<Integer> generateList(int size) {
        if (size <= 0 || size > Integer.MAX_VALUE)
            return null;
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            result.add(random.nextInt(10000));
        }
        return result;
    }

    public static Stack<Integer> generateStack(int size) {
        if (size <= 0 || size > Integer.MAX_VALUE)
            return null;
        Stack<Integer> result = new Stack<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            result.add(random.nextInt(10000));
        }
        return result;
    }

    public static LinkedList<Integer> generateLinkedList(int size) {
        if (size <= 0 || size > Integer.MAX_VALUE)
            return null;
        LinkedList<Integer> result = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            result.add(random.nextInt(10000));
        }
        return result;
    }

    public static Collection<Integer> generateCollection(int size) {
        if (size <= 0 || size > Integer.MAX_VALUE)
            return null;
        Collection<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            result.add(random.nextInt(10000));
        }
        return result;
    }
}
