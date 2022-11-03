package fatec.poo.model;

public class FuncionarioHorista extends Funcionario{
    private double valHoraTrab;
    private int qntdHorasTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdimissao, double valHoraTrab) {
        super(registro, nome, dtAdimissao);
        this.valHoraTrab = valHoraTrab;
    }

    public void setQntdHorasTrab(int qntdHorasTrab) {
        this.qntdHorasTrab = qntdHorasTrab;
    }
    
    @Override
    public double calcSalBruto(){
        return(valHoraTrab * qntdHorasTrab);
    }
    
    public double calcGratificacao(){
        return(calcSalBruto() * 0.075);
    }
    
    @Override
    public double calcSalLiquido(){
        return ((calcSalBruto() + calcGratificacao()) - calcDesconto() );
    }
}
