package aoc.day03;

import aoc.Day;

import java.util.List;

public class Day03 implements Day {

    @Override
    public String part1(List<String> input) {
        // for each rucksack
        for (String rucksack: input) {
            String [] compartments = rucksackSplitter(rucksack);
            // split rucksack into two compartments
            // identify the item that is in both compartments
            // add the priority of the item to the total priority
        }
        // return the sum of the priorities
        return "";
    }


    @Override
    public String part2(List<String> input) {
        return "";
    }

    public String[] rucksackSplitter(String rucksack) {
        int rucksackLength = rucksack.length();
        return new String[] {rucksack.substring(0,(rucksackLength/2)), rucksack.substring((rucksackLength/2),rucksackLength)};
    }
}
//substring, 2 parameters, first and last position