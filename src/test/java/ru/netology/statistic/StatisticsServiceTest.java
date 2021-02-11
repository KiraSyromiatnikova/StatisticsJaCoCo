package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMaxAmongSmall() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        assertEquals(12, service.findMax(incomesInBillions));
    }

    @Test
    void findMaxAmongBig() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {300, 13, 999, 2};
        assertEquals(999, service.findMax(incomesInBillions));
    }
}