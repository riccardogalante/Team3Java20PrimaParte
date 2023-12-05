package src;

import java.util.Arrays;

public class Main {

    ///TODO la classe main dovrà solo contenere gli oggetti e chiamare i meotodo, va fatta una classe team apposita con un array di studenti
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
        stampaMembriStessoNome(team);


    }
    //metodo per l'ordine alfabetico
    public static void ordineAlfabetico(String[] studenti){

        Arrays.sort(studenti);
        System.out.println("Squadra in ordine alfabetico : " + Arrays.toString(cognome));


        String[] arrayStringhe = {"Zebra", "Banana", "Mela", "Ananas", "Limone"};

        // Ordina l'array in ordine alfabetico utilizzando Bubble Sort
        int lunghezza = arrayStringhe.length;
        for (int i = 0; i < lunghezza - 1; i++) {
            for (int j = 0; j < lunghezza - i - 1; j++) {
                if (arrayStringhe[j].compareTo(arrayStringhe[j + 1]) > 0) {
                    // Scambia le posizioni se l'elemento successivo è più piccolo
                    String temp = arrayStringhe[j];
                    arrayStringhe[j] = arrayStringhe[j + 1];
                    arrayStringhe[j + 1] = temp;
                }
            }
        }

        // Stampa l'array ordinato
        System.out.println("Array ordinato in ordine alfabetico:");
        for (String elemento : arrayStringhe) {
            System.out.println(elemento);
        }
    }


    // metodo per prendere l'età
    public static void ordinaPerEta(Studente[] team) {
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
    public static void stampaCucciolo(Studente[] studenti){
        for(int i = 0; i < studenti.length; i++){
            if(studenti[i].getNomeCucciolo() != null){
                System.out.println("Studenti con animale domestico : " + studenti[i].getNome());
            }
        }

    }

    public static void stampaMembriStessoNome(Studente[] team) {
        // Utilizza un array per contare gli studenti per nome
        int[] conteggioPerNome = new int[team.length];

        // Riempie l'array dei conteggi
        for (int i = 0; i < team.length - 1; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].getNome().equals(team[j].getNome())) {
                   System.out.println(team[i].getNome());
                }
            }
        }

        // Stampa gli studenti con lo stesso nome
        boolean almenoUnNomeUguale = false;
        for (int i = 0; i < team.length; i++) {
            if (conteggioPerNome[i] > 0) {
                if (!almenoUnNomeUguale) {
                    System.out.println("Studenti con lo stesso nome:");
                    almenoUnNomeUguale = true;
                }
                System.out.println(team[i].getNome() + " " + team[i].getCognome());
            }
        }

        // Stampa un messaggio se non ci sono studenti con lo stesso nome
        if (!almenoUnNomeUguale) {
            System.out.println("Nessuno studente ha lo stesso nome.");
        }
    }
    public static void stampaStudentiConNomiDuplicati(Studente[] elencoStudenti) {
        // Ciclo attraverso l'array di studenti
        for (int i = 0; i < elencoStudenti.length; i++) {
            for (int j = i + 1; j < elencoStudenti.length; j++) {
                // Confronta il nome dello studente corrente con gli altri studenti nell'array
                if (elencoStudenti[i].getNome().equals(elencoStudenti[j].getNome())) {
                    System.out.println("Studente con nome duplicato: " + elencoStudenti[i]);
                }
            }
        }
    }
}




