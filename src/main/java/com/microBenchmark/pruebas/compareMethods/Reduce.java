package com.microBenchmark.pruebas.compareMethods;

import java.util.List;

class Reduce {

    public static Integer manualReduce(List<Integer> a){

        int sum=0;

        for(int element: a){
            sum+=element;
        }
        return sum;
    }

    public static Integer streamReduce(List<Integer> a){

        return a.stream().reduce(0,(sub,element)->sub+element);
    }

    public static Integer parallelStreamReduce(List<Integer> a){

        return a.parallelStream().reduce(0,(sub,element)->sub+element);
    }
}

