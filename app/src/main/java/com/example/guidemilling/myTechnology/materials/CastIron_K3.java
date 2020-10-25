package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class CastIron_K3 extends Material {


    //High-Strength Ductile Irons and Austempered Ductile Iron(ADI)

    public CastIron_K3() {

        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;

        this.maximumCuttingSpeedMilling = 120.0f;
        this.minimumCuttingSpeedMilling = 90.0f;
        this.type = "K3";
        this.nameMaterial="High-Strength Ductile IronsADI";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();
        this.feedsPerToothMilling.put(1, 0.0065f);
        this.feedsPerToothMilling.put(2, 0.0101f);
        this.feedsPerToothMilling.put(3, 0.0129f);
        this.feedsPerToothMilling.put(4, 0.0150f);
        this.feedsPerToothMilling.put(5, 0.0178f);
        this.feedsPerToothMilling.put(6, 0.0237f);
        this.feedsPerToothMilling.put(8, 0.0326f);
        this.feedsPerToothMilling.put(10, 0.0376f);
        this.feedsPerToothMilling.put(12, 0.0424f);
        this.feedsPerToothMilling.put(14, 0.0462f);
        this.feedsPerToothMilling.put(16, 0.05f);
        this.feedsPerToothMilling.put(18, 0.056f);
        this.feedsPerToothMilling.put(20, 0.0623f);
        this.feedsPerToothMilling.put(25, 0.0795f);

    }


}