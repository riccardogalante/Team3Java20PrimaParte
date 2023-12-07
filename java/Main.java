public class Main {

    public static void main(String[] args) {
        //Creating instances of Studente
        TipoStudenteEnum[] team = {TipoStudenteEnum.MARC, TipoStudenteEnum.DENISE, TipoStudenteEnum.RICCARDO, TipoStudenteEnum.ROBERTO};

        Studente.stampaStudentiConNomiDuplicati(team);
        Studente.ordineAlfabetico(team);
        Studente.ordinaPerEta(team);
        Studente.stampaCucciolo(team);
        Studente.stampaMembriStessoNome(team);
        Studente.videogiocoLOL(team);


    }


}
