package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // print éléments de array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // print élément de array dans le sens inverse
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // print les entiers supérieurs à 3
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3)
            {
                System.out.println(array[i]);
            }
        }
        // print seulement les entiers pairs
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 ==0)
            {
                System.out.println(array[i]);
            }
        }

        // print seulement les valeurs des index pairs
        for (int i = 0; i < array.length; i++) {
            if ( i %2 ==0)
            {
                System.out.println(array[i]);
            }
        }
        // print seulement les entiers impairs
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 !=0)
            {
                System.out.println(array[i]);
            }
        }

    }
}
