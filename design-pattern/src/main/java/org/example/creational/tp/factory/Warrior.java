package org.example.creational.tp.factory;

public class Warrior extends Character{
    public Warrior(){
        this.name = "Warrior";
        this.hp = 150;
        this.ap = 50;
    }

    @Override
    public String useSpecialSkills() {
        return "+10 damage";
    }

}
