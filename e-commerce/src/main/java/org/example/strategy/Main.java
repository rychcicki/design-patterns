package org.example.strategy;

import lombok.extern.java.Log;

import java.util.List;

@Log
public class Main {
    static final List<Culvert> CULVERT_LIST = CulvertBuilder.buildListOfCulverts();
    static final List<Bridge> BRIDGE_LIST = BridgeBuilder.buildListOfBridges();

    public static void main(String[] args) {
        HeightCalculateService heightService = new HeightCalculateService(new RailwayBridgeStrategy());
        heightService.calculateHeight(BRIDGE_LIST);

        HeightCalculateService heightService2 = new HeightCalculateService(new RailwayCulvertStrategy());
        heightService2.calculateHeight(CULVERT_LIST);

        HeightCalculateService heightService3 = new HeightCalculateService(new RoadBridgeStrategy());
        heightService3.calculateHeight(BRIDGE_LIST);

        HeightCalculateService heightService4 = new HeightCalculateService(new RoadCulvertStrategy());
        heightService4.calculateHeight(CULVERT_LIST);
    }
}
