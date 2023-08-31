package iteration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DivisibleByFiveExample {
    public static void main(String[] args) {
        // Création de la liste d'entiers
        List<Integer> entiers = new ArrayList();
        entiers.add(15);
        entiers.add(23);
        entiers.add(35);
        entiers.add(42);
        entiers.add(50);
        entiers.add(55);
        entiers.add(61);
        entiers.add(70);
        entiers.add(85);
        entiers.add(99);

        // Création d'un ensemble pour stocker les entiers divisibles par 5
        Set<Integer> divisiblesParCinq = new HashSet<>();

        // Parcours de la liste d'entiers
        for (int entier : entiers) {
            int chiffreUnite = entier % 10; // Obtention du chiffre des unités

            // Vérification si le chiffre des unités est 0 ou 5 et si l'entier n'est pas déjà présent dans l'ensemble
            if ((chiffreUnite == 0 || chiffreUnite == 5) && !divisiblesParCinq.contains(entier)) {
                divisiblesParCinq.add(entier);
            }
        }

        // Affichage des entiers divisibles par 5 et non doublants
        System.out.println("Entiers divisibles par 5 et non doublants :");
        for (int entier : divisiblesParCinq) {
            System.out.println(entier);
        }
    }
}
