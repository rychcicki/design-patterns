package org.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class CulvertBuilder<T> {
    static List<Culvert> buildListOfCulverts() {
        Culvert culvert1 = Culvert.builder()
                .type(Type.CULVERT)
                .kind(Way.ROAD)
                .length(12.1)
                .diameter(0.8)
                .span(0.8)
                .probability(1.0)
                .flow(0.84)
                .build();
        Culvert culvert2 = Culvert.builder()
                .type(Type.CULVERT)
                .kind(Way.RAILWAY)
                .length(15.5)
                .diameter(2)
                .span(2)
                .probability(1.0)
                .flow(4.78)
                .build();
        return List.of(culvert1, culvert2);
    }

    public List<T> buildNewCulvertFromObject(List<T> engineeringObject) {
        List<T> culvertList = new ArrayList<>();
        for (T t : engineeringObject) {
            if (t instanceof Culvert) {
                culvertList.add(t);
            }
        }
        return culvertList;
    }
}
