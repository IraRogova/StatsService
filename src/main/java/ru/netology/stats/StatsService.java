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

        int sum = calculateStatisticSum(purchases);
        int average = 0;

        average = sum / purchases.length;

        return average;
    }


    public int calculateStatisticMax(int[] purchases) {

        int month = 0;
        int currentMonth = 1;
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (purchase >= currentMax) {
                currentMax = purchase;
                month = currentMonth;

            }
            currentMonth++;
        }
      return month;

    }


    public int calculateStatisticMin(int[] purchases) {

        int month = 0;
        int currentMonth = 1;
        int currentMin = purchases[0];
        for (int purchase : purchases) {
            if (purchase <= currentMin) {
                currentMin = purchase;
                month = currentMonth;

            }
            currentMonth++;
        }
        return month;
    }


    public int calculateStatisticMinAverage(int[] purchases) {
        int sum = calculateStatisticAverage(purchases);
        int months = 0;
        for (int purchase : purchases) {
            if (purchase < sum) {
                months++;
            }
        }
        return months;
    }

    public int calculateStatisticMaxAverage(int[] purchases) {
        int sum = calculateStatisticAverage(purchases);
        int months = 0;
        for (int purchase : purchases) {
            if (purchase > sum) {
                months++;
            }
        }
        return months;


    }
}






