import fatec.poo.model.Atleta;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
       
        int opcao = 0, cont = 0, x;
        
        Atleta[] atleta = new Atleta[4];
        
        while(opcao != 3){
            System.out.println("\n\nDigite uma opção: "
                    + "\n 1 - Cadastrar Atleta"
                    + "\n 2- Exibir IMC"
                    + "\n 3- Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    if(cont == 4){
                        System.out.println("\nNão é possível cadastrar um atleta");
                        break;
                    } else{
                        System.out.print("\nDigite o nome do atleta: ");
                        atleta[cont] = new Atleta(entrada.next());
                        System.out.print("\nDigite o Peso do atleta: ");
                        atleta[cont].setPeso(entrada.nextDouble());
                        System.out.print("\nDigite a altura do atleta: ");
                        atleta[cont].setAltura(entrada.nextDouble());
                        
                        cont++;
                        break;
                    }
                   
                case 2:
                    System.out.println("Nome" + "       " + "Altura" + "       " + "Peso" + "       " + "IMC");
                    
                    if(cont == 0){
                        System.out.println("\n\nAtleta ainda não cadastrado, por favor digite a opção 1 no menu");
                        break;
                    } else{
                        for(x = 0; x < cont; x++){
                            System.out.println(atleta[x].getNome() + "       " + atleta[x].getAltura() + "       " + 
                                    atleta[x].getPeso() + "       " + df.format(atleta[x].caclIMC()));
                        }
                        break;
                    } 
                case 3:
                    System.out.println("\nEncerrando a sessão....");
                    break;
                default:
                    System.out.println("Opcão invalida");
                    break;
            }
        }
    }
    
}
