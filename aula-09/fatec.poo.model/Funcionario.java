package fatec.poo.model;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dataAdimissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dataAdimissao, String cargo){
        this.registro = registro;
        this.nome = nome;
        this.dataAdimissao = dataAdimissao;
        this.cargo = cargo;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdimissao() {
        return dataAdimissao;
    }

    public String getCargo() {
        return cargo;
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
