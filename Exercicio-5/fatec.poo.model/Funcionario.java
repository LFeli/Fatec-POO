package fatec.poo.model;


public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdimissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdimissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdimissao = dtAdimissao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdimissao() {
        return dtAdimissao;
    }
    
    
}
