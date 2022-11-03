import model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Circulo objCirculo = new Circulo();
        
        double raio;
        
        System.out.print("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        objCirculo.setRaio(raio);
        
        System.out.println("A área do Circulo é: " + df.format(objCirculo.calcArea()));
        System.out.println("A medida do perimetro é: " + df.format(objCirculo.calcPerimentro()));
        System.out.println("A medida do diametro é: " + objCirculo.calcDiametro());
    }
    
}
