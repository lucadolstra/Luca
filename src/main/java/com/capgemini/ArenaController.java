package com.capgemini;

import java.util.ArrayList;

public class ArenaController {
    private Contestant contestant;
    private ArrayList<Contestant> contestants = new ArrayList<>();


    //Omdat ik een blackout had ben ik om 13:10 in paniek opnieuw begonnen en kan ik de opdracht dus niet afmaken.

    public ArenaController() {

        for (int i = 1; i < 8; i++) {
            contestants.add(this.contestant = new DistrictContestant(i, EGender.female, (int) (Math.random() * 100), (int) (Math.random() * 100), true));
        }
        for (int i = 9; i < 24; i++) {
            contestants.add(this.contestant = new CarreerContestant(i, EGender.female, (int) (Math.random() * 140), (int) (Math.random() * 140), true, true));
        }
    }


    public void printArena() {
        for (Contestant con : contestants) {

            if (con instanceof DistrictContestant) {
                Contestant tempcon = (DistrictContestant) con;
                System.out.println(con.getContestantId() + " Gender: " + con.getGender() + "Stats: " + "Health: " +
                        con.getHealth() + "Skills" + con.getSkill() + "Status alive:" + con.getAlive());

                if (con instanceof CarreerContestant) {
                    Contestant tempcon2 = (CarreerContestant) con;
                    System.out.println(con.getContestantId() + " Gender: " + con.getGender() + "Stats: " + "Health: " +
                            con.getHealth() + "Skills" + con.getSkill() + "Status alive:" + con.getAlive());
                }
            }
        }
    }
}
