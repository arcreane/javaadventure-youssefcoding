package com.company;

public class Barbare {

    int point_de_vie;

    public void attaquerHeros(Heros hero) {
        System.out.println("attaquer sorcier");
    }

    //permet de de terminer si le barbare est encore vivant
    public boolean estVivant() {
        return point_de_vie <= 0;
    }

}



