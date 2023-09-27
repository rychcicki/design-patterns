package org.example.strategy;

import java.util.List;

public class RoadBridgeStrategy implements HeightCalculateStrategy {
    @Override
    public void calculateHeight(List<?> engineeringObject) {
        List<Bridge> bridgeList = BridgeBuilder.buildNewBridgeFromObjects(engineeringObject);

        List<Bridge> bridges = bridgeList.stream()
                .filter(bridge -> bridge.getKind().equals(Way.ROAD))
                .peek(bridge -> bridge.setHeight(bridge.getWaterSurface() + 1))
                .toList();

        for (Bridge bridge : bridges) {
            System.out.println("Road's bridge height level is at: " + bridge.getHeight() + " m.");
        }

        System.out.println("Calculate road's bridge height finished.");
        System.out.println("Your road's bridge: " + bridges + "\n");
    }
}
