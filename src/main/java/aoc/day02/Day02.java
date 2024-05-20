package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {

    static {
        currentDay = new Day02();
    }

    public Day02() {
        super(2);
    }
    @Override
    public String part1(List<String> input) {
        Integer totalValue = 0;

        for (String round : input) {
            String ourMove= String.valueOf(round.charAt(2));
            if (ourMove.equals("X")){
                totalValue += 1;
            } else {
                totalValue += 2;
            }
        }
        return totalValue.toString();
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
