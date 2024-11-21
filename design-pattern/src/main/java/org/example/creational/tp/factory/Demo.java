package org.example.creational.tp.factory;
import org.example.creational.tp.factory.*;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character warrior = factory.createCharacter("warrior");
        System.out.println(warrior.getName() + " - Health: " + warrior.getHP() + ", Attack: " + warrior.getAttackPoints());
        warrior.useSpecialSkill();

        Character mage = factory.createCharacter("mage");
        System.out.println(mage.getName() + " - Health: " + mage.getHP() + ", Attack: " + mage.getAttackPoints());
        mage.useSpecialSkill();

        Character archer = factory.createCharacter("archer");
        System.out.println(archer.getName() + " - Health: " + archer.getHP() + ", Attack: " + archer.getAttackPoints());
        archer.useSpecialSkill();
    }
}
