package fatec.poo.model;

public class Professor extends Pessoa{
    private int regFuncionario;
    private double salario;

    public Professor(int regFuncionario, String nome, String dtNascimento) {
        super(nome, dtNascimento);
        this.regFuncionario = regFuncionario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRegFuncionario() {
        return regFuncionario;
    }

    public double getSalario() {
        return salario;
    }
    
    
}
