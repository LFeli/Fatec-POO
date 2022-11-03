import java.util.Scanner;
import fatec.poo.model.Vendendor;
import fatec.poo.model.Cliente;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int codigo, opcao = 0;
        String nome;
        double taxaComissao, compras, limitCredito, venda, percent;
        
        //Vendendor
        System.out.print("Digie o codigo do vendendor : ");
        codigo = entrada.nextInt();
        System.out.print("\nDigie o Nome do vendendor : ");
        nome = entrada.next();
        System.out.print("\nDigie a taxa de comissão do vendendor : ");
        taxaComissao = entrada.nextDouble() / 100;
        
        Vendendor vendendor = new Vendendor(codigo, nome, taxaComissao);
        
        while(opcao != 4){
             System.out.println("\n\nDigite uma opção: "
                    + "\n 1 - Ver total de vendas"
                    + "\n 2- Adicionar vendas"
                    + "\n 3- Ver comissão"
                    + "\n 4- Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("\nO total de vendas até o momento é: " + vendendor.getTotalVendas());
                    break;
                    
                case 2:
                    System.out.print("\n Valor da venda: ");
                    venda = entrada.nextDouble();
                    vendendor.addVendas(venda);
                    System.out.println("\n Venda adiciona com sucesso");
                    break;
                    
                case 3:
                    System.out.print("Valor da sua comissão no momemnto é: " + vendendor.calcValorComissao());
                    break;
                    
                case 4:
                    System.out.println("Encerrando a sessão...");
                    break;
            }
        }
        
        
        //Cliente 
        System.out.print("Digie o codigo do cliente : ");
        codigo = entrada.nextInt();
        System.out.print("\nDigie o Nome do cliente : ");
        nome = entrada.next();
        System.out.print("\nDigie o limite atual : ");
        limitCredito = entrada.nextDouble();
        
        Cliente cliente = new Cliente(codigo, nome, limitCredito);
        
        while(opcao != 4){
             System.out.println("\n\nDigite uma opção: "
                    + "\n 1 - Ver total de compras"
                    + "\n 2- Adicionar compra"
                    + "\n 3- Ver limite atual"
                    + "\n 4- Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("\nO total de compras até o momento é: " + cliente.getTotalCompras());
                    break;
                    
                case 2:
                    System.out.print("\n Valor da compra: ");
                    compras = entrada.nextDouble();
                    
                    if(cliente.getLimitCredit() > compras){
                        cliente.addCompras(compras);
                        System.out.println("\n Compra realizada com sucesso");
                        break;
                    } else{
                        System.out.println("Compra recusada por falta de limite");
                        break;
                    }
                    
                case 3:
                    System.out.print("o seu limite disponivel atualmente é: " + cliente.calcLimitDispo());
                    break;
                    
                case 4:
                    System.out.println("Encerrando a sessão...");
                    break;
            }
        }
    }
    
}
