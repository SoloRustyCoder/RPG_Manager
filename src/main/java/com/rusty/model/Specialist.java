package com.rusty.model;

public class Specialist extends Class{
    //Implementação e declaração do metodo contrutor
    public Specialist(int id, String character, String playerName, String classe,String origin, int str, int dex, int mind, int vig, int pre) {
        this.id = id;
        this.character = character;
        this.playerName = playerName;
        this.classe = classe;
        this.origin = origin;
        this.strength = str;
        this.dexterity = dex;
        this.mind = mind;
        this.presence = pre;
        this.vigor = vig;
    }
    
    //Implementação dos metodos abstratos declarados na classe mãe
    @Override
    public int getLife(int vig) {
        return 16 + vigor;
    }

    @Override
    public int getSanity() {
        return 16;
    }

    @Override
    public int effortPoints(int pre) {
        return 3 + presence;
    }
    
}
