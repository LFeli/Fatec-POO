import java.text.DecimalFormat;
import java.util.Scanner;
import model.contaCorrente;

public class aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        contaCorrente[] conta  = new contaCorrente[3];
        
        int numConta, opcao = 0, consulta, x, verificacao = 0;
        double saldo, valor;
        
        
       for(x = 0; x < conta.length; x++){
            System.out.print("Digite o numero da sua conta: ");
            numConta = entrada.nextInt();
            System.out.print("Digite o saldo atual da sua conta: ");
            saldo = entrada.nextDouble();
            
            conta[x] = new contaCorrente(numConta, saldo);
       }    
       
       while (opcao != 5){
           System.out.println("\n\nDigite uma opção: "
                    + "\n 1 - Depositar"
                    + "\n 2- Sacar"
                    + "\n 3- Ver saldo atual"
                    + "\n 4- Listar contas"
                    + "\n 5- Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("Digite a conta que deseja depositar: ");
                    consulta = entrada.nextInt();
                    
                    for(x = 0; x < conta.length; x++){
                        if(consulta == conta[x].getNumero()){
                            System.out.print("Digite o Valor que deseja depositar: ");
                            valor = entrada.nextDouble();
                            
                            if(valor > 0){
                                conta[x].depositar(valor);
                                System.out.println("\n----------------------------------------------------"
                                                 + "\nParabens você depositou : " + valor + " na conta: " + conta[x].getNumero()
                                                 + "\n----------------------------------------------------");
                            } else {
                                System.out.println("Não aceitamos depositos abaixo de 1 real.");
                            }
                        }
                        
                        else{
                            verificacao += 1;
                        }
                    }
                    
                    if(verificacao >= conta.length){
                        System.out.println("Conta não cadastrada");
                    }
                    
                    //Reset
                    verificacao = 0;
                    break;
                    
                case 2:
                    System.out.print("Digite a conta que deseja sacar: ");
                    consulta = entrada.nextInt();
                    
                    for(x = 0; x < conta.length; x++){
                        if(consulta == conta[x].getNumero()){
                            System.out.print("Digite o Valor que deseja sacar");
                            valor = entrada.nextDouble();  
                            
                            if(valor < conta[x].getSaldo()){
                                conta[x].sacar(valor);
                                System.out.println("\n----------------------------------------------------"
                                                 + "\nParabens você sacou : " + valor + " na conta: " + conta[x].getNumero()
                                                 + "\n----------------------------------------------------");
                            } else {
                                System.out.println("Saldo Insuficiente!\n");
                            }
                        }
                        
                        else{
                            verificacao += 1;
                        }
                    }
                    
                    if(verificacao >= conta.length){
                        System.out.println("Conta não cadastrada");
                    }
                    
                    //Reset
                    verificacao = 0;
                    break;

                case 3:
                    System.out.print("Digite a conta que deseja consultar o saldo: ");
                    consulta = entrada.nextInt();
                    
                    for(x = 0; x < conta.length; x++){
                        if(consulta == conta[x].getNumero()){
                             System.out.print("\nConta: " + conta[x].getNumero() +
                                    "\nSeu saldo é: " + df.format(conta[x].getSaldo()));
                        }
                        
                        else{
                            verificacao += 1;
                        }
                    }
                    
                    if(verificacao >= conta.length){
                        System.out.println("Conta não cadastrada");
                    }
                    
                    //Reset
                    verificacao = 0;
                    break;
                    
                case 4:
                     System.out.println("Listagem de Contas");
                    for (x = 0; x < conta.length; x++) {
                        System.out.println("Conta: '" + conta[x].getNumero() + "'" + " Saldo: " +
                                df.format(conta[x].getSaldo()));
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Encerrando a sessão.....");
                    break;
                    
                default:
                    System.out.println("Opcão inválida");
            }
       }
    }
}
