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
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;

public class BenchmarkSort {


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
    public List<Integer> methodSortWithListOrder() {
        return Sort.methodSortList(getListOrder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public List<Integer> methodSortWithListDesorder() {
        return Sort.methodSortList(getListDesorder());
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
    public Stack<Integer> methodSortWithStackInOrder() {
        return Sort.methodSortStack(getStackOrder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public Stack<Integer> methodSortWithStackDesorder() {
        return Sort.methodSortStack(getStackDesorder());
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
    public LinkedList<Integer> methodSortWithLinkedListOrder() {
        return Sort.methodSortLinkedList(getLinkedListOrder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public LinkedList<Integer> methodSortWithLinkedListDesorder() {
        return Sort.methodSortLinkedList(getLinkedListDesorder());
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public List<Integer> methodSortWithListRandom10k() {
        return Sort.methodSortList(MathHelper.generateList(10000));
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public List<Integer> methodSortWithStackRandom10k() {
        return Sort.methodSortStack(MathHelper.generateStack(10000));
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public LinkedList<Integer> methodSortWithLinkedList10k() {
        return Sort.methodSortLinkedList(MathHelper.generateLinkedList(10000));
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public Collection<Integer> methodSortWithCollection10k() {
        return Sort.methodStreamsSortCollection(MathHelper.generateCollection(10000));
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public Collection<Integer> methodParallelSortWithCollection10k() {
        return Sort.methodParallelSortCollection(MathHelper.generateCollection(10000));
    }
}
