package fatec.poo.model;

public class Cliente extends Pessoa{
    private double limitCredit;
    private double totalCompras;
    
    
    public Cliente(int codigo, String nome, double limitCredit){
        super(codigo, nome);
        this.limitCredit = limitCredit;
    }

    public double getLimitCredit() {
        return limitCredit;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addCompras (double valor){
        totalCompras += valor;
    }
    
    public double calcLimitDispo(){
        double limite;
        limite = limitCredit - getTotalCompras();
        return limite;
    }
    
}
