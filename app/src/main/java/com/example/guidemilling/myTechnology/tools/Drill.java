package com.example.guidemilling.myTechnology.tools;

public class Drill extends Tool  {


    public Drill() {
        this.numberTooth=2;
    }

    public Drill(int diameter ) {  //default numberTooth of BluetoothA2dp is 2
        super(diameter,2);
    }
}
