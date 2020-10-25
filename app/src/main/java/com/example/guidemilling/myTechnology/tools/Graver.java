package com.example.guidemilling.myTechnology.tools;

public class Graver extends Tool {



    public Graver() { // default constructor
        this.diameter=6;
    }

    public Graver(int diameter, int numberTooth) {
        super(diameter, numberTooth);
    }
}
