package com.example.tubesrpg;

public class Player {
    private int strength = 50;
    private int health = 50;
    private Animal_Meat animal_Meat = new Animal_Meat();
    private Medicine_Flower medicine_Flower = new Medicine_Flower();
    
    public Player(){
        
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getHealth(String food){
        if(food.equals("Bunga obat")){
            health = health + medicine_Flower.addStrength();
        }
        if(food.equals("Daging hewan")){
            health = health + animal_Meat.addStrength();
            
        }
        return health;
    }

    public int getHealth(){
        return health;
    }
}
