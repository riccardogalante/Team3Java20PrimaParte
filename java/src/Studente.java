package src;

public class Studente {
    private String nome;
    private String cognome;
    private int età;
    private String città;
    private String passatempo;
    private String ciboPreferito;
    private String videogiocoPreferito;
    private String filmPreferito;
    private String libroPreferito;
    private String nomeCucciolo;

    public Studente(String nome, String cognome, int età, String città, String passatempo, String ciboPreferito, String videogiocoPreferito, String filmPreferito, String libroPreferito, String nomeCucciolo) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getPassatempo() {
        return passatempo;
    }

    public void setPassatempo(String passatempo) {
        this.passatempo = passatempo;
    }

    public String getCiboPreferito() {
        return ciboPreferito;
    }

    public void setCiboPreferito(String ciboPreferito) {
        this.ciboPreferito = ciboPreferito;
    }

    public String getVideogiocoPreferito() {
        return videogiocoPreferito;
    }

    public void setVideogiocoPreferito(String videogiocoPreferito) {
        this.videogiocoPreferito = videogiocoPreferito;
    }

    public String getFilmPreferito() {
        return filmPreferito;
    }

    public void setFilmPreferito(String filmPreferito) {
        this.filmPreferito = filmPreferito;
    }

    public String getLibroPreferito() {
        return libroPreferito;
    }

    public void setLibroPreferito(String libroPreferito) {
        this.libroPreferito = libroPreferito;
    }

    public String getNomeCucciolo() {
        return nomeCucciolo;
    }

    public void setNomeCucciolo(String nomeCucciolo) {
        this.nomeCucciolo = nomeCucciolo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", età=" + età +
                ", città='" + città + '\'' +
                ", passatempo='" + passatempo + '\'' +
                ", ciboPreferito='" + ciboPreferito + '\'' +
                ", videogiocoPreferito='" + videogiocoPreferito + '\'' +
                ", filmPreferito='" + filmPreferito + '\'' +
                ", libroPreferito='" + libroPreferito + '\'' +
                ", nomeCucciolo='" + nomeCucciolo + '\'' +
                '}';
    }
}
