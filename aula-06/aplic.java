import java.text.DecimalFormat;
import fatec.poo.model.Aluno;

public class aplic {

    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#,##0.00");
       
       Aluno objAluno = new Aluno(1010, "Carlos Silveira", "21/01/2001");
       
       objAluno.setMensalidade(1500);
        System.out.print("\nRegistro escolar : " + objAluno.getRegEscolar());
        System.out.print("\nNome : " + objAluno.getNome());
        System.out.print("\nData de nascimento : " + objAluno.getDtNascimento());
        System.out.print("\nMensalidade : " + objAluno.getMensalidade());
        System.out.print("\n");
    }  
}
