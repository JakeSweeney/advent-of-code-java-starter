package aoc.day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {

    @Test
    @Disabled
    public void testPart1AdventOfCodeExample(){
        // Given
        List<String> input = Arrays.asList(new String [] {"A Y", "B X", "C Z"});
        // When
        Day02 testSubject = new Day02();
        String result = testSubject.part1(input);

        // Then
        assertEquals("15", result); // 15 because, 2 for Y, 1 for X, 3 for Z and 6 for win, 0 for lose, 3 for draw. 2 + 1 + 3 + 6 + 0 + 3 = 15
    }
    @Test
    public void testOneRoundLosingWithRock(){
        // Given
        List<String> input = Arrays.asList(new String [] {"B X"});
        // When
        Day02 testSubject = new Day02();
        String result = testSubject.part1(input);

        // Then
        assertEquals("1", result);
    }
    @Test
    public void testOneRoundLosingWithPaper(){
        // Given
        List<String> input = Arrays.asList(new String [] {"C Y"});
        // When
        Day02 testSubject = new Day02();
        String result = testSubject.part1(input);

        // Then
        assertEquals("2", result);
    }
    @Test
    public void testMultipleRoundsLosingWithRock(){
        // Given
        List<String> input = Arrays.asList(new String [] {"B X", "B X"});
        // When
        Day02 testSubject = new Day02();
        String result = testSubject.part1(input);

        // Then
        assertEquals("2", result);
    }
    @Test
    @Disabled
    public void testPart2AdventOfCodeExample(){
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals(input.get(0), result);
    }
}
