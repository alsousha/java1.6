package ru.netology.stat;

public class Statistics {

    public long amountTotal(long[] amountMonths) {
        long amountTotal = 0;
        for (long amount : amountMonths) {
            amountTotal += amount;
        }
        return amountTotal;
    }

    public long averageAmount(long[] amountMonths) {
        long amountTotal = 0;
        for (long amount : amountMonths) {
            amountTotal += amount;
        }
        long averageAmount = amountTotal / amountMonths.length;
        return averageAmount;
    }

    public int piakSales(long[] amountMonths) {
        long maxSales = amountMonths[0];
        int maxMonth = 0;

        for (int i = 1; i < amountMonths.length; i++) {
            if (amountMonths[i] > maxSales) {
                maxSales = amountMonths[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minSales(long[] amountMonths) {
        long minSales = amountMonths[0];
        int minMonth = 0;

        for (int i = 1; i < amountMonths.length; i++) {
            if (amountMonths[i] < minSales) {
                minSales = amountMonths[i];
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int belowOfAverage(long[] amountMonths) {
        long averageAmount = averageAmount(amountMonths);
        int countMinMonth = 0;
        for (long amount : amountMonths) {
            if (amount < averageAmount) countMinMonth++;
        }
        return countMinMonth;
    }

    public int upperOfAverage(long[] amountMonths) {
        long averageAmount = averageAmount(amountMonths);
        int countMaxMonth = 0;
        for (long amount : amountMonths) {
            if (amount > averageAmount) countMaxMonth++;
        }
        return countMaxMonth;
    }
}
