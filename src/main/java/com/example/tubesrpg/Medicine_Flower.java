package com.example.tubesrpg;

public class Medicine_Flower implements Heal {
    
    private int point_heal = 10;

    @Override
    public int addStrength() {
        
        return point_heal;
    } 
}
