package com.company;

public class Envelope {

    private float[] arr = new float[4];
    private float sideA;
    private float sideB;
    private float sideC;
    private float sideD;

    public Envelope(float sideA, float sideB, float sideC, float sideD){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public Envelope() {

    }

    public float[] getArr(float[] arr) {
        return this.arr;
    }

    public void setArr(float[] arr) {
        this.arr = arr;
    }

}
