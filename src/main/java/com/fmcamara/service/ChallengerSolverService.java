package com.fmcamara.service;

import java.util.Map;

public class ChallengerSolverService {
    public static int calculateSum() {
        int INDEX = 13, SUM = 0, K = 0;
        while (K < INDEX) {
            K = K + 1;
            SUM = SUM + K;
        }
        return SUM;
    }
    
    public static boolean belongsToFibonacci(int number) {
        int a = 0, b = 1, temp;
        while (b < number) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b == number || number == 0;
    }
    
    public static void analyzeRevenue(double[] dailyRevenue) {
        double sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        int daysWithRevenue = 0;
        
        for (double value : dailyRevenue) {
            if (value > 0) {
                sum += value;
                daysWithRevenue++;
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
        }
        double average = sum / daysWithRevenue;
        int daysAboveAverage = 0;
        
        for (double value : dailyRevenue) {
            if (value > average) daysAboveAverage++;
        }
        
        System.out.println("Minimum revenue: " + min);
        System.out.println("Maximum revenue: " + max);
        System.out.println("Days above average: " + daysAboveAverage);
    }
    
    public static void calculateStatePercentage(Map<String, Double> revenueByState) {
        double total = revenueByState.values().stream().mapToDouble(Double::doubleValue).sum();
        revenueByState.forEach((state, value) -> {
            double percentage = (value / total) * 100;
            System.out.println(state + " represents " + String.format("%.2f", percentage) + "% of the total revenue");
        });
    }
    
    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int i = 0, j = characters.length - 1;
        while (i < j) {
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        return new String(characters);
    }
}
