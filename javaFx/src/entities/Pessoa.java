package entities;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String sobreNome, int idade){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }

    public Pessoa(String nome, String sobreNome, int idade, String cpf){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //Método de acesso get e set

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
