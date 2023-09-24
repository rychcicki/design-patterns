package org.example.strategy;

import java.util.List;

public class RailwayCulvertStrategy implements HeightCalculateStrategy {

    @Override
    public void calculateHeight(List<?> engineeringObject) {
        List<Culvert> culvertList = CulvertBuilder.buildNewCulvertFromObject(engineeringObject);

        List<Culvert> culverts = culvertList.stream()
                .filter(culvert -> culvert.getKind().equals(Way.RAILWAY))
                .peek(culvert -> culvert.setHeight(culvert.getDiameter() + 0.5))
                .toList();
        for (Culvert culvert : culverts) {
            System.out.println("Railway's culvert height level is at: " + culvert.getHeight() + " m.");
        }

        System.out.println("Calculate Railway's culvert height finished.");
        System.out.println("Your Railway's culvert: " + culverts + "\n");
    }
}
