package com.rusty.model;

public class Ocultist extends Class{
    //Implementação e declaração do metodo contrutor
    public Ocultist(int id, String character, String playerName, String classe,String origin, int str, int dex, int mind, int vig, int pre) {
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
        return 12 + vigor;
    }

    @Override
    public int getSanity() {
        return 20;
    }

    @Override
    public int effortPoints(int pre) {
        return 4 + presence;
    }
    
}
