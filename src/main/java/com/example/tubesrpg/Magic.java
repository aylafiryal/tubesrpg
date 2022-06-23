package com.example.tubesrpg;

public class Magic extends Attack {
    
    private Teleport teleport = new Teleport();
    private Electroshock electroshock = new Electroshock();
    private int damage = 50;

    public Magic(){

    }

    @Override
    public int Attack(String spell){
        if(spell.equals("Teleportasi")){
            damage = damage + teleport.getPoint_damage();
        }
        if(spell.equals("Syok listrik")){
            damage = damage + electroshock.getPoint_damage();
        }
        return damage;
    }

}
