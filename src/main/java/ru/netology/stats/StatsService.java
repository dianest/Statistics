package ru.netology.stats;

import java.security.Provider;

public class StatsService {


    public static int calculateSum(int[] monthIncome){
        int sum = 0;
        for (int income : monthIncome) {
        sum += income;
    }
       return sum;

    }

    public static double findMiddleIncome(int[] monthIncome){
        double sum = calculateSum(monthIncome);
        return sum / monthIncome.length;
    }


    public static int findMaxMonth(int[] monthIncome) {
        int indexMaxMonth = 0;
        int actualMaxIncome = monthIncome[indexMaxMonth];
        for (int i = indexMaxMonth; i < monthIncome.length; i++){
            if (actualMaxIncome <= monthIncome[i]){
                actualMaxIncome = monthIncome[i];
                indexMaxMonth = i;
            }
        }
        return indexMaxMonth;
    }

    public static int findMinMonth(int[] monthIncome) {
        int indexMinMonth = 0;
        int actualMinIncome = monthIncome[indexMinMonth];
        for (int i = indexMinMonth; i < monthIncome.length; i++) {
            if (actualMinIncome >= monthIncome[i]) {
                actualMinIncome = monthIncome[i];
                indexMinMonth = i;
            }
        }
        return indexMinMonth;
    }

    public static int countMonthWithUnderMiddleIncome(int[] monthIncome) {
        double middleIncome = findMiddleIncome(monthIncome);
        int countMonth = 0;
        for (int income : monthIncome){
            if (middleIncome > income){
                countMonth++;
            }
        }
        return countMonth;
        }

    public static int countMonthWithOverMiddleIncome(int[] monthIncome) {
        double middleIncome = findMiddleIncome(monthIncome);
        int countMonth = 0;
        for (int income : monthIncome){
            if (middleIncome < income){
                countMonth++;
            }
        }
        return countMonth;
    }
}
