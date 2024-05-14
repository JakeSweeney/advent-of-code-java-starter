package aoc.day03;

import aoc.Day;

import java.util.*;
import java.util.stream.Collectors;


public class Day03 extends Day {

    static {
        currentDay = new Day03();
    }

    public Day03() {
        super(3);
    }
    
    public static final int PRIORITY_OF_UPPER_CASE_A = 27;
    public static final int PRIORITY_OF_LOWER_CASE_A = 1;

    @Override
    public String part1(List<String> input) {
        int totalPriority = 0;
        // for each rucksack
        for (String rucksack: input) {
            // split rucksack into two compartments
            String [] compartments = rucksackSplitter(rucksack);
            Set<String> compartment1 = Arrays.stream(compartments[0].split("")).collect(Collectors.toSet());
            Set<String> compartment2 = Arrays.stream(compartments[1].split("")).collect(Collectors.toSet());

            // identify the item that is in both compartments
            compartment1.retainAll(compartment2);
            Optional<String> possibleItem = compartment1.stream().findFirst();
            if (possibleItem.isPresent()) {
                String item = possibleItem.get(); // safe because we know it will have one item

                totalPriority += priorityCalculator(item);

            }
            else {
                throw new IllegalStateException("There should always be an overlapping item, and one was not found.");
            }


        }
        // return the sum of the priorities
        return String.valueOf(totalPriority);
    }


    @Override
    public String part2(List<String> input) {
        return "";
    }

    public String[] rucksackSplitter(String rucksack) {
        int rucksackLength = rucksack.length();
        return new String[] {rucksack.substring(0,(rucksackLength/2)), rucksack.substring((rucksackLength/2),rucksackLength)};
    }

    public int priorityCalculator(String item){
        Character itemValue = item.charAt(0);
        // in ASCII 'a' is 97, 'A' is 65
        if(Character.isUpperCase(itemValue)){
            return itemValue - 'A' + PRIORITY_OF_UPPER_CASE_A;
        } else
        {
            return itemValue - 'a' + PRIORITY_OF_LOWER_CASE_A;
        }
    }
}
//substring, 2 parameters, first and last position