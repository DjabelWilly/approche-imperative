package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Afficher les éléments du tableau grâce à une boucle
       /* for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        // Afficher les éléments du tableau dans l’ordre inverse
       /* for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }*/

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = new int[array.length]; // Création d'un nouveau tableau de même taille
        for (int i = 0; i < array.length ; i++) {
           arrayCopy[i]= array[i];
            System.out.println(arrayCopy[i]); // affiche le tableau copié
        }


    }
}
