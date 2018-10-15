package com.smtel.sample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OrderDetail implements Serializable {

    @JsonProperty("1K")
    private int k1;
    @JsonProperty("5K")
    private int k5;
    @JsonProperty("10K")
    private int k10;
    @JsonProperty("15K")
    private int k15;
    @JsonProperty("20K")
    private int k20;
    @JsonProperty("25K")
    private int k25;
    @JsonProperty("50K")
    private int k50;
    @JsonProperty("100K")
    private int k100;

    public int getK1() {
        return k1;
    }

    public void setK1(int k1) {
        this.k1 = k1;
    }

    public int getK5() {
        return k5;
    }

    public void setK5(int k5) {
        this.k5 = k5;
    }

    public int getK10() {
        return k10;
    }

    public void setK10(int k10) {
        this.k10 = k10;
    }

    public int getK15() {
        return k15;
    }

    public void setK15(int k15) {
        this.k15 = k15;
    }

    public int getK20() {
        return k20;
    }

    public void setK20(int k20) {
        this.k20 = k20;
    }

    public int getK25() {
        return k25;
    }

    public void setK25(int k25) {
        this.k25 = k25;
    }

    public int getK50() {
        return k50;
    }

    public void setK50(int k50) {
        this.k50 = k50;
    }

    public int getK100() {
        return k100;
    }

    public void setK100(int k100) {
        this.k100 = k100;
    }
}
