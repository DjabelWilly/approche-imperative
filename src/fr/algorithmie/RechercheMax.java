package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int biggerValue = array[0]; // init. variable de la plus grande valeur à index 0

        for (int i = 0; i < array.length; i++) {
            if (biggerValue < array[i]) {  // on test si index actuel est inférieur à index suivant
                biggerValue = array[i];    // si c'est le cas, on assigne cet index à la variable
            }
        }
        System.out.println("la plus grande valeur du tableau est:" + biggerValue);
    }
}
