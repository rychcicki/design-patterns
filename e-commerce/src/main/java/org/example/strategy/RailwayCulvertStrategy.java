package org.example.strategy;

import lombok.extern.java.Log;

import java.util.List;

@Log
public class RailwayCulvertStrategy implements HeightCalculateStrategy<Culvert> {
    @Override
    public void calculateHeight(List engineeringObject) {
        List<Culvert> culvertList = new CulvertBuilder<>().buildNewCulvertFromObject(engineeringObject);

        List<Culvert> culverts = culvertList.stream()
                .filter(culvert -> culvert.getKind().equals(Way.RAILWAY))
                .peek(culvert -> {
                    culvert.setHeight(culvert.getDiameter() + 0.5);
                    log.info("Railway's culvert height level is at: " + culvert.getHeight() + " m.");
                })
                .toList();
        log.info("Calculate Railway's culvert height finished.\nYour Railway's culvert: " + culverts + "\n");
    }
}
