/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.microBenchmark.pruebas.compareMethods;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class BenchmarkBubbleSort {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .warmupIterations(5)
                .measurementIterations(5)
                .resultFormat(ResultFormatType.JSON)
                .result("/home/lau/redbee/redbeeConf/reporte4.json")
                .timeUnit(TimeUnit.MICROSECONDS)
                .forks(1)
                .build();
        new Runner(opt).run();
    }
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

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public List<Integer> bubbleSortWithListOrder() {
        return Sort.BubbleSortWithList(getListOrder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public List<Integer> bubbleSortWithListDesorder() {
        return Sort.BubbleSortWithList(getListDesorder());
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

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public Stack<Integer> bubbleSortWithStackDesorder() {
        return Sort.BubbleSortWithStack(getStackDesorder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public Stack<Integer> bubbleSortWithStackInOrder() {
        return Sort.BubbleSortWithStack(getStackOrder());
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

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public LinkedList<Integer> bubbleSortLinkedListOrder() {
        return Sort.BubbleSortWithLinkedList(getLinkedListOrder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public LinkedList<Integer> bubbleSortLinkedListDesorder() {
        return Sort.BubbleSortWithLinkedList(getLinkedListDesorder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public List<Integer> randomList10mil() {
        return Sort.BubbleSortWithList(MathHelper.generateList(100));
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public Stack<Integer> randomStack10mil() {
        return Sort.BubbleSortWithStack(MathHelper.generateStack(100));
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public LinkedList<Integer> randomLinkedList10mil() {
        return Sort.BubbleSortWithLinkedList(MathHelper.generateLinkedList(100));
    }


}
