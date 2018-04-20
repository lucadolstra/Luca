package com.capgemini;

public abstract class Contestant {

    private int contestantId;
    private EGender gender;
    private int health = 10;
    private int skill = 5;
    private int defenceLevel = 5;
    private int drive = 5;
    private Boolean hasBonusItem = false;
    private Boolean isAlive = true;

    public Contestant(int contestantId, int skill) {
        this.contestantId = contestantId;
        this.gender = gender;
    }

    public Contestant(int id, EGender gender, int health, int skill, Boolean isAlive){
        this.contestantId = id;
        this.gender = gender;
        this.health =  health;
        this.isAlive = isAlive;
    }

    public Contestant(int id, EGender gender, int health, int skill, int defenceLevel, int drive, Boolean hasBonusItem, Boolean isAlive) {

        this.contestantId = id;
        this.gender = gender;
        this.health = health;
        this.skill = skill;
        this.defenceLevel = defenceLevel;
        this.drive = drive;
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

    public int getSkill() {

        return skill;
    }

    public void setSkill(int skill) {

        this.skill = skill;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public void calculateHealth() {
        this.health = (int) (Math.random() * 100);
    }

    public int calculateSkill() {
        this.skill = (int) (Math.random() * 100);
        return skill;
    }

    public void calculateDefence() {
        this.defenceLevel = (int) (Math.random() * 100);
    }

    public void calculateDrive() {
        this.defenceLevel = (int) (Math.random() * 100);
    }

    public EGender calculateGender() {
        if (Math.random() < 0.3) {
            gender = EGender.male;
        }
        if (Math.random() > 0.3 && Math.random() < 0.7) {
            gender = EGender.female;
        }
        if (Math.random() > 0.7) {
            gender = EGender.nonbinary;
        }
        return gender;
    }

    }





