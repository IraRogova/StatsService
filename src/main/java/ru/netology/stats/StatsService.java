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

        int sum = 180;
        int average = 0;

        average = sum / purchases.length;

        return average;
    }


    public int calculateStatisticMax(int[] purchases) {
      /*  int month = 0;
        int currentMax = purchases[0];

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > currentMax) {
                currentMax = purchases[i];
                month = i;
            }

        }
        return month;*/

        int month = 0;
        int currentMonth = 1;
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
                month = currentMonth;
                currentMonth++;

            }
        }
      return month;

    }


    public int calculateStatisticMin(int[] purchases) {
        /*int month = 0;
        int currentMax = purchases[0];

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < currentMax) {
                currentMax = purchases[i];
                month = i;
            }

        }
        return month;*/

        int month = 0;
        int currentMonth = 1;
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (currentMax > purchase) {
                currentMax = purchase;
                month = currentMonth;
                currentMonth++;
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






