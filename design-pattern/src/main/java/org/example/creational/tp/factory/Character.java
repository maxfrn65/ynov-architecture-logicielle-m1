package org.example.creational.tp.factory;

public abstract class Character {

    String name;
    int hp;
    int ap;

    public String getName() {
        return name;
    };
    public int getHP() {
        return hp;
    };
    public int getAttackPoints() {
        return ap;
    };
    public abstract String useSpecialSkills();
}
