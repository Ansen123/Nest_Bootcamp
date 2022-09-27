package com.nest.hotel;

import java.util.Scanner;

public class Hotel {
    int tea;
    int coffie;

    public void setTea(int tea) {
        this.tea = tea;
    }

    public void setCoffie(int coffie) {
        this.coffie = coffie;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }

    int juice;

    public int getTea() {
        return tea;
    }

    public int getCoffie() {
        return coffie;
    }

    public int getJuice() {
        return juice;

    }

    public Hotel(int tea, int coffie, int juice) {
        this.tea = tea;
        this.coffie = coffie;
        this.juice = juice;
    }

    public static void main(String[] args) {
        Hotel h = new Hotel(10, 25, 30);

        h.getCoffie();
        h.getJuice();

    }
}

