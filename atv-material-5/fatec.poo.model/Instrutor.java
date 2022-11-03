package fatec.poo.model;

public class Instrutor extends Pessoa{
    private int indentificao;
    private String areaAtuacao;

    public Instrutor(int indentificao, String nome, String telefone) {
        super(nome, telefone);
        this.indentificao = indentificao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public int getIndentificao() {
        return indentificao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
}
