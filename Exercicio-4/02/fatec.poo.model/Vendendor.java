package fatec.poo.model;

public class Vendendor extends Pessoa{
    private double taxaComissao;
    private double totalVendas;
    
    public Vendendor(int codigo, String nome, double taxaComissao){
        super(codigo, nome);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
       
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double compras){
        totalVendas += compras;
    }
    
    public double calcValorComissao(){
        double valor;
        valor = getTotalVendas() * getTaxaComissao();
        return valor;
    }
}