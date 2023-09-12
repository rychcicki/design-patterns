package org.example.strategy;

import java.util.Collection;

public class RoadBridgeStrategy implements HeightCalculateStrategy{
    @Override
    public void calculateHeight(Collection<EngineeringObject> engineeringObject) {
        System.out.println("Calculate road's bridge height.");
    }
}
