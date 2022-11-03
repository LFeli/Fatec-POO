import java.text.DecimalFormat;
import java.util.Scanner;
import fatec.poo.model.QuartoHotel;

public class aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        QuartoHotel[] hotel = new QuartoHotel[2];
        
        int numQuarto, numRG, opcao = 0, cont;
        double valDiaria, totalFaturado = 0;
        
        for(cont = 0; cont < 2; cont++){
            System.out.print("Digite o numero do quarto: ");
            numQuarto = entrada.nextInt();
            System.out.print("Digite o valor da diaria do quarto: ");
            valDiaria = entrada.nextDouble();
            
            hotel[cont] = new QuartoHotel(numQuarto, valDiaria);
        }
        
        while(opcao != 6){
            System.out.println("\n\nDigite uma opção: "
                    + "\n 1 - Consultar quarto"
                    + "\n 2- Reservar quarto"
                    + "\n 3- Liberar quarto"
                    + "\n 4- Consultar faturamento quarto"
                    + "\n 5- Consultar faturamento hotel"
                    + "\n 6- Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("\nDigite o numero do quarto para consulta-lo: ");
                    numQuarto = entrada.nextInt();
                    cont = 0;
                    
                    while(cont < 2 && hotel[cont].getNumQuarto() != numQuarto){
                        cont++;
                    }
                    
                    if(cont == 2){
                        System.out.println("Quarto não cadastrado");
                    } 
                    else {
                        if(hotel[cont].Situacao() == false){
                            System.out.println("\nO quarto consultado está livre");
                        } else {System.out.println("\nO quarto consultado se encotra ocupado no momento");}
                    }
                    
                    break;
                    
                case 2:
                    System.out.print("\nDigite o numero do quarto para reserva-lo: ");
                    numQuarto = entrada.nextInt();
                    cont = 0;
                    
                    while(cont < 2 && hotel[cont].getNumQuarto() != numQuarto){
                        cont++;
                    }
                    
                    if(cont == 2){
                        System.out.println("Quarto não cadastrado");
                    }
                    else{
                        if(hotel[cont].Situacao() == false){
                            System.out.print("\n Por favor digite seu RG: ");
                            numRG = entrada.nextInt();
                            
                            hotel[cont].reserva(numRG);
                            System.out.println("\n Parabens o quarto número '" + hotel[cont].getNumQuarto() + "' foi reservado...");
                        } else {System.out.println("\n Infelizmente o quarto selecionado ja se encontra reservado, por favor reserve outro quarto");}
                    }
                    
                    break;
                    
                case 3:
                   System.out.print("\nDigite o numero do quarto para libera-lo: ");
                   numQuarto = entrada.nextInt();
                   cont = 0;
                    
                   while(cont < 2 && hotel[cont].getNumQuarto() != numQuarto){
                        cont++;
                    }
                    
                   if(cont == 2){
                        System.out.println("\n Quarto não cadastrado");
                    } 
                   else{
                        if(hotel[cont].Situacao() == true){
                        int dias = 0;
                        System.out.print("\n Por favor insira quantas diarias foi utilizado: ");
                        dias = entrada.nextInt();
                            
                        hotel[cont].libera(dias);
                        totalFaturado  += hotel[cont].getTotalFaturado();
                        System.out.println("\n O quarto '" + hotel[cont].getNumQuarto() +"' Foi liberado");
                        } else{System.out.println("\n Não e possivel liberar um quarto ja livre");}
                    }
                   
                   break;
                   
                case 4:
                    System.out.print("\nDigite o numero do quarto para consulta-lo: ");
                    numQuarto = entrada.nextInt();
                    cont = 0;
                    
                    while(cont < 2 && hotel[cont].getNumQuarto() != numQuarto){
                        cont++;
                    }
                    
                    if(cont == 2){
                        System.out.println("Quarto não cadastrado");
                    } 
                    else {
                        System.out.println("Total faturado atualmente : " + df.format(hotel[cont].getTotalFaturado()));
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Faturamento atual do Hotel :" + df.format(totalFaturado));
                    break;
                    
                default:
                    System.out.println("Opcão invalida");
                    break;
            }
        }
    }
    
}
