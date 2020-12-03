package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    long[] amountMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    Statistics statistics = new Statistics();

    @Test
    void amountTotal() {
        long expected = 180;
        long actual = statistics.amountTotal(amountMonths);

        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        long expected = 15;
        long actual = statistics.averageAmount(amountMonths);

        assertEquals(expected, actual);
    }

    @Test
    void piakSales() {
        int expected = 5;
        int actual = statistics.piakSales(amountMonths);

        assertEquals(expected, actual);
    }


    @Test
    void minSales() {
        int expected = 8;
        int actual = statistics.minSales(amountMonths);

        assertEquals(expected, actual);
    }

    @Test
    void belowOfAverage() {
        int expected = 5;
        int actual = statistics.belowOfAverage(amountMonths);

        assertEquals(expected, actual);
    }

    @Test
    void upperOfAverage() {
        int expected = 5;
        int actual = statistics.upperOfAverage(amountMonths);

        assertEquals(expected, actual);
    }
}