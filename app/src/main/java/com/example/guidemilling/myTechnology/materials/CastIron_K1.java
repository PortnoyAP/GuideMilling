package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class CastIron_K1 extends Material {

//Grey Cast Iron

    public CastIron_K1 () {

        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;

        this.maximumCuttingSpeedMilling =130.0f;
        this.minimumCuttingSpeedMilling =100.0f;
        this.type="K1";
        this.nameMaterial="Grey Cast Iron";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0078f);
        this.feedsPerToothMilling.put(2,0.0123f);
        this.feedsPerToothMilling.put(3, 0.0168f);
        this.feedsPerToothMilling.put(4,0.0207f);
        this.feedsPerToothMilling.put(5,0.0252f);
        this.feedsPerToothMilling.put(6,0.0322f);
        this.feedsPerToothMilling.put(8,0.0442f);
        this.feedsPerToothMilling.put(10,0.0509f);
        this.feedsPerToothMilling.put(12,0.0583f);
        this.feedsPerToothMilling.put(14,0.0635f);
        this.feedsPerToothMilling.put(16,0.0689f);
        this.feedsPerToothMilling.put(18,0.0805f);
        this.feedsPerToothMilling.put(20,0.0833f);
        this.feedsPerToothMilling.put(25,0.1065f);

    }






















}
