import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        FuncionarioHorista funcHora = new FuncionarioHorista(1234, "Felipe", "12/10/22", "Ajudante", 35);
        FuncionarioMensalista funcMensal = new FuncionarioMensalista(12344, "Lucas", "11/12/22", "Gerente", 80);
        
        //Horista
        funcHora.setQtdeHoras(40);
        
        System.out.println("Funcionario: " + funcHora.getNome() + "\ncom registro: " + funcHora.getRegistro()
                         + "\ncom data de admissão: " + funcHora.getDataAdimissao() + "\ntem uma salario bruto de: "
                         + df.format(funcHora.calcSalBruto()) + "\ne uma gratificação de: " + df.format(funcHora.calcGratificacao())
                         + "\ne um salario liquido de: " + df.format(funcHora.calcSalLiquido()));
        //Mensalista
        funcMensal.setNumSalMin(60);
        
        System.out.println("\n\nFuncionario: " + funcMensal.getNome() + "\ncom registro: " + funcMensal.getRegistro()
                         + "\ncom data de admissão: " + funcMensal.getDataAdimissao() + "\ntem uma salario bruto de: "
                         + df.format(funcMensal.calcSalBruto()) + "\ne um salario liquido de: " + df.format(funcMensal.calcSalLiquido()));
    }
    
}
