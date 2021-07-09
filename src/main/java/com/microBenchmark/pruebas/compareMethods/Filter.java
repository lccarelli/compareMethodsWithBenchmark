package com.microBenchmark.pruebas.compareMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Filter {

    public static List<Integer> manualFilter(List<Integer> a){
        List<Integer> result = new ArrayList<>();

        for(int element: a){
            if(element % 2 == 0){
                result.add(element);
            }
        }
        return result;
    }

    public static List<Integer> streamParallelFilter(List<Integer> a){

        return a.parallelStream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

    }

    public static List<Integer> streamFilter(List<Integer> a){

        return a.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
    }
}

