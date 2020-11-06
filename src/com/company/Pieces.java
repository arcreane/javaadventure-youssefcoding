package com.company;

import java.util.Random;

public class Pieces {


    Random random = new Random();

    // chaque piece est identifie par son numero
    int numeroPiece;

    public Pieces(int numeroPiece) {
        super();
        numeroPiece = numeroPiece;
    }




    // liste les diffentes actions qui surviennent lorsque le heros rentre dans une piece
    public void explorerPiece(Heros hero) {
        /*** des actions telles la creation aleatoire des monstres se feront ici
         *
         * pour le moment on cree selon un modulo (pair/impair soit un sorcier ou un barbare
         *
         *
         ***/
        System.out.println("Explorer piece numero "+numeroPiece);
        if (random.nextInt()%2==0) {
            System.out.println("Il y a dans cette piece un sorcier");
            //Sorcier sorcier = new Sorcier();
        } else {
            System.out.println("Il y a dans cette piece un barbare");
            //Barbare barbare = new Barbare();
        }
    }
































}

