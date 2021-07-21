package com.microBenchmark.pruebas.compareMethods;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

public class MyBechnmark {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .warmupIterations(5)
                .measurementIterations(5)
                .resultFormat(ResultFormatType.JSON)
                .result("/home/lau/redbee/redbeeConf/reporteReduce.json")
                .timeUnit(TimeUnit.MICROSECONDS)
                .forks(1)
                .build();
        new Runner(opt).run();
    }

    @Benchmark
    public void testParallelArraySort_10(ParallelState state) {
        state.setSize(10);
    }

    @Benchmark
    public void testParallelArraySort_20(ParallelState state) {
        state.setSize(20);
    }

    @Benchmark
    public void testSequentialArraySort_10(ParallelState state) {
        state.setSize(10);
    }

    @Benchmark
    public void testSequentialArraySort_20(ParallelState state) {
        state.setSize(20);
    }

    @State(Scope.Thread)
    public static class SequentialState extends BaseState {

        @Setup(Level.Invocation)
        public void init() {
            array = generateArray();
        }

        @TearDown(Level.Invocation)
        public void destroy() {
            array = null;
        }

        public void run() {
            MathHelper.sequenatialSort(array);
        }
    }

    @State(Scope.Thread)
    public static class ParallelState extends BaseState {

        @Setup(Level.Invocation)
        public void init() {
            array = generateArray();
        }

        @TearDown(Level.Invocation)
        public void destroy() {
            array = null;
        }

        public void run() {
            MathHelper.parallelSort(array);
        }
    }
}
