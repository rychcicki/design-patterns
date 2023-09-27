package org.example.strategy;

import lombok.extern.java.Log;

import java.util.List;

@Log
public class RoadCulvertStrategy implements HeightCalculateStrategy<Culvert> {
    @Override
    public void calculateHeight(List engineeringObject) {
        List<Culvert> culvertList = new CulvertBuilder<>().buildNewCulvertFromObject(engineeringObject);

        List<Culvert> culverts = culvertList.stream()
                .filter(culvert -> culvert.getKind().equals(Way.ROAD))
                .peek(culvert -> {
                    culvert.setHeight(culvert.getDiameter() + 0.25);
                    log.info("Road's culvert height level is at: " + culvert.getHeight() + " m.");
                })
                .toList();
        log.info("Calculate road's culvert height finished.\nYour road's culvert: " + culverts + "\n");
    }
}
