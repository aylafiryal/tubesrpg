package com.example.tubesrpg;

public class Sword extends Attack{

    private Excalibur excalibur = new Excalibur();
    private BlackExcalibur blackExcalibur = new BlackExcalibur();
    private int damage = 25;
    
    public Sword(){

    }

    @Override
    public int Attack(String sword_type){
        if(sword_type.equalsIgnoreCase("Excalibur")){
            damage = damage + excalibur.getPoint_damage();
        }
        if(sword_type.equalsIgnoreCase("Black Excalibur")){
            damage = damage + blackExcalibur.getPoint_damage();
        }
        return damage;
    }
    
}
