package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Studente
        Studente studente1 = new Studente("Riccardo", "Galante", 29, "Palermo",
                "powerlift", " carbonara", "Elden Ring", "Piccoli Brividi", "Kingsman", " Cipo");

        Studente studente2 = new Studente("Denise", "De Leo", 28, "Cosenza",
                "Pilates", " Tutto", "", "Mrs. Doubtfire", "Orgoglio e pregiudizio", "");

        Studente studente3 = new Studente("Roberto", "Favaro", 19, "Zoppola",
                "Videogiochi", " Pizza", "Halo", "Senza domani", "", "Luna");

        Studente studente4 = new Studente("Marc Josef", "Conanan", 23, "Milano",
                "Nuoto", "cotoletta bolognese", " Dota2", " Pulp fiction", " Norwegian Wood", "Ciccio");

        Studente[] team = {studente1, studente2, studente3, studente4};

        ordineAlfabetico(studente1.getCognome()+ " "+ studente1.getNome(), studente2.getCognome()+ " " + studente2.getNome(), studente3.getCognome()+ " " + studente3.getNome(), studente4.getCognome()+ " "+ studente4.getNome());

        datoEtà(team);

        stampaCucciolo(team);


    }
    //metodo per l'ordine alfabetico
    public static void ordineAlfabetico(String studente1, String studente2, String studente3, String studente4){
        String[] cognome = {String.valueOf(studente1), String.valueOf(studente2), String.valueOf(studente3), String.valueOf(studente4)};
        Arrays.sort(cognome);
        System.out.println("Squadra in ordine alfabetico : " + Arrays.toString(cognome));
    }
    // metodo per prendere l'età
    public static void datoEtà(Studente[] team) {
        for (int i = 0; i < team.length - 1; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].getEtà() > team[j].getEtà()) {
                    Studente atemp = team[i];
                    team[i] = team[j];
                    team[j] = atemp;
                }
            }
        }
        System.out.println("Squadra in ordine di età:");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getNome() + " " + team[i].getEtà());
        }

    }
    public static void stampaCucciolo(Studente[] team){
        for(int i = 0; i < team.length; i++){
            if(!team[i].getNomeCucciolo().isEmpty()){
                System.out.println("Studenti con animale domestico : " + team[i].getNome());
            }
        }

    }











}


