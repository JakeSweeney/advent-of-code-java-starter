package aoc.day03;

import aoc.Day;

import java.util.List;
import java.util.Set;

public class Day03 implements Day {

    @Override
    public String part1(List<String> input) {
        // for each rucksack
        for (String rucksack: input) {
            String [] compartments = rucksackSplitter(rucksack);

            // split rucksack into two compartments


            // identify the item that is in both compartments

            Set<String> Compartment1 = Set.of(compartments[0].split(""));
            Set<String> Compartment2 = Set.of(compartments[1].split(""));
            Compartment1.retainAll(Compartment2);

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