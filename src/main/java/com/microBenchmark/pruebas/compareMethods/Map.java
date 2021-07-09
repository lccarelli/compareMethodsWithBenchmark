package com.microBenchmark.pruebas.compareMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Map {

    public static List<Integer> manualMap(List<Integer> a){

        List<Integer> result = new ArrayList<>();

        for(int element: a){
            result.add(element*2);
        }
        return result;
    }

    public static List<Integer> streamMap(List<Integer> a){

        return a.stream().map(e->e*2).collect(Collectors.toList());
    }

    public static Stream<Integer> streamParallelMap(List<Integer> a){

        return a.parallelStream()
                .map(e->e*2);

    }

    public static Stream<Integer> streamIntermediateMap(List<Integer> a){

        return a.stream()
                .map(e->e*2);

    }
}

