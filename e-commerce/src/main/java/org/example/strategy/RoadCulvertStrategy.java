package org.example.strategy;

import java.util.Collection;

public class RoadCulvertStrategy implements HeightCalculateStrategy{
    @Override
    public void calculateHeight(Collection<EngineeringObject> engineeringObject) {
        System.out.println("Calculate road's culvert height.");
    }
}
