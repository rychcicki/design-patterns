package org.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class BridgeBuilder {
    static List<Bridge> buildListOfBridges() {
        Bridge bridge1 = Bridge.builder()
                .type(Type.BRIDGE)
                .kind(Way.RAILWAY)
                .minimalLengthOfOpening(15.9)
                .waterSurface(124.60)
                .probability(0.3)
                .flow(27.4)
                .build();
        Bridge bridge2 = Bridge.builder()
                .type(Type.BRIDGE)
                .kind(Way.ROAD)
                .minimalLengthOfOpening(6.5)
                .waterSurface(124.60)
                .probability(0.5)
                .flow(17.1)
                .build();
        return List.of(bridge1, bridge2);
    }

    public static List<Bridge> buildNewBridgeFromObjects(List<?> engineeringObject) {
        List<Bridge> bridgeList = new ArrayList<>();
        for (Object bridge : engineeringObject) {
            bridgeList.add((Bridge) bridge);
        }
        return bridgeList;
    }
}
