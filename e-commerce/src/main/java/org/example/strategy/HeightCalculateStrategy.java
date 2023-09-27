package org.example.strategy;

import java.util.List;

public interface HeightCalculateStrategy<T> {
    void calculateHeight(List<T> engineeringObjects);
}
