package com.company;

public class Heros {

    // armes du heros
    Epee epee;
    FioleEau fiole_eau;

    int point_de_vie=200;

    public Heros() {
        super();
        //on initialise les armes quand on cree le heros
        epee = new Epee();
        fiole_eau = new FioleEau();
    }


    //methode pour les attaques
    public void attaquerSorcier(Sorcier sorcier) {
        System.out.println("attaquer sorcier");
    }

    public void attaquerBarbare(Barbare barbare) {
        System.out.println("attaquer barbare");
    }


    public Epee getEpee() {
        return epee;
    }
    public void setEpee(Epee epee) {epee = epee; }
    public FioleEau getFiole_eau() {
        return fiole_eau;
    }
    public void setFiole_eau(FioleEau fiole_eau) {
        this.fiole_eau = fiole_eau;
    }


    //permet de determiner si le heros est encore vivant
    public boolean estMort( ) {
        return point_de_vie <= 0;
    }



}

