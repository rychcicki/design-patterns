package org.example.strategy;

import lombok.extern.java.Log;

import java.util.List;

@Log
public class RailwayBridgeStrategy implements HeightCalculateStrategy<Bridge> {
    @Override
    public void calculateHeight(List engineeringObject) {
        List<Bridge> bridgeList = new BridgeBuilder<>().buildNewBridgeFromObjects(engineeringObject);

        List<Bridge> bridges = bridgeList.stream()
                .filter(bridge -> bridge.getKind().equals(Way.RAILWAY))
                .peek(bridge -> {
                    bridge.setHeight(bridge.getWaterSurface() + 0.5);
                    log.info("Railway's bridge height level is at: " + bridge.getHeight() + " m.");
                })
                .toList();
        log.info("Calculate railway's bridge height finished.\nYour railway's bridge: " + bridges + "\n");
    }
}
