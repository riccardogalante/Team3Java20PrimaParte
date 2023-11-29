package src;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Riccardo", "Galante",29, "Palermo" ,
                "powerlift" , " carbonara" , "Elden Ring" , "Piccoli Brividi" , "Kingsman", " Cipo");

        Studente studente2 = new Studente("Denise", "De Leo",28, "Cosenza" ,
                "Pilates" , " Tutto" , "" , "Mrs. Doubtfire" , "Orgoglio e pregiudizio", "");

        Studente studente3 = new Studente("Roberto", "Favaro",19, "Zoppola" ,
                "Videogiochi" , " Pizza" , "Halo" , "Senza domani" , "", "Luna");

        Studente studente4 = new Studente("Marc Josef", "Conanan",23, "Milano" ,
                "Nuoto" , "cotoletta bolognese" , " Dota2" , " Pulp fiction" , " Norwegian Wood", "Ciccio");

        ordineAlfabetico(studente1, studente2, studente3, studente4);

    }
    public static void ordineAlfabetico(Studente studente1, Studente studente2, Studente studente3, Studente studente4){
        String[] cognome = {String.valueOf(studente1), String.valueOf(studente2), String.valueOf(studente3), String.valueOf(studente4)};
        Arrays.sort(cognome);
        System.out.println(Arrays.toString(cognome));
    }
}




