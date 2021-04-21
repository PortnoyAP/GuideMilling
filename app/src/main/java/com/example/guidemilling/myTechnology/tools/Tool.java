package com.example.guidemilling.myTechnology.tools;

public abstract class Tool {

    protected int diameter;
    protected int numberTooth;


    public Tool() {
    }

    public Tool(int diameter, int numberTooth) {
        this.diameter = diameter;
        this.numberTooth = numberTooth;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getNumberTooth() {
        return numberTooth;
    }

    public void setNumberTooth(int numberTooth) {
        this.numberTooth = numberTooth;
    }
}
