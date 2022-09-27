package com.nest.Coffeeshop;

public class Fooditem {



    public Fooditem(Integer Porotta, Integer blackTea, Integer tea, Integer cake, Integer coffee, Integer vada) {
        Porotta = Porotta;
        BlackTea = blackTea;
        Tea = tea;

    }

    public Integer getPorotta() {
        return Porotta;
    }

    public void setPorotta(Integer porotta) {
        Porotta = porotta;
    }

    public void setBlackTea(Integer blackTea) {
        BlackTea = blackTea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getBlackTea() {
        return BlackTea;
    }

    public Integer getTea() {
        return Tea;
    }

    Integer Porotta;
    Integer BlackTea;
    Integer Tea;

}
