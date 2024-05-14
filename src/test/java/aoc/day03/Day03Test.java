package aoc.day03;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {
    @Test
    public void testPartOneAOCEx() {
        // arrange / given
        // given that the input is [vJrwpWtwJgWrhcsFMMfFFhFp, jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL, PmmdzqPrVvPwwTWBwg, wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn, ttgJtRGJQctTZtZT, CrZsJsPPZsGzwwsLwLmpwMDw]
        Day03 target = new Day03();
        List<String> input = Arrays.asList("vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg",
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                "ttgJtRGJQctTZtZT",
                "CrZsJsPPZsGzwwsLwLmpwMDw");
        // act / when
        // when we call part1(input)
        String result = target.part1(input);

        // assert / then
        // then the result is 157
        assertEquals("157", result);
    }
    @Test
    public void testPartOneRucksackSplitter() {
        Day03 target = new Day03();
        String rucksack = "vJrwpWtwJgWrhcsFMMfFFhFp";

        String[] result = target.rucksackSplitter(rucksack);

        String[] expectedCompartments = new String[] {"vJrwpWtwJgWr","hcsFMMfFFhFp"};
        assertArrayEquals(expectedCompartments , result);
    }
    @Test
    public void testPartOneRucksackSplitterAnotherInput() {
        Day03 target = new Day03();
        String rucksack = "abcdef";

        String[] result = target.rucksackSplitter(rucksack);

        String[] expectedCompartments = new String[] {"abc","def"};
        assertArrayEquals(expectedCompartments , result);
    }

    @Test
    public void priorityCalculator() {
        Day03 target = new Day03();
        assertEquals(10,target.priorityCalculator("j"));
        assertEquals(1,target.priorityCalculator("a"));
        assertEquals(11,target.priorityCalculator("k"));
        assertEquals(5,target.priorityCalculator("e"));
        assertEquals(36,target.priorityCalculator("J"));
        assertEquals(27,target.priorityCalculator("A"));
        assertEquals(37,target.priorityCalculator("K"));
        assertEquals(31,target.priorityCalculator("E"));
    }
}
