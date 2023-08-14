package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        Integer totalValue = 0;
        Integer ourMoveValue = 0;
        for (String round : input) {
            String ourMove= String.valueOf(round.charAt(2));
            if (ourMove == "X"){
                ourMoveValue = 1;
            } else {
                ourMoveValue = 2;
            }
            totalValue +=ourMoveValue;
        }

        return totalValue.toString();
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
