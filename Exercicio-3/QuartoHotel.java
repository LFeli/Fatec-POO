package fatec.poo.model;

public class QuartoHotel {
    private int numQuarto;
    private double valDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;
    private double totalQuarto;
    
    
    public QuartoHotel(int numQuarto, double valDiaria){
        this.numQuarto = numQuarto;
        this.valDiaria = valDiaria;
        situacao = false;
    }
    
    public void reserva (int numRG){
        this.numRG = numRG;
        situacao = true;
    }
    
    public double libera (int dias){
       int totalDiaria = 0; 
       totalDiaria += valDiaria * dias;
       situacao = false;
       numRG = 0;
       totalFaturado += totalDiaria;
       return totalDiaria;
    }
    
    

    public boolean Situacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
    
    
}
