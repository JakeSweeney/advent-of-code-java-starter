package aoc.day04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Day04Test {
    Day04 target = new Day04();

    @Test
    @Disabled
    void part1() {
        assertThat(new Day04().part1(List.of(
                "2-4,6-8",
                        "2-3,4-5",
                        "5-7,7-9",
                        "2-8,3-7",
                        "6-6,4-6",
                        "2-6,4-8"
        ))).isEqualTo("2");
    }

    @Test
    void rangeOneContainsRangeTwo() {
        assertThat(target.isRangeContained(2, 8, 3, 7)).isTrue();
    }

    @Test
    void rangeTwoContainsRangeOne() {
        assertThat(target.isRangeContained(3, 7, 2, 8)).isTrue();
    }

    @Test
    void neitherRangeContainsOrOverlapsOtherRange() {
        assertThat(target.isRangeContained(2, 3, 4, 5)).isFalse();
    }

    @Test
    void rangesOverlapButDoNotContainEachOther() {
        assertThat(target.isRangeContained(2, 6, 4, 8)).isFalse();
    }
}