package com.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * @author Dmitry Chueshov 07.06.2021 20:11
 * @project MinMax
 *
 * 1.0. Максимальное, минимальное и среднее значение
 */

public class Runner {
    public static void main(String[] args) {
     
     List<Double> list = new Random().
             doubles(2,1292).
             limit(10).boxed().sorted(Double::compareTo).
             collect(Collectors.toList());
     
        list.stream().min(Double::compareTo).stream().map(aDouble -> aDouble + " Min").forEach(System.out::println);
    
        list.stream().max(Double::compareTo).stream().map(aDouble -> aDouble + " Max").forEach(System.out::println);
        
        list.stream().mapToDouble(value -> value).average().stream().forEach(System.out::println);
    }
}
