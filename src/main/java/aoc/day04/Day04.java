package aoc.day04;

import aoc.Day;


import java.util.*;
import java.util.stream.Collectors;


public class Day04 extends Day {

    static {
        currentDay = new Day04();
    }

    public Day04() {
        super(4);
    }


    @Override
    public String part1(List<String> input) {
        return null;
    }


    @Override
    public String part2(List<String> input) {
        return null;
    }


    public boolean isRangeContained(int lowerBoundOne, int upperBoundOne, int lowerBoundTwo, int upperBoundTwo) {
        return lowerBoundOne<lowerBoundTwo && upperBoundOne > upperBoundTwo;
    }

    /*
    Create method to help with D4P1

    - [ ] add some more test cases for isRangeContained method
        - [ ] consider range two containing range one
        - [ ] consider overlapping but not contained ranges
    - [ ] use isRangeContained method in the part1 method
    - [ ] refactor to use classes

     */

}