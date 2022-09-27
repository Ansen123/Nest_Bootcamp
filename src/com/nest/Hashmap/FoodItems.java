package com.nest.Hashmap;

public class FoodItems {
    public int getTea() {
        return tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setBiriyani(int biriyani) {
        this.biriyani = biriyani;
    }

    public void setNeiroast(int neiroast) {
        this.neiroast = neiroast;
    }

    public void setRice(int rice) {
        this.rice = rice;
    }

    public int getBiriyani() {
        return biriyani;
    }

    public int getNeiroast() {
        return neiroast;
    }

    public int getRice() {
        return rice;
    }

    public FoodItems(int tea, int coffee, int biriyani, int neiroast, int rice) {
        this.tea = tea;
        this.coffee = coffee;
        this.biriyani = biriyani;
        this.neiroast = neiroast;
        this.rice = rice;
    }

    int tea, coffee, biriyani, neiroast, rice;
}

