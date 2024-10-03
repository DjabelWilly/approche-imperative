package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        
        // Création de arrayMerged 
        int[] arrayMerged = new int[array1.length + array2.length];

        // Copie les éléments de array1 dans array3
        for (int i = 0; i < array1.length; i++) {
            arrayMerged[i] = array1[i];
        }

        // Copie les éléments de array2 dans array3, à partir de l'indice après array1
        for (int i = 0; i < array2.length; i++) {
            arrayMerged[array1.length + i] = array2[i];
        }

        // Affiche le tableau fusionné avec Arrays.toString()
        System.out.println(Arrays.toString(arrayMerged));
    }
}
