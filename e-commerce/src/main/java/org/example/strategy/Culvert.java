package org.example.strategy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Culvert {
    private double height;
    private double length;
    private double diameter;
    private double span;
    private String shape;
    private Way kind;
    private double probability;
    private double flow;

    @Builder
    public Culvert(Type type, double length, double diameter, double span, Way kind, double probability, double flow) {
        this.length = length;
        this.diameter = diameter;
        this.span = span;
        this.kind = kind;
        this.probability = probability;
        this.flow = flow;
    }

}
