package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le jeu du Donjon");
        jouer();


    }
    private static void jouer() {
        //on cree le heros
        Heros heros = new Heros();
        Donjon donjon = new Donjon();
        donjon.exploreDonjon(heros);
        //si le heros est encore vivant (c a d avec points de vie) a la fin du jeu, la partie est gagne
        if ((!heros.estMort())) {
            System.out.println("Vous avez GAGNE, BRAVO");
        }
    }



}
