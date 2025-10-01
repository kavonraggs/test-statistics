package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        double average;
        double sum = 0;
        int i;
        int[] testScores = {100, 27, 90, 55, 99, 87, 82, 100, 10, 75};
        Arrays.sort(testScores);

        double highScore = testScores[testScores.length - 1];
        double lowScore = testScores[0];
        double median = testScores[(testScores.length) / 2];

        for (i = 0; i < testScores.length; i++){
            sum += testScores[i];
        }

        //print average
        average = sum / testScores.length ;
        System.out.println("Average: " + average);

        //print lowest
        System.out.println("Lowest score: " + lowScore);

        //print highest
        System.out.println("Highest score: " + highScore);

        //print median
        if (testScores.length % 2 == 0){
            int midpoint1 = testScores.length / 2 - 1;
            int midpoint2 = testScores.length / 2;
            median = (testScores[midpoint1] + testScores[midpoint2]) / 2.0;
            System.out.println(median);
        } else {System.out.println("Median: " + median);}
    }
}
