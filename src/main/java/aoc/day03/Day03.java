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
            Set<String> compartment1 = getSet(compartments[0]);
            Set<String> compartment2 = getSet(compartments[1]);

            // identify the item that is in both compartments
            compartment1.retainAll(compartment2);
            Optional<String> possibleItem = compartment1.stream().findFirst();
            String item = possibleItem.orElseThrow(() -> new IllegalStateException("There should always be an overlapping item, and one was not found.")); // safe because we know it will have one item
//                String item = possibleItem.orElseThrow(IllegalStateException::new); // this is the method reference version, but we can’t pass in a message this way

            totalPriority += priorityCalculator(item);

        }
        // return the sum of the priorities
        return String.valueOf(totalPriority);
    }


    @Override
    public String part2(List<String> input) {
        int priorityValue = 0;
        for(int index = 0; index < input.size(); index += 3)
        {
            Set<String> rucksack1 = getSet(input.get(index));
            Set<String> rucksack2 = getSet(input.get(index + 1));
            Set<String> rucksack3 = getSet(input.get(index + 2));
            rucksack1.retainAll(rucksack2);
            rucksack1.retainAll(rucksack3);
            assert rucksack1.size() == 1;
            Optional<String> possibleItem = rucksack1.stream().findFirst();
            String item = possibleItem.orElseThrow(() -> new IllegalStateException("There should always be an overlapping item, and one was not found."));
            priorityValue += priorityCalculator(item);
        }
        return String.valueOf(priorityValue);
    }

    private static Set<String> getSet(String input) {
        return Arrays.stream(input.split("")).collect(Collectors.toSet());
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