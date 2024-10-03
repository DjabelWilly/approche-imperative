package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Affiche array
        System.out.println("Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Créer un tableau arrayCopy et copier tous les éléments de array en sens inverse
        int arrayCopy[] = new int[array.length]; // init. de arrayCopy
        System.out.println("arrayCopy :");
        for (int i = array.length -1; i >=0 ; i--) {
          arrayCopy[i]  = array[i];
            System.out.println(arrayCopy[i]); // affiche arrayCopy
        }
    }
}
