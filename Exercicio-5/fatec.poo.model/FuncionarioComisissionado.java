package fatec.poo.model;

public class FuncionarioComisissionado extends Funcionario{
    private double salBase;
    private double taxaDeComissao;
    private double totalVendas;

    public FuncionarioComisissionado(int registro, String nome, String dtAdimissao, double taxaDeComissao) {
        super(registro, nome, dtAdimissao);
        this.taxaDeComissao = taxaDeComissao;
    }
    
    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
     public double getSalBase() {
        return salBase;
    }
     
    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void addVendas(double valor){
        totalVendas += valor;
    }
    
    @Override
    public double calcSalBruto(){
        return (salBase + ((taxaDeComissao / 100) * totalVendas));
    }
      
    public double calcGratificacao(){
        if(totalVendas <= 5000){
            return 0;
        } else if(totalVendas > 5000 && totalVendas <= 10000){
            return(totalVendas * 0.003);
        }
        return (totalVendas * 0.005);
    }
    
    @Override
    public double calcSalLiquido(){
        return ((calcSalBruto() + calcGratificacao()) - calcDesconto() );
    }
}
