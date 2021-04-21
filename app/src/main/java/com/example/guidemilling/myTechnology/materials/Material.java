package com.example.guidemilling.myTechnology.materials;

import com.example.guidemilling.R;

import java.util.HashMap;

import static java.lang.Math.PI;

public abstract class Material {
    final static int FIRST_RECOMMENDATION_SIDE_MILLING = R.string.side_milling_first_recomm;
    final static int SECOND_RECOMMENDATION_SIDE_MILLING = R.string.side_milling_second_recomm;
    final static int FIRST_RECOMMENDATION_SLOT_MILLING = R.string.slot_milling_first_recomm;
    final static int SECOND_RECOMMENDATION_SLOT_MILLING = R.string.slot_milling_second_recomm;

    final static int FIRST_RECOMMENDATION_DRILLING_HSS = R.string.drill_first_recomm;
    final static int SECOND_RECOMMENDATION_DRILLING_HSS = R.string.drill_second_recomm;

    protected Float maximumCuttingSpeedMilling;
    protected Float minimumCuttingSpeedMilling;
    protected Float cuttingSpeedDrillingHss;

    protected Float sideMillingDepthCorrection;
    protected Float sideMillingWidthCorrection;
    protected Float slotMillingDepthCorrection;
    protected Float peckDrillHssCorrection;

    protected String type;
    protected String nameMaterial;

    protected HashMap<Integer, Float> feedsPerToothMilling;
    protected HashMap<Integer, Float> feedPerToothDrillingHss;

    protected int spindleSpeedMillingCalculatedMaximum;
    protected int spindleSpeedMillingCalculatedMinimum;
    protected int feedMillingCalculatedMaximum;
    protected int feedMillingCalculatedMinimum;
    protected int sideMillingDepth;
    protected int sideMillingWidth;
    protected int slotMillingDepth;
    protected int spindleSpeedDrillHssCalculated;
    protected int feedDrillHssCalculated;
    protected int peckDrillHss;

    public Material() {
    }

    public int calculateMillingSpindleSpeedMaximum(int toolDiameter) {
        this.spindleSpeedMillingCalculatedMaximum = (int) ((maximumCuttingSpeedMilling * 1000) / (toolDiameter * PI));
        if (spindleSpeedMillingCalculatedMaximum > 15000) {
            spindleSpeedMillingCalculatedMaximum = 15000;
        }
        return spindleSpeedMillingCalculatedMaximum;
    }

    public int calculateMillingSpindleSpeedMinimum(int toolDiameter) {
        this.spindleSpeedMillingCalculatedMinimum = (int) ((minimumCuttingSpeedMilling * 1000) / (toolDiameter * PI));
        if (spindleSpeedMillingCalculatedMinimum > 15000) {
            spindleSpeedMillingCalculatedMinimum = 15000;
        }
        return spindleSpeedMillingCalculatedMinimum;
    }

    public int calculateMillingFeedMaximum(int numberToothTool, int toolDiameter) {
        this.feedMillingCalculatedMaximum = (int) (numberToothTool * feedsPerToothMilling.get(toolDiameter) * this.spindleSpeedMillingCalculatedMaximum);
        return feedMillingCalculatedMaximum;
    }

    public int calculateMillingFeedMinimum(int numberToothTool, int toolDiameter) {
        this.feedMillingCalculatedMinimum = (int) (numberToothTool * feedsPerToothMilling.get(toolDiameter) * this.spindleSpeedMillingCalculatedMinimum);
        return feedMillingCalculatedMinimum;
    }


    public int calculateDrillHssSpindleSpeed(int toolDiameter) {
        this.spindleSpeedDrillHssCalculated = (int) ((cuttingSpeedDrillingHss * 1000) / (toolDiameter * PI));
        return spindleSpeedDrillHssCalculated;
    }

    public int calculateDrillingFeed(int numberToothTool, int toolDiameter) {
        this.feedDrillHssCalculated = (int) (numberToothTool * feedPerToothDrillingHss.get(toolDiameter) * this.spindleSpeedDrillHssCalculated);
        return feedDrillHssCalculated;
    }


    public int calculateSideMillingDepth(int toolDiameter) {
        this.sideMillingDepth = (int) (toolDiameter * sideMillingDepthCorrection);
        return sideMillingDepth;
    }

    public int calculateSideMillingWidth(int toolDiameter) {
        this.sideMillingWidth = (int) (toolDiameter * sideMillingWidthCorrection);
        return sideMillingWidth;
    }

