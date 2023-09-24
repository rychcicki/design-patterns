package org.example.strategy;

import java.util.List;

public class RoadCulvertStrategy implements HeightCalculateStrategy {
    @Override
    public void calculateHeight(List<?> engineeringObject) {
        List<Culvert> culvertList = CulvertBuilder.buildNewCulvertFromObject(engineeringObject);

        List<Culvert> culverts = culvertList.stream()
                .filter(culvert -> culvert.getKind().equals(Way.ROAD))
                .peek(culvert -> culvert.setHeight(culvert.getDiameter() + 0.25))
                .toList();
        for (Culvert culvert : culverts) {
            System.out.println("Road's culvert height level is at: " + culvert.getHeight() + " m.");
        }

        System.out.println("Calculate road's culvert height finished.");
        System.out.println("Your road's culvert: " + culverts + "\n");
    }
}
