package com.microBenchmark.pruebas.compareMethods;

import java.util.*;

class Sort {

    public static List<Integer> BubbleSortWithList(List<Integer> list) {
        Integer temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i)>list.get(i+1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return list;
    }



    public static LinkedList<Integer> BubbleSortWithLinkedList(LinkedList<Integer> linkedList) {
        Integer temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < linkedList.size()-1; i++) {
                if (linkedList.get(i)>linkedList.get(i+1)) {
                    temp = linkedList.get(i);
                    linkedList.set(i, linkedList.get(i + 1));
                    linkedList.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return linkedList;
    }

    public static Stack<Integer> BubbleSortWithStack(Stack<Integer> stack) {
        Integer temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < stack.size()-1; i++) {
                if (stack.get(i)>stack.get(i+1)) {
                    temp = stack.get(i);
                    stack.set(i, stack.get(i + 1));
                    stack.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return stack;
    }

    public static List<Integer> methodSortList(List<Integer> a) {
        a.sort(Integer::compareTo);
        return a;
    }

    public static Stack<Integer> methodSortStack(Stack<Integer> a) {
        a.sort(Integer::compareTo);
        return a;
    }

    public static LinkedList<Integer> methodSortLinkedList(LinkedList<Integer> a) {
        a.sort(Integer::compareTo);
        return a;
    }

    public static Collection<Integer> methodParallelSortCollection(Collection<Integer> a) {
        a.parallelStream().sorted(Integer::compareTo);
        return a;
    }

    public static Collection<Integer> methodStreamsSortCollection(Collection<Integer> a) {
        a.stream().sorted(Integer::compareTo);
        return a;
    }


    public static void QuickSort(int a[],int start,int end)
    {
        if(start<end)
        {
            int pIndex=QuickPartition(a,start,end);
            QuickSort(a,start,pIndex-1);
            QuickSort(a,pIndex+1,end);
        }
        else
            return;

    }
    public static int QuickPartition(int a[],int start,int end)
    {
        int temp;
        int pivot=a[end];
        int pIndex=start;
        for(int i=start;i<end;i++)
        {
            if(a[i]<=pivot)
            {
                //swap a[i],apindex
                temp=a[i];
                a[i]=a[pIndex];
                a[pIndex]=temp;
                pIndex++;
            }
        }
        temp=a[pIndex];
        a[pIndex]=a[end];
        a[end]=temp;
        return pIndex;
    }
}

