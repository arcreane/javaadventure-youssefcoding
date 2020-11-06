package com.company;

public class Donjon {

//il y a 5 pieces dans le jeu
    private Pieces[] pieces = new Pieces[5];

    //on initialise le donjon avec 5 chambres qui seront initialisees
    public Donjon() {
        for (int i = 0; i < pieces.length; i++)
            pieces[i] = new Pieces(i+1);
    }

    //le heros explore le donjon en penetrant dans chaque piece
    public void exploreDonjon(Heros hero) {
        for (int i=0;i<pieces.length;i++) {
            pieces[i].explorerPiece(hero);
            //si le heros meurt, l'exploration s'arrete
            if (hero.estMort())
                break;
        }
    }
}


