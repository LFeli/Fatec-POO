import java.util.Scanner;

public class aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numPlaca, horaIni, horaFinal, hora,minuto, tempTotal, cont;
        double valPagar = 0, totalDia = 0;
        
        while(numPlaca != 0){
            System.out.print("Digite a placa do veiculo: ");
            numPlaca = entrada.nextInt(); 

            if (numPlaca == 0){
                // Resultado do dia
                System.out.println("Valor a pagar: " + totalDia);
                break;
            }

            System.out.println("Digite o horario de entrada: ");
            horaIni = entrada.nextInt(); 
            System.out.println("Digite o horario de saída: ");
            horaFinal = entrada.nextInt(); 

            if((horaIni > horaFinal) || (horaIni < 700) || (horaFinal > 1800)){
                // Validação de erro
                System.out.println("horario invalido ");

                horaIni = 0;
                horaFinal = 0;
                valPagar = 0;
                
                System.out.println("Valor a pagar: " + valPagar);
                System.out.println("Horario de entrada do veiculo: " + horaIni);
                System.out.println("Horario de saída do veiculo: " + horaFinal);
            } 

            // Logica para cobrança
            hora = ((horaFinal < horaIni) / 100) * 60; 
            minuto = (horaFinal < horaIni) % 100;
            tempTotal = hora + minuto;
            cont = tempTotal / 15;
            valPagar = cont * 1.50;

            // Impressão de resultados
            System.out.println("Valor a pagar: " + valPagar);
            System.out.println("Horario de entrada do veiculo: " + horaIni);
            System.out.println("Horario de saída do veiculo: " + horaFinal);

            // Soma
            totalDia =+ valPagar;
        }  
    }
}
