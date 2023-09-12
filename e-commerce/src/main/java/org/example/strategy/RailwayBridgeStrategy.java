package org.example.strategy;

import java.util.Collection;

public class RailwayBridgeStrategy implements HeightCalculateStrategy{
    @Override
    public void calculateHeight(Collection<EngineeringObject> engineeringObject) {
        System.out.println("Calculate railway's bridge height.");
    }
}
