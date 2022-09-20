
package model;

public class contaCorrente {
    private int numero;
    private double saldo;
    private int qntdContas; 
    
    public contaCorrente (int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getQntdContas() {
        return qntdContas;
    }

    public void setQntdContas(int qntdContas) {
        this.qntdContas = qntdContas;
    }
    
    public void sacar(double valor){
            saldo -= valor;
    }
    
    public void depositar (double valor){
            this.saldo += valor;
    }
}
