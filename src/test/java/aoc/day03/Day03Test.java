package aoc.day03;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

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
        assertEquals(expectedCompartments , result);
    }
    @Test
    public void testPartOneRucksackSplitterAnotherInput() {
        Day03 target = new Day03();
        String rucksack = "abcdef";

        String[] result = target.rucksackSplitter(rucksack);

        String[] expectedCompartments = new String[] {"abc","def"};
        assertEquals(expectedCompartments , result);
    }

}
