package org.example.creational.tp.factory;

public class Archer extends Character{

    public Archer(){
        this.name = "Archer";
        this.hp = 120;
        this.ap = 25;
    }

    @Override
    public String useSpecialSkills() {
        return "+10 damage";
    }
}
