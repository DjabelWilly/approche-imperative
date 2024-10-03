package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        // Affichez les nombres de 1 à 10
        for (int i = 1; i < 11 ; i++) {
            System.out.println(i);
        }
        //Affichez 20 fois votre nom et votre prénom
        String name = "Djabelkhir Willy";
        for (int i = 1; i < 21 ; i++) {
            System.out.println(i + ":"  + name);
        }
        // Affichez les éléments pairs de 2 à 100
        for (int i = 2; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // Affichez les éléments impairs de 1 à 99
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
