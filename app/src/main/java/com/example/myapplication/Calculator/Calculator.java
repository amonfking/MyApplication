package com.example.myapplication.Calculator;

public class Calculator {

    private float first, second;

    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }

    public float sum(){
        return this.getFirst() + this.getSecond();
    }

    public float sub(){
        return this.getFirst() - this.getSecond();
    }

    public float div(){
        return this.getFirst() / this.getSecond();
    }

    public float mul(){
        return this.getFirst() * this.getSecond();
    }
}
