package aoc.day02;

import aoc.day01.Day01;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day02Test {

    @Test
    public void testPart1(){
        // Given

        String [] myArray = new String[4];
        myArray[0] = "Hello";
        myArray[1] = "Jake";
        myArray[2] = myArray[0];
        myArray[3] = "Mark";
//        myArray[4] = "!"; // Exception because array isnt big enough

        List <String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("Jake");
        myList.add(myList.get(0));
        myList.add("Mark");
        myList.add("!");

        // Are lists a jungle of items or are they positioned?
        // Lists have an order, but no fixed size

        // Jakes code
        List<String> input = Arrays.asList(new String [] {"A Y", "B X", "C Z"});
        System.out.println("Got here");
        // When
        Day02 testSubject = new Day02();
        String result = testSubject.part1(input);

        // Then
        assertEquals("15", result);
    }

//    @Test
//    public void testPart2(){
//        // Given
//        int scoreBoard[] = ;
//        for (:
//             ) {
//
//        }
//        List<String> input = Collections.singletonList("test");
//
//        // When
//        String result = new Day02().part2(input);
//
//        // Then
//        assertEquals(input.get(0), result);
//    }
}
