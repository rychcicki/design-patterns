package org.example.strategy;

import java.util.List;

public class CulvertBuilder {
    static List<Culvert> buildListOfCulverts() {
        Culvert culvert1 = Culvert.builder()
                .kind(Way.ROAD)
                .length(12.1)
                .diameter(0.8)
                .span(0.8)
                .probability(1.0)
                .flow(0.84)
                .build();
        Culvert culvert2 = Culvert.builder()
                .kind(Way.RAILWAY)
                .length(15.5)
                .diameter(2)
                .span(2)
                .probability(1.0)
                .flow(4.78)
                .build();
        return List.of(culvert1, culvert2);
    }
}
