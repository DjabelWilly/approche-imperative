package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] table1 = {8, -7, 12, 1, -2, 14, 17, 9};
        // print index 0
        System.out.println(table1[0]);
        // print longueur tableau
        System.out.println(table1.length);
        // print dernier index
        System.out.println(table1[table1.length-1]);
        // print index 10 => Index 10 out of bounds car table1 = 8 elements
        System.out.println(table1[10]);
    }
}


