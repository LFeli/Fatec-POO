import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComisissionado;
import java.text.DecimalFormat;


public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        FuncionarioHorista funcHora = new FuncionarioHorista(1234, "Felipe", "12/10/22", 35);
        FuncionarioMensalista funcMensal = new FuncionarioMensalista(12344, "Lucas", "11/12/22", 80);
        FuncionarioComisissionado funcComissado = new FuncionarioComisissionado(122222, "João", "21/12/22", 10);
        
        //Horista
        funcHora.setQntdHorasTrab(40);
        funcHora.setCargo("Ajudante");
        
        System.out.println("Funcionario: " + funcHora.getNome() + "\ncom registro: " + funcHora.getRegistro()
                         + "\ncom data de admissão: " + funcHora.getDtAdimissao()+ "\ntem uma salario bruto de: "
                         + df.format(funcHora.calcSalBruto()) + "\ne uma gratificação de: " + df.format(funcHora.calcGratificacao())
                         + "\ne um salario liquido de: " + df.format(funcHora.calcSalLiquido()));


        //Mensalista
        funcMensal.setNumSalMin(60);
        funcMensal.setCargo("Gerente");
        
        System.out.println("\n\nFuncionario: " + funcMensal.getNome() + "\ncom registro: " + funcMensal.getRegistro()
                         + "\ncom data de admissão: " + funcMensal.getDtAdimissao()+ "\ntem uma salario bruto de: "
                         + df.format(funcMensal.calcSalBruto()) + "\ne um salario liquido de: " + df.format(funcMensal.calcSalLiquido()));
        
        
        //Comisissionado
        funcComissado.setSalBase(2000);
        funcComissado.setCargo("Vendendor");
        
        funcComissado.addVendas(6000);
        
        System.out.println("\n\nFuncionario: " + funcComissado.getNome() + "\ncom registro: " + funcComissado.getRegistro() 
                         + "\ne taxa de comissao de: " + funcComissado.getTaxaDeComissao() + "% "
                         + "\ncom data de admissão: " + funcComissado.getDtAdimissao() 
                         + "\ncom total de vendas no dia de: " + df.format(funcComissado.getTotalVendas())
                         + "\ntem uma salario bruto de: " + df.format(funcComissado.calcSalBruto()) 
                         + "\ne um salario liquido de: " + df.format(funcComissado.calcSalLiquido())
        );
        
        
    }
    
}
