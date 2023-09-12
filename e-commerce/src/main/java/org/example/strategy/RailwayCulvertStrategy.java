package org.example.strategy;

import java.util.Collection;

public class RailwayCulvertStrategy implements HeightCalculateStrategy{

    @Override
    public void calculateHeight(Collection<EngineeringObject> engineeringObject) {
        System.out.println("Calculate railway's culvert height.");
    }
}
