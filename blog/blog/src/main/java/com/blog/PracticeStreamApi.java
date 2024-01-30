package com.blog;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class PracticeStreamApi {

    public static void main(String[] args) {

        Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());

        p.offer(20);
        p.offer(30);
        p.offer(32);
        System.out.println("largest integer in list is"+p.peek());
        //find even numbers from integer list
//        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
//        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        //find integers which start with one
//        List<Integer> list = Arrays.asList(100, 200, 300, 10, 1, 123,100,100);
//        List<String> collect = list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
//        System.out.println(collect);
        //print list without duplicate elements
//        List<Integer> collect1 = list.stream().distinct().collect(Collectors.toList());
        //print duplicate elements
//        List<Integer> list = Arrays.asList(100, 200, 300, 10, 1, 123,100,100);
//        HashSet hashSet = new HashSet();
//        List<Integer> collect = list.stream().filter(n -> !hashSet.add(n)).collect(Collectors.toList());
//        System.out.println(collect);
        //find max of elements
//        Integer integer = Arrays.asList(10, 30, 40).stream().max(Integer::compareTo).get();
//        System.out.println(integer);
        //print the first characher that occured only once
//        String input ="Java is beautiful lanugage";
//        Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//                .filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();
//        System.out.println(result);
//        String input ="Java is beautiful lanugage";
//        Character character = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//                .filter(entry->entry.getValue()>1L).
//                 map(entry -> entry.getKey()).findFirst().get();
//        System.out.println(character);
//
//        List<Integer> list = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
//        List<String> collect = list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
//        System.out.println(collect);

    }
}
