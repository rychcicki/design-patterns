package org.example.strategy;

import java.util.List;

public class RailwayBridgeStrategy implements HeightCalculateStrategy {
    @Override
    public void calculateHeight(List<?> engineeringObject) {
        List<Bridge> bridgeList = BridgeBuilder.buildNewBridgeFromObjects(engineeringObject);

        List<Bridge> bridges = bridgeList.stream()
                .filter(bridge -> bridge.getKind().equals(Way.RAILWAY))
                .peek(bridge -> bridge.setHeight(bridge.getWaterSurface() + 0.5))
                .toList();

        for (Bridge bridge : bridges) {
            System.out.println("Railway's bridge height level is at: " + bridge.getHeight() + " m.");
        }

        System.out.println("Calculate railway's bridge height finished.");
        System.out.println("Your railway's bridge: " + bridges + "\n");
    }
}
