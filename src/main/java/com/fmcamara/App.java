package com.fmcamara;

import com.fmcamara.service.ChallengerSolverService;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("1) Sum: " + ChallengerSolverService.calculateSum());
        
        int testNumber = 21;
        System.out.println("2) The number " + testNumber + (ChallengerSolverService.belongsToFibonacci(testNumber) ? " belongs " : " does not belong ") + "to the Fibonacci sequence.");
        
        double[] revenue = { 1000, 2000, 0, 500, 3000, 0, 7000, 800, 1200, 0, 6500, 2500 };
        System.out.println("3) Revenue analysis:");
        ChallengerSolverService.analyzeRevenue(revenue);
        
        Map<String, Double> revenueByState = Map.of(
            "SP", 67836.43,
            "RJ", 36678.66,
            "MG", 29229.88,
            "ES", 27165.48,
            "Others", 19849.53
        );
        System.out.println("4) Revenue percentage by state:");
        ChallengerSolverService.calculateStatePercentage(revenueByState);
        
        String original = "Java Spring Boot";
        System.out.println("5) Reversed string: " + ChallengerSolverService.reverseString(original));
    }
}