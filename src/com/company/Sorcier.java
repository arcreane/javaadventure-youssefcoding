package com.company;

public class Sorcier {

    int point_de_vie=200;

    public void attaquerHeros(Heros hero) {
        System.out.println("attaquer sorcier");
    }

    //permet de determiner si le sorcier est encore vivant
    public boolean estVivant() {
        return point_de_vie <= 0;
    }


}
