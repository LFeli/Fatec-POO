import java.util.Scanner;
import model.Aluno;

public class aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
       int opcao = 0;
       
       
        System.out.print("\nDigite o RA do aluno: ");
            objAluno.setRA(entrada.nextInt());
            
        System.out.print("Digite a nota da Primeira Prova: ");
            objAluno.setNtPrv1(entrada.nextDouble());

        System.out.print("Digite a nota da Segunda Prova: ");
            objAluno.setNtPrv2(entrada.nextDouble());

        System.out.print("Digite a nota do primeiro trabalho: ");
            objAluno.setNtTrab1(entrada.nextDouble());

        System.out.print("Digite a nota do Segunda trabalho: ");
            objAluno.setNtTrab2(entrada.nextDouble());
                
        while(opcao < 4){        
            System.out.print("\n(1) - Exibir Nota das Provas/Trabalhos \n" +
                    "(2) - Exibir Média dos Trabalhos/Provas\n" +
                    "(3) - Exibir Média Final\n" +
                    "(4) - Sair\n\n" +
                    "\tDigite a Opção: ");
                opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                System.out.println("\nProvas e trabalhos:\nProva 1: " + objAluno.getNtPrv1()
                        + "\nProva 2: " + objAluno.getNtPrv2()
                        + "\nTrabalho 1: " + objAluno.getNtTrab1()
                        + "\nTrabalho 2: " + objAluno.getNtTrab2());
                        break;
                case 2:
                    System.out.print("\nMédia das provas: " + objAluno.calcMediaProva() 
                            + "\nMédia dos trabalhos: " + objAluno.calcMediaTrab());
                        break;
                        
                case 3:
                    System.out.print("\nMédia do Aluno: " + objAluno.calcMediaFinal());
                        break;
                        
                case 4:
                    break;
                    
                default:
                    System.out.println("\nDigite uma opção válida!");
                        break;
            }
       }
    }
    
    
}
