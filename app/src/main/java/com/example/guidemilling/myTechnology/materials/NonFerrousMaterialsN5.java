package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN5 extends Material {

    public NonFerrousMaterialsN5() {

        this.maximumCuttingSpeedMilling =1000.0f;
        this.minimumCuttingSpeedMilling =250.0f;
        this.type="N5";
        this.nameMaterial="Nylon/Plastic/Rubbers/Phenolics/Resins/Fibreglass";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();

        this.feedsPerToothMilling.put(1,0.0212f);
        this.feedsPerToothMilling.put(2,0.0219f);
        this.feedsPerToothMilling.put(3,0.0263f);
        this.feedsPerToothMilling.put(4,0.0291f);
        this.feedsPerToothMilling.put(5,0.0348f);
        this.feedsPerToothMilling.put(6,0.0399f);
        this.feedsPerToothMilling.put(8,0.0531f);
        this.feedsPerToothMilling.put(10,0.0649f);
        this.feedsPerToothMilling.put(12,0.0758f);
        this.feedsPerToothMilling.put(14,0.0865f);
        this.feedsPerToothMilling.put(16,0.0970f);
        this.feedsPerToothMilling.put(18,0.1141f);
        this.feedsPerToothMilling.put(20,0.1170f);
        this.feedsPerToothMilling.put(25,0.1500f);



    }
}
