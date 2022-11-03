package fatec.poo.model;

public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //Multiplicidade 1..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[3];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla
                          +"\nNome : " + nome
                          +"\nQuantidade de funcionarios: " + numFunc
                          +"\nRegistro\t\tNome\t\tCargo");
        for(int x = 0; x < numFunc; x++){
            System.out.println(funcionarios[x].getRegistro() + "\t\t" + funcionarios[x].getNome() + "\t\t" + funcionarios[x].getCargo());
        }
    }
}
