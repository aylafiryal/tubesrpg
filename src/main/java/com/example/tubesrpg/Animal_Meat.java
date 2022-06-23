package com.example.tubesrpg;

public class Animal_Meat implements Heal {

    private int point_heal = 20;

    @Override
    public int addStrength() {
        return point_heal;
    }
    
}
