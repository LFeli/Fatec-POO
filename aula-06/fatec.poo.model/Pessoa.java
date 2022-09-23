package fatec.poo.model;

public class Pessoa {
    private String nome;
    private String dtNascimento;

    public Pessoa(String nome, String dtNascimento) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }
    
    
}
