package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int smallerValue = array[0]; // init. variable de la plus petite valeur à index 0

        for (int i = 0; i < array.length; i++) {
            if (smallerValue > array[i]) {  // on test si index actuel est inférieur à index suivant
                smallerValue = array[i];    // si c'est le cas, on assigne cet index à la variable
            }
        }
        System.out.println("la plus petite valeur du tableau est:" + smallerValue);
    }
}


