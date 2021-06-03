package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {
    @Test
       void shouldReturnSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService service = new StatisticService();
        int actual = service.sum(sales);
        int expected = 180;

        assertEquals(expected, actual);

    }
    @Test
    void shouldReturnAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService service = new StatisticService();
        int actual = service.average(sales);
        int expected = 15;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnMonthWithMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService service = new StatisticService();
        int actual = service.shouldReturnMonthWithMaxSales(sales);
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnMonthWithMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService service = new StatisticService();
        int actual = service.shouldReturnMontWithMinSales(sales);
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnLowerThanAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService service = new StatisticService();
        int actual = service.shouldReturnLowerThanAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);

    }
    @Test
    void shouldReturnHigherThanAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticService service = new StatisticService();
        int actual = service.shouldReturnHigherThanAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);

    }

}
