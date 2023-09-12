package org.example.strategy;

import java.util.Collection;

public class HeightService {
    private HeightCalculateStrategy strategy;   //interface

    public HeightService(HeightCalculateStrategy strategy) {
        this.strategy = strategy;
    }
    public void calculateHeight(Collection<EngineeringObject> engineeringObjects){
        this.strategy.calculateHeight(engineeringObjects); //interface
    }
}
