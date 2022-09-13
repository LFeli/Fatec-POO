import model.Circulo;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo objCirculo = new Circulo();
        
        double raio;
        
        System.out.print("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        objCirculo.setRaio(raio);
        
        System.out.println("A área do Circulo é: " + objCirculo.calcArea());
        System.out.println("A medida do perimetro é: " + objCirculo.calcPerimentro());
        System.out.println("A medida do diametro é: " + objCirculo.calcDiametro());
    }
    
}
