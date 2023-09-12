package org.example.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EngineeringObject {
    static final List<Culvert> CULVERT_LIST = CulvertBuilder.buildListOfCulverts();
    static final List<Bridge> BRIDGE_LIST = BridgeBuilder.buildListOfBridges();
    public EngineeringObject makeCollectionOfObjects(){
        EngineeringObject engineeringObject = new EngineeringObject();
        List<EngineeringObject> engineeringObjects = new ArrayList<>();
        engineeringObjects.add(CULVERT_LIST);
        return engineeringObjects;
    }


}
