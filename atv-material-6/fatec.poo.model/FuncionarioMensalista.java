package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dataAdimissao, String cargo, double valSalMin) {
        super(registro, nome, dataAdimissao, cargo);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    @Override
    public double calcSalBruto(){
        return(valSalMin * numSalMin);
    }
}
