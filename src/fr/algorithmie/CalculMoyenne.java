package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int sum = 0;
        float result; // moyenne des valeurs

        // calcul de la moyenne des éléments du tableau
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];  // on additionne à chaque tour index suivant
        }
        result = (float) sum/ array.length;
        System.out.println(result);
    }
}
