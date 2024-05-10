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
            compartment1.retainAll(compartment2);
            Optional<String> possibleItem = compartment1.stream().findFirst();
            if (possibleItem.isPresent()) {
                String item = possibleItem.get(); // safe because we know it will have one item

                // add the priority of the item to the total priority

            }
            else {
                throw new IllegalStateException("There should always be an overlapping item, and one was not found.");
            }


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

    public int priorityCalculator(String item){
        Character itemValue = item.charAt(0);
        if(Character.isUpperCase(itemValue)){
            
        }

    }
}
//substring, 2 parameters, first and last position