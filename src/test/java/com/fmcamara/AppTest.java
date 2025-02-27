package com.fmcamara;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fmcamara.service.ChallengerSolverService;
import java.util.Map;

public class AppTest {

    @Test
    public void testCalculateSum() {
        assertEquals(91, ChallengerSolverService.calculateSum());
    }

    @Test
    public void testBelongsToFibonacci() {
        assertTrue(ChallengerSolverService.belongsToFibonacci(21));
        assertFalse(ChallengerSolverService.belongsToFibonacci(22));
    }

    @Test
    public void testAnalyzeRevenue() {
        double[] revenue = { 1000, 2000, 0, 500, 3000, 0, 7000, 800, 1200, 0, 6500, 2500 };
        ChallengerSolverService.analyzeRevenue(revenue);
    }

    @Test
    public void testCalculateStatePercentage() {
        Map<String, Double> revenueByState = Map.of(
            "SP", 67836.43,
            "RJ", 36678.66,
            "MG", 29229.88,
            "ES", 27165.48,
            "Others", 19849.53
        );
        ChallengerSolverService.calculateStatePercentage(revenueByState);
    }

    @Test
    public void testReverseString() {
        assertEquals("tooB gnirpS avaJ", ChallengerSolverService.reverseString("Java Spring Boot"));
    }
}
