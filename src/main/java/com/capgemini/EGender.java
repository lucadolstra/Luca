package com.capgemini;

public enum EGender {
    male (1),
    female (2),
    nobinary (3);

    private int gender;

    EGender(int gender){
        this.gender = gender;
    }


}
