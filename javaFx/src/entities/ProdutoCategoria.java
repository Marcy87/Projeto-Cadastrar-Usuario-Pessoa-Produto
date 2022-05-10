package entities;

public class ProdutoCategoria {

    private String codigo;
    private String nome;
    private Double margemlucro;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getMargemlucro() {
        return this.margemlucro;
    }

    public void setMargemlucro(Double margemlucro) {
        this.margemlucro = margemlucro;
    }
}
