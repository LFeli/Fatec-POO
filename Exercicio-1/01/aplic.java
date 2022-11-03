import java.util.Scanner;

public class aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdeVend,condPag;
        double valVenda, valTotal;
        
        System.out.print("Digite a quantidade vendida: ");
        qtdeVend = entrada.nextInt();     
        System.out.print("Digite o preço unitário de vendas: ");
        valVenda = entrada.nextDouble(); //scanf("%lf", &precUnit);
   
        System.out.println("Selecione a forma de pagamento: \n "
                + "[1] paga pagamento a vista em dinheiro ou em cheque\n "
                + "[2] para Cartão de Crédito em 1x\n"
                + "[3] Em 2x no Cartão de Crédito\n "
                + "[4] Em 3x no Cartão de Crédito");
        condPag = entrada.nextInt();
        
        if (condPag == 1){
            valTotal = (valVenda * qtdeVend) * 0.9;
            System.out.print("Valor a pagar R$ " + valTotal);
        }   else if (condPag == 2){
            valTotal = (valVenda * qtdeVend) * 0.5;
            System.out.print("Valor a pagar R$ " + valTotal);
        } else if (condPag == 3){
            valTotal = (valVenda * qtdeVend) * 1.05;
            System.out.print("Valor a pagar R$ " + valTotal);
        } else {
            valTotal = (valVenda * qtdeVend) * 1.10;
            System.out.print("Valor a pagar R$ " + valTotal);
        }
       
    }
}
