public class Studente {
    private TipoStudenteEnum tipoStudenteEnum;

    public Studente(TipoStudenteEnum tipoStudenteEnum) {
        this.tipoStudenteEnum = tipoStudenteEnum;
    }
    public TipoStudenteEnum getTipoStudenteEnum() {
        return tipoStudenteEnum;
    }
    public void setTipoStudenteEnum(TipoStudenteEnum tipoStudenteEnum) {
        this.tipoStudenteEnum = tipoStudenteEnum;
    }
}
