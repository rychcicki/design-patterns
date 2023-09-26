package org.example.strategy;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class HeightCalculateService<T> {
    private final HeightCalculateStrategy<T> strategy;

    public void calculateHeight(List<T> engineeringObjects) {
        this.strategy.calculateHeight(engineeringObjects);
    }
}
