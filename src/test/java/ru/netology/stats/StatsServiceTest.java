package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateStatisticSum() {
        StatsService service = new StatsService();
        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateStatisticSum(purchases);
        assertEquals(expected, actual);
    }


    @Test
    void calculateStatisticAverage() {

        StatsService service = new StatsService();
        int [] purchases = {9, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateStatisticAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateStatisticMax() {
        StatsService service = new StatsService();
        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateStatisticMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateStatisticMin() {
        StatsService service = new StatsService();
        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateStatisticMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateStatisticMinAverage() {
        StatsService service = new StatsService();
        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateStatisticMinAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateStatisticMaxAverage() {
        StatsService service = new StatsService();
        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateStatisticMaxAverage(purchases);
        assertEquals(expected, actual);
    }
}