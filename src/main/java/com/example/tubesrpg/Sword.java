package com.example.tubesrpg;

public class Sword extends Attack{

    private Excalibur excalibur;
    private BlackExcalibur blackExcalibur;
    private int damage = 25;
    
    public Sword(){

    }

    @Override
    public int Attack(String sword_type){
        if(sword_type.equals("Excalibur")){
            damage = damage + excalibur.getPoint_damage();
        }
        if(sword_type.equals("Black Excalibur")){
            damage = damage + blackExcalibur.getPoint_damage();
        }
        return damage;
    }
    
}
