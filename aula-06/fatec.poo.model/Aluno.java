package fatec.poo.model;

public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dtNascimento) {
        super(nome, dtNascimento);
        this.regEscolar = regEscolar;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }
    
    public void setMensalidade(double mensalidade){
        this.mensalidade = mensalidade;
    }
}
