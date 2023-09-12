package org.example.strategy;

import java.util.List;
import java.util.Set;

public class BridgeBuilder {
     static List<Bridge> buildListOfBridges(){
        Bridge bridge1 = Bridge.builder()
                .kind(Way.RAILWAY)
                .minimalLengthOfOpening(15.9)
                .waterSurface(124.60)
                .probability(0.3)
                .flow(27.4)
                .build();
        Bridge bridge2 = Bridge.builder()
                .kind(Way.ROAD)
                .minimalLengthOfOpening(6.5)
                .waterSurface(124.60)
                .probability(0.5)
                .flow(17.1)
                .build();
        return List.of(bridge1,bridge2);
    }
}
