package org.example.ExecutorandCallablesExercise;

import org.example.ExecutorandCallablesExercise.services.CallableFutureExample;

public class Main {
    public static void main(String[] args) {
        // Record the start time
        long startTime = System.currentTimeMillis();

        CallableFutureExample.runTasks();

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Task runtime: " + duration + " milliseconds");
    }
}
