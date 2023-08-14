package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        Integer totalValue = 0;
        Integer ourMoveValue = 0;
        for (String round : input) {
            totalValue +=1;
        }

        return totalValue.toString();
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
