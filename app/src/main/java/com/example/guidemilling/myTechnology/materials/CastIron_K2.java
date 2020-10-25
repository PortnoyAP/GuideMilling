package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class CastIron_K2 extends Material {


    //High-Strength Austentic Stainless and Cast Stainless Steels

    public CastIron_K2 () {

        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;

        this.maximumCuttingSpeedMilling =120.0f;
        this.minimumCuttingSpeedMilling =100.0f;

        this.type="K2";
        this.nameMaterial="Low/Medium-Strength Ductile Irons/CGI";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.007f);
        this.feedsPerToothMilling.put(2,0.0109f);
        this.feedsPerToothMilling.put(3, 0.0148f);
        this.feedsPerToothMilling.put(4,0.0181f);
        this.feedsPerToothMilling.put(5,0.0229f);
        this.feedsPerToothMilling.put(6,0.0278f);
        this.feedsPerToothMilling.put(8,0.0396f);
        this.feedsPerToothMilling.put(10,0.0444f);
        this.feedsPerToothMilling.put(12,0.0520f);
        this.feedsPerToothMilling.put(14,0.056f);
        this.feedsPerToothMilling.put(16,0.060f);
        this.feedsPerToothMilling.put(18,0.069f);
        this.feedsPerToothMilling.put(20,0.0743f);
        this.feedsPerToothMilling.put(25,0.097f);

    }












}
