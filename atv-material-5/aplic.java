import java.util.Scanner;
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;


public class aplic {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       String nome, cpf, telefone, area;
       int indentificao;
       
        System.out.print("Digie o CPF do cliente : ");
        cpf = entrada.next();
        System.out.print("\nDigie o Nome do cliente : ");
        nome = entrada.next();
        System.out.print("\nDigie o Telefone do cliente : ");
        telefone = entrada.next();
        
        Cliente aluno = new Cliente(cpf, nome, telefone);
        
        System.out.print("\nDigite o Peso do aluno em KG ");
        aluno.setPeso(entrada.nextDouble());
        System.out.print("\nDigite a Altura do aluno em METROS ");
        aluno.setAltura(entrada.nextDouble());
        
        
        // Professor -----------------------------------------------------------
        System.out.println("\nDigite a indentifição do professor: ");
        indentificao = entrada.nextInt();
        System.out.print("\nDigie o Nome do professor: ");
        nome = entrada.next();
        System.out.print("\nDigie o Telefone do professor: ");
        telefone = entrada.next();
        
        Instrutor professor = new Instrutor(indentificao, nome, telefone);
        
        System.out.print("\nDigie a área de atuação do professor: ");
        professor.setAreaAtuacao(entrada.next());
        
        
        // Mensagem ------------------------------------------------------------
        System.out.println("\n\nO(A) aluno(a) " + aluno.getNome() + " CPF de numero: " + aluno.getCpf() + " E numero: " + aluno.getTelefone() +
                            "\n Terá aula com o Professor " + professor.getNome() + " com o numero de Indenfitição: " + professor.getIndentificao() + 
                            "\n Telefone: " + professor.getTelefone() + " com área de atuação: " + professor.getAreaAtuacao());
    }
    
}