    public int calculateSlotMillingDepth(int toolDiameter) {
        this.slotMillingDepth = (int) (toolDiameter * slotMillingDepthCorrection);
        return slotMillingDepth;
    }

    public int calculatePeckDepthHss(int toolDiameter) {
        this.peckDrillHss = (int) (toolDiameter * peckDrillHssCorrection);
        return peckDrillHss;
    }


    public Float getMaximumCuttingSpeedMilling() {
        return maximumCuttingSpeedMilling;
    }

    public void setMaximumCuttingSpeedMilling(Float maximumCuttingSpeedMilling) {
        this.maximumCuttingSpeedMilling = maximumCuttingSpeedMilling;
    }

    public Float getMinimumCuttingSpeedMilling() {
        return minimumCuttingSpeedMilling;
    }

    public void setMinimumCuttingSpeedMilling(Float minimumCuttingSpeedMilling) {
        this.minimumCuttingSpeedMilling = minimumCuttingSpeedMilling;
    }

    public Float getSideMillingDepthCorrection() {
        return sideMillingDepthCorrection;
    }

    public void setSideMillingDepthCorrection(Float sideMillingDepthCorrection) {
        this.sideMillingDepthCorrection = sideMillingDepthCorrection;
    }

    public Float getSideMillingWidthCorrection() {
        return sideMillingWidthCorrection;
    }

    public void setSideMillingWidthCorrection(Float sideMillingWidthCorrection) {
        this.sideMillingWidthCorrection = sideMillingWidthCorrection;
    }

    public Float getSlotMillingDepthCorrection() {
        return slotMillingDepthCorrection;
    }

    public void setSlotMillingDepthCorrection(Float slotMillingDepthCorrection) {
        this.slotMillingDepthCorrection = slotMillingDepthCorrection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameMaterial() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = nameMaterial;
    }

    public HashMap<Integer, Float> getFeedsPerToothMilling() {
        return feedsPerToothMilling;
    }

//    public void setFeedsPerToothMilling(HashMap<Integer, Float> feedsPerToothMilling) {
//        this.feedsPerToothMilling = feedsPerToothMilling;
//    }
//
//    public int getSpindleSpeedMillingCalculatedMaximum() {
//        return spindleSpeedMillingCalculatedMaximum;
//    }
//
//    public void setSpindleSpeedMillingCalculatedMaximum(int spindleSpeedMillingCalculatedMaximum) {
//        this.spindleSpeedMillingCalculatedMaximum = spindleSpeedMillingCalculatedMaximum;
//    }
//
//    public int getSpindleSpeedMillingCalculatedMinimum() {
//        return spindleSpeedMillingCalculatedMinimum;
//    }
//
//    public void setSpindleSpeedMillingCalculatedMinimum(int spindleSpeedMillingCalculatedMinimum) {
//        this.spindleSpeedMillingCalculatedMinimum = spindleSpeedMillingCalculatedMinimum;
//    }
//
//    public int getFeedMillingCalculatedMaximum() {
//        return feedMillingCalculatedMaximum;
//    }
//
//    public void setFeedMillingCalculatedMaximum(int feedMillingCalculatedMaximum) {
//        this.feedMillingCalculatedMaximum = feedMillingCalculatedMaximum;
//    }
//
//    public int getFeedMillingCalculatedMinimum() {
//        return feedMillingCalculatedMinimum;
//    }
//
//    public void setFeedMillingCalculatedMinimum(int feedMillingCalculatedMinimum) {
//        this.feedMillingCalculatedMinimum = feedMillingCalculatedMinimum;
//    }


    public int getFirstRecommendationForSideMilling() {
        return FIRST_RECOMMENDATION_SIDE_MILLING;
    }

    public int getSecondRecommendationForSideMilling() {
        return SECOND_RECOMMENDATION_SIDE_MILLING;
    }

    public int getFirstRecommendationForDrillingHss() {
        return FIRST_RECOMMENDATION_DRILLING_HSS;
    }

    public int getSecondRecommendationForDrillingHss() {
        return SECOND_RECOMMENDATION_DRILLING_HSS;
    }

    public int getFirstRecommendationSlotMilling() {
        return FIRST_RECOMMENDATION_SLOT_MILLING;
    }

    public int getSecondRecommendationSlotMilling() {
        return SECOND_RECOMMENDATION_SLOT_MILLING;
    }
}