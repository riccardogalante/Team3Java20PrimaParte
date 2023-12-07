public enum TipoStudenteEnum {

    DENISE("Denise","De Leo",28,"Cosenza","Pilates","Tutto",null,"Mrs. Doubtfire","Oroglio e pregiudizio",null),
    MARC("Marc Josef", "Conanan", 23, "Milano",
            "Nuoto", "cotoletta bolognese", " Dota2", " Pulp fiction", " Norwegian Wood", "Ciccio"),
    ROBERTO("Roberto", "Favaro", 19, "Zoppola",
            "Videogiochi", " Pizza", "Halo", "Senza domani", "", "Luna"),
    RICCARDO("Riccardo", "Galante", 29, "Palermo",
            "powerlift", " carbonara", "Elden Ring", "Piccoli Brividi", "Kingsman", " Cipo");

    private final String nome;
    private final String cognome;
    private final int eta;
    private final String citta;
    private final String hobby;
    private final String ciboPreferito;
    private final String videogiocoPreferito;
    private final String filmPreferito;
    private final String libroPreferito;
    private final String nomeCucciolo;

    TipoStudenteEnum(String nome, String cognome, int eta, String citta, String hobby, String ciboPreferito, String videogiocoPreferito, String filmPreferito, String libroPreferito, String nomeCucciolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.citta = citta;
        this.hobby = hobby;
        this.ciboPreferito = ciboPreferito;
        this.videogiocoPreferito = videogiocoPreferito;
        this.filmPreferito = filmPreferito;
        this.libroPreferito = libroPreferito;
        this.nomeCucciolo = nomeCucciolo;
    }


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getCitta() {
        return citta;
    }

    public String getHobby() {
        return hobby;
    }

    public String getCiboPreferito() {
        return ciboPreferito;
    }

    public String getVideogiocoPreferito() {
        return videogiocoPreferito;
    }

    public String getFilmPreferito() {
        return filmPreferito;
    }

    public String getLibroPreferito() {
        return libroPreferito;
    }

    public String getNomeCucciolo() {
        return nomeCucciolo;
    }
}
