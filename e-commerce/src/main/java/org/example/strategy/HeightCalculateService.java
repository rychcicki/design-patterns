package org.example.strategy;

import java.util.List;

public class HeightCalculateService {
    private final HeightCalculateStrategy strategy;   //interface

    public HeightCalculateService(HeightCalculateStrategy strategy) {
        this.strategy = strategy;
    }   //Można Lombokiem @AllArgsConstructor

    public void calculateHeight(List<?> engineeringObjects) {
        this.strategy.calculateHeight(engineeringObjects); //interface
    }
}
