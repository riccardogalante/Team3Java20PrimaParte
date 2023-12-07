public enum StudenteEnum {
    RICCARDO("Riccardo", "Galante", 29, "Palermo", "powerlift", "carbonara", "Elden Ring", "Piccoli Brividi", "Kingsman", "Cipo"),
    DENISE("Denise", "De Leo", 28, "Cosenza", "Pilates", "Tutto", "", "Mrs. Doubtfire", "Orgoglio e pregiudizio", ""),
    ROBERTO("Roberto", "Favaro", 19, "Zoppola", "Videogiochi", "Pizza", "Halo", "Senza domani", "", "Luna"),
    MARC_JOSEF("Marc Josef", "Conanan", 23, "Milano", "Nuoto", "cotoletta bolognese", "Dota2", "Pulp fiction", "Norwegian Wood", "Ciccio");

    private final String nome;
    private final String cognome;
    private final int età;
    private final String città;
    private final String passatempo;
    private final String ciboPreferito;
    private final String videogiocoPreferito;
    private final String filmPreferito;
    private final String libroPreferito;
    private final String nomeCucciolo;

    StudenteEnum(String nome, String cognome, int età, String città, String passatempo, String ciboPreferito, String videogiocoPreferito, String filmPreferito, String libroPreferito, String nomeCucciolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.città = città;
        this.passatempo = passatempo;
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

    public int getEtà() {
        return età;
    }

    public String getCittà() {
        return città;
    }

    public String getPassatempo() {
        return passatempo;
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

    @Override
    public String toString() {
        return "StudenteEnum(" +
                "nome : " + nome +
                ", cognome : " + cognome +
                ", età : " + età +
                ", città : " + città +
                ", passatempo : " + passatempo +
                ", ciboPreferito : " + ciboPreferito +
                ", videogiocoPreferito : " + videogiocoPreferito +
                ", filmPreferito : " + filmPreferito +
                ", libroPreferito : " + libroPreferito +
                ", nomeCucciolo : " + nomeCucciolo +
                ')';
    }
}