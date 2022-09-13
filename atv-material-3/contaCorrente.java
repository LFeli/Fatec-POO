package model;

public class contaCorrente {
    private int numero;
    private double saldo;
    
    public contaCorrente (int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(valor < saldo){
            saldo -= valor;
        } else{System.out.println("\n**********Saldo insuficiente**********\n");}
    }
    
    public void depositar (double valor){
        if(valor > 0){
            this.saldo += valor;
        } else{System.out.println("\n**********valor invalido**********\n");}
    }
}
