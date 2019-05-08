package com.samples.ocjp8.part1.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args){
        List<String> lstStrings = Arrays.asList("abc","","test","R","");

        List<String> filteredValues = lstStrings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filteredValues.size());


        //int count = filteredValues.stream().filter(String -> lstStrings.isEmpty()).count();
        long count1 = lstStrings.stream().filter(s -> !s.isEmpty()).count();
        System.out.println("count1" + count1);

    }
    }

