import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Creazione di un array di studenti usando la classe Enum
        StudenteEnum[] team = {StudenteEnum.RICCARDO, StudenteEnum.DENISE, StudenteEnum.ROBERTO, StudenteEnum.MARC_JOSEF};

        // Chiamate ai metodi adattati alla classe Enum
        ordineAlfabetico(team);

        datoEtà(team);

        stampaCucciolo(team);
        stampaStudentiConNomiDuplicati(team);
        stampaStudentiConNomiDuplicati(team);
    }

    // Metodo per l'ordine alfabetico
    public static void ordineAlfabetico(StudenteEnum[] team) {
        Arrays.sort(team, Comparator.comparing(s -> s.getNome() + " " + s.getCognome()));
        System.out.println("Squadra in ordine alfabetico : " + Arrays.toString(team));
    }

    // Metodo per l'ordinamento per età
    public static void datoEtà(StudenteEnum[] team) {
        Arrays.sort(team, Comparator.comparingInt(StudenteEnum::getEtà));
        System.out.println("Squadra in ordine di età: " + Arrays.toString(team));
    }

    // Metodo per stampare studenti con animale domestico
    public static void stampaCucciolo(StudenteEnum[] team) {
        for (StudenteEnum studente : team) {
            if (!studente.getNomeCucciolo().isEmpty()) {
                System.out.println("Studenti con animale domestico : " + studente.getNome());
            }
        }
    }

    // Metodo per stampare studenti con nomi duplicati
    public static void stampaStudentiConNomiDuplicati(StudenteEnum[] team) {
        for (int i = 0; i < team.length; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].getNome().equals(team[j].getNome())) {
                    System.out.println("Studente con nome duplicato: " + team[i]);
                }
            }
        }
    }
}




