package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int [] tableEntier = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // print le premier élément du tableau
        System.out.println(tableEntier[0]);

        // print  longueur du tableau
        System.out.println(tableEntier.length);

        // print le dernier élément du tableau
        System.out.println(tableEntier[tableEntier.length-1]);

        // Modifiez la valeur de l’élément d’index 4 et donnez-lui la valeur 8.
        tableEntier[4] = 8;
        System.out.println(tableEntier[4]);

    }
}
