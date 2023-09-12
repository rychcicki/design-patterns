package org.example.strategy;

import lombok.extern.java.Log;

import java.util.Scanner;
@Log
public class Main {
    public static void main(String[] args){
        HeightService heightService = new HeightService(new RailwayBridgeStrategy());
        heightService.calculateHeight();
    }
}
