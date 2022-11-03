package fatec.poo.model;
import java.lang.Math;

public class Atleta {
    private String nome;
    private double altura;
    private double peso;

    public Atleta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double caclIMC(){
        double imc;
        imc = peso / Math.pow(altura, 2);
        return imc;
    }
}
