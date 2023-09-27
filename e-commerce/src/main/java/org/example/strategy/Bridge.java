package org.example.strategy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Bridge {
    private double height;
    private double width;
    private double minimalLengthOfOpening;
    private double waterSurface;
    private Way kind;
    private double probability;
    private double flow;

    @Builder
    public Bridge(Type type, double minimalLengthOfOpening, double waterSurface, Way kind, double probability, double flow) {
        this.minimalLengthOfOpening = minimalLengthOfOpening;
        this.waterSurface = waterSurface;
        this.kind = kind;
        this.probability = probability;
        this.flow = flow;
    }
}
