package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int counter = 0;

        // Boucle pour parcourir array1
        for (int i = 0; i < array1.length; i++) {
            // Boucle pour parcourir array2
            for (int j = 0; j < array2.length; j++) {
                // Compare array1[i] avec array2[j]
                if (array1[i] == array2[j]) {
                    counter++; // Incrémente le compteur si les éléments sont identiques
                }
            }
        }

        // Affiche le nombre d'éléments communs entre array1 et array2
        System.out.println(counter);
    }
}

