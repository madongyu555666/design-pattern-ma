package com.design.pattern;

public class EstablishCommodity {

    private Commodity commodity;

    public EstablishCommodity(Commodity commodity){
        this.commodity=commodity;
    }
    public  Commodity startClone(Commodity commodity){
        return (Commodity)commodity.clone();
    }
}
