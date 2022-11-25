package com.rusty.model;

public abstract class Class {
    //Declaração de variaveis, ultilizadas posteriormente pelas classes filhas
    protected int id;
    protected int strength;
    protected int dexterity;
    protected int mind;
    protected int presence;
    protected int vigor;
    protected String character;
    protected String playerName;
    protected String origin;
    protected String classe;

    //Getters and Setters das variaveis
    public int getId(){
        return id;
    }
    
    public int getStrength() {
        return strength;
    }

    public void setStr(int str) {
        this.strength = str;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dex) {
        this.dexterity = dex;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getPresence() {
        return presence;
    }

    public void setPre(int pre) {
        this.presence = pre;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vig) {
        this.vigor = vig;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String player) {
        this.playerName = player;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    //Declaração dos metodos que devem ser implementados pelas classes filhas
    
    public abstract int getLife(int vig);
    
    public abstract int getSanity();
    
    public abstract int effortPoints(int pre);
}
