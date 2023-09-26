package org.example.strategy;

import lombok.extern.java.Log;

import java.util.List;

@Log
public class RoadBridgeStrategy implements HeightCalculateStrategy<Bridge> {
    @Override
    public void calculateHeight(List engineeringObject) {
        List<Bridge> bridgeList = new BridgeBuilder<>().buildNewBridgeFromObjects(engineeringObject);

        List<Bridge> bridges = bridgeList.stream()
                .filter(bridge -> bridge.getKind().equals(Way.ROAD))
                .peek(bridge -> {
                    bridge.setHeight(bridge.getWaterSurface() + 1);
                    log.info("Road's bridge height level is at: " + bridge.getHeight() + " m.");
                })
                .toList();
        log.info("Calculate road's bridge height finished.\nYour road's bridge: " + bridges + "\n");
    }
}
