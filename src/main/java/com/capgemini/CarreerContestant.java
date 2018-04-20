package com.capgemini;

public class CarreerContestant extends Contestant{

   private boolean hasGift;

    public CarreerContestant(int id, EGender gender, int health, int skill, Boolean isAlive, Boolean hasGift) {
        super(id, gender, health, skill, isAlive);
        health++;
        skill++;
        hasGift = true;

    }

    public boolean isHasGift() {
        return hasGift;
    }

    public void setHasGift(boolean hasGift) {
        this.hasGift = hasGift;
    }
}


