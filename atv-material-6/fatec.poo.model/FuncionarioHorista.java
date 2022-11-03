package fatec.poo.model;

public class FuncionarioHorista extends Funcionario{
    private double valHoraTrab;
    private int qtdeHoras;

    public FuncionarioHorista(int registro, String nome, String dataAdimissao, String cargo, double valHoraTrab) {
        super(registro, nome, dataAdimissao, cargo);
        this.valHoraTrab = valHoraTrab;
    }
    
    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }
    
    @Override
    public double calcSalBruto(){
        return(valHoraTrab * qtdeHoras);
    }
    
    public double calcGratificacao(){
        return(calcSalBruto() * 0.075);
    }
    
    @Override
    public double calcSalLiquido(){
        return ((calcSalBruto() + calcGratificacao()) - calcDesconto() );
    }
}
