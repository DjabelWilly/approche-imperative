package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Marseille", "Montpellier", "Nimes", "Alès", "Beziers"};
        // methode Arrays.toString
        System.out.println(Arrays.toString(villes));
        // iteration
        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
        // print tableau length
        System.out.println(villes.length);
        // remplace index 3 par "Reims"
        villes[3]= "Reims";
        // print tableau après modification
        System.out.println(Arrays.toString(villes));

    }
}
