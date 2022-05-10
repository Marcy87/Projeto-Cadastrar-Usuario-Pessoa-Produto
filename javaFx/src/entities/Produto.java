package entities;

public class Produto {

    //Atributos
    private String codBarra;
    private String nomeProduto;
    private String preco;

    //Método Construtor
    public Produto(String codBarra, String nomeProduto, String preco){
        this.codBarra = codBarra;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Produto(){

    }

    //Método de acesso get e set

    // CÓDIGO DE BARRA
    public String getCodBarra() {
        return this.codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    //NOME PRODUTO
    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //PREÇO
    public String getPreco() {
        return this.preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
