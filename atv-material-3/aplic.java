import model.contaCorrente;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numConta, opcao = 0;
        double saldo;
        
        System.out.print("Digite o numero da sua conta: ");
        numConta = entrada.nextInt();
        System.out.print("Digite o saldo atual da sua conta: ");
        saldo = entrada.nextDouble();
        
        contaCorrente objConta = new contaCorrente(numConta, saldo);
        
        do{
            System.out.println("\nDigite uma opção: "
                    + "\n 1 - Depositar"
                    + "\n 2- Sacar"
                    + "\n 3- Ver saldo atual"
                    + "\n 4- Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("Digite um valor para deposito :");
                    objConta.depositar(entrada.nextDouble());
                    
                    System.out.println("\n-----------------------------"
                            + "\nSeu saldo atua e :" + objConta.getSaldo() 
                            + "\n-----------------------------");
                    break;
                    
                case 2: 
                    System.out.print("Digite um valor para sacar :");
                    objConta.sacar(entrada.nextDouble());
                    
                    System.out.println("\n-----------------------------"
                            + "\nSeu saldo atua e :" + objConta.getSaldo() 
                            + "\n-----------------------------");
                    break;
                    
                case 3:
                    System.out.println("\n-----------------------------"
                            + "\nSeu saldo atua e :" + objConta.getSaldo() 
                            + "\n-----------------------------");
                    break;
                    
                case 4:
                    System.out.println("Encerrando a sessão");
                    break;
            }
        }while(opcao < 4);
    }
}
