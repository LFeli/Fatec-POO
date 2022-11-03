Aplic.java

import model.Retangulo;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Instanciação de um objeto da classe retangulo
        
        Retangulo objRet = new Retangulo();
        
        double medAlt, medBase;
        System.out.print("\tDigite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("\tDigite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Passagem de Mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\tMedida da Altura: " + objRet.getAltura());
        System.out.println("\tMedida da Base: " + objRet.getBase());
        System.out.println("\tO calculo da área é: " + objRet.calcArea());
        System.out.println("\tO calculo da perimetro é: " + objRet.calcPerimetro());
        System.out.println("O Calclo diagonal é " + objRet.calDiagonal());
        
    }
    
}
