package org.example.creational.tp.factory;

public class Mage extends Character {
    public Mage(){
        this.name = "Mage";
        this.hp = 140;
        this.ap = 30;
    }

    @Override
    public String useSpecialSkill() {
        return "+10 spell damage";
    }
}
