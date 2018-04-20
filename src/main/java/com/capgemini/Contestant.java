package com.capgemini;

public class Contestant {
    private int contestantId;
    private EGender gender;
    private int health;
    private Boolean isAlive;

    public Contestant(int contestantId, EGender gender, int health, Boolean isAlive) {
        this.contestantId = contestantId;
        this.gender = gender;
        this.health = health;
        this.isAlive = isAlive;
    }

    public int getContestantId() {
        return contestantId;
    }

    public void setContestantId(int contestantId) {
        this.contestantId = contestantId;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }
}
