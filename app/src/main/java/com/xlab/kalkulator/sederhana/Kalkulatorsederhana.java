package com.xlab.kalkulator.sederhana;

public class Kalkulatorsederhana {
    private int op1;
    private int op2;

    public Kalkulatorsederhana() {
        this.op1 = 0;
        this.op2 = 0;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int jumlah (){
        return this.op1 + this.op2;
    }
}
