package org.example.creational.tp.factory;

public class CharacterFactory {

    public Character createCharacter(String CharacterType) {
        if (CharacterType == null) {
            return null;
        }if(CharacterType.equalsIgnoreCase("archer")){
            return new Archer();
        }
        if(CharacterType.equalsIgnoreCase("warrior")){
            return new Warrior();
        }
        if(CharacterType.equalsIgnoreCase("mage")){
            return new Mage();
        }
        return null;
    }
}