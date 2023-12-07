import java.util.Arrays;
import java.util.Comparator;

<<<<<<< HEAD
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
=======
//public class Main {

    /*///TODO la classe main dovrà solo contenere gli oggetti e chiamare i meotodo, va fatta una classe team apposita con un array di studenti
    public static void main(String[] args) {
        // Creating instances of Studente


        //Studente[] team;

        //ordineAlfabetico(studente1.getCognome()+ " "+ studente1.getNome(), studente2.getCognome()+ " " + studente2.getNome(), studente3.getCognome()+ " " + studente3.getNome(), studente4.getCognome()+ " "+ studente4.getNome());

        //datoEtà(team);

        //stampaCucciolo(team);
        //stampaMembriStessoNome(team);


>>>>>>> 3901aa23a77eabd4b54d3b791df64a253d80376a
    }

<<<<<<< HEAD
    // Metodo per l'ordine alfabetico
    public static void ordineAlfabetico(StudenteEnum[] team) {
        Arrays.sort(team, Comparator.comparing(s -> s.getNome() + " " + s.getCognome()));
        System.out.println("Squadra in ordine alfabetico : " + Arrays.toString(team));
    }
=======
        Arrays.sort(studenti);
        //System.out.println("Squadra in ordine alfabetico : " + Arrays.toString(cognome));
>>>>>>> 3901aa23a77eabd4b54d3b791df64a253d80376a

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
<<<<<<< HEAD
    }

    // Metodo per stampare studenti con nomi duplicati
    public static void stampaStudentiConNomiDuplicati(StudenteEnum[] team) {
=======

        // Stampa l'array ordinato
        System.out.println("Array ordinato in ordine alfabetico:");
        for (String elemento : arrayStringhe) {
            System.out.println(elemento);
        //}
    //}


    // metodo per prendere l'età
    //public static void ordinaPerEta(Studente[] team) {
        //for (int i = 0; i < team.length - 1; i++) {
          //  for (int j = i + 1; j < team.length; j++) {
            //    if (team[i].getEtà() > team[j].getEtà()) {
              /*      Studente atemp = team[i];
                    team[i] = team[j];
                    team[j] = atemp;
                }
            }
        }
        System.out.println("Squadra in ordine di età:");
>>>>>>> 3901aa23a77eabd4b54d3b791df64a253d80376a
        for (int i = 0; i < team.length; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].getNome().equals(team[j].getNome())) {
                    System.out.println("Studente con nome duplicato: " + team[i]);
                }
            }
        }
    }
}*/




