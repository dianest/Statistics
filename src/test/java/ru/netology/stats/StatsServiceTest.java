package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {

        StatsService service = new StatsService();
        int[] monthIncome = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;

        int actualSum = service.calculateSum(monthIncome);

        System.out.println(actualSum);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void findMiddleIncome() {
        StatsService service = new StatsService();

        int[] monthIncome = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMiddleIncome = 15;
        double actualMiddleIncome = service.findMiddleIncome(monthIncome);

        System.out.println(actualMiddleIncome);
        assertEquals(expectedMiddleIncome, actualMiddleIncome);
    }


    @Test
    void findMaxMonth() {
        StatsService service = new StatsService();

        int[] monthIncome = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedIndexMaxMonth = 7;

        int actualMaxMonth = service.findMaxMonth(monthIncome);
        System.out.println(actualMaxMonth);
        assertEquals(expectedIndexMaxMonth, actualMaxMonth);
    }

    @Test
    void findMinMonth() {
        StatsService service = new StatsService();

        int[] monthIncome = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedIndexMinMonth = 8;

        int actualMinMonth = service.findMinMonth(monthIncome);
        System.out.println(actualMinMonth);
        assertEquals(expectedIndexMinMonth, actualMinMonth);
    }


    @Test
    void countMonthWithUnderMiddleIncome() {
        StatsService service = new StatsService();

        int[] monthIncome = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMonthUnderMiddleIncome = 5;

        int actualCountMonthUnderMiddleIncome = service.countMonthWithUnderMiddleIncome(monthIncome);
        System.out.println(actualCountMonthUnderMiddleIncome);
        assertEquals(expectedCountMonthUnderMiddleIncome, actualCountMonthUnderMiddleIncome);
    }

    @Test
    void countMonthWithOverMiddleIncome() {
        StatsService service = new StatsService();

        int[] monthIncome = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMonthOverMiddleIncome = 5;

        int actualCountMonthOverMiddleIncome = service.countMonthWithOverMiddleIncome(monthIncome);
        System.out.println(actualCountMonthOverMiddleIncome);
        assertEquals(expectedCountMonthOverMiddleIncome, actualCountMonthOverMiddleIncome);
    }
}