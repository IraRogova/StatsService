package ru.netology.stats;

public class StatsService {

    public int calculateStatisticSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;

    }

    public int calculateStatisticAverage(int[] purchases) {

        int i = 0;
        for (int purchase : purchases) {
            i = i + purchase;
        }

        return i / purchases.length;
    }

    public int calculateStatisticMax(int[] purchases) {
        int month = 0;
        int currentMax = purchases[0];

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > currentMax) {
                currentMax = purchases[i];
                month = i;
            }

        }
        return month;

    }


    public int calculateStatisticMin(int[] purchases) {
        int month = 0;
        int currentMax = purchases[0];

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < currentMax) {
                currentMax = purchases[i];
                month = i;
            }

        }
        return month;
    }


    public int calculateStatisticMinAverage(int[] purchases) {
        int sum = calculateStatisticAverage(purchases);

        int months = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > sum) {
                sum = purchases[i];
                months = i;
            }
        }
        return months;
    }

    public int calculateStatisticMaxAverage(int[] purchases) {
        int sum = calculateStatisticAverage(purchases);
        int months = 0;

       for (int i = 0; i < purchases.length; i++) {

           if (purchases[i] > sum) {
              sum = purchases[i];
              months = i;
           }
       }
        return months;


    }
}






