public class Main {

    //TODO la classe main dovrà solo contenere gli oggetti e chiamare i meotodo, va fatta una classe team apposita con un array di studenti
    public static void main(String[] args) {
        //Creating instances of Studente
        TipoStudenteEnum[] team = {TipoStudenteEnum.MARC, TipoStudenteEnum.DENISE, TipoStudenteEnum.RICCARDO, TipoStudenteEnum.ROBERTO};

        stampaStudentiConNomiDuplicati(team);
        ordineAlfabetico(team);
        ordinaPerEta(team);
        stampaCucciolo(team);
        stampaMembriStessoNome(team);
        videogiocoLOL(team);


    }
    // metodo per l'ordine alfabetico
    public static void ordineAlfabetico(TipoStudenteEnum[] team){

        String[] arrayStringhe = {TipoStudenteEnum.RICCARDO.getCognome(), TipoStudenteEnum.DENISE.getCognome(), TipoStudenteEnum.ROBERTO.getCognome(), TipoStudenteEnum.MARC.getCognome()};

        //Ordina l'array in ordine alfabetico utilizzando Bubble Sort
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
    //metodo per prendere l'età
    public static void ordinaPerEta(TipoStudenteEnum[] team) {
        for (int i = 0; i < team.length - 1; i++) {
            for (int j = i + 1; j < team.length; j++) {
                if (team[i].getEta() > team[j].getEta()) {
                    TipoStudenteEnum atemp = team[i];
                    team[i] = team[j];
                    team[j] = atemp;
                }
            }
        }
        System.out.println("Squadra in ordine di età:");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getNome() + " " + team[i].getEta());
        }

    }
    public static void stampaCucciolo(TipoStudenteEnum[] studenti){
        for(int i = 0; i < studenti.length; i++){
            if(studenti[i].getNomeCucciolo() != null){
                System.out.println("Studenti con animale domestico : " + studenti[i].getNome());
            }
        }

    }
    public static void stampaMembriStessoNome(TipoStudenteEnum[] team) {
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
    public static void stampaStudentiConNomiDuplicati(TipoStudenteEnum[] team) {
        boolean studentiConNomiDuplicati = false;

        // Ciclo attraverso l'array di studenti
        for (int i = 0; i < team.length; i++) {
            for (int j = i + 1; j < team.length; j++) {
                // Confronta il nome dello studente corrente con gli altri studenti nell'array
                if (team[i].getNome().equals(team[j].getNome())) {
                    System.out.println("Studente con nome duplicato: " + team[i]);
                    studentiConNomiDuplicati = true;
                }
            }
        }

        // Stampa un messaggio se non ci sono studenti con lo stesso nome
        if (!studentiConNomiDuplicati) {
            System.out.println("Nessuno studente ha lo stesso nome.");
        }
    }
    public static void videogiocoLOL(TipoStudenteEnum[] team){
        for(int i = 0; i < team.length; i++){
            if(team[i].getVideogiocoPreferito() == "LOL"){
                System.out.println("Ha scritto LOL come videgioco preferito: "+ team[i].getNome());
            }else if (team[i].getVideogiocoPreferito() == "League of legend"){
                System.out.println("Ha scritto League of legend come videogioco preferito: " + team[i].getNome());
            }
        }
    }
}
