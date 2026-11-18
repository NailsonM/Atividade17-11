package Questao3;

public class Loja {
    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, int anoFundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
    }

    public void admitirVendedor(String nomeVendedor, int idadeVendedor) {
        this.vendedor = new Vendedor(nomeVendedor, idadeVendedor);
        System.out.println("O vendedor " + nomeVendedor + " foi contratado na loja " + this.nome);
    }

    public void demitirVendedor() {
        if (this.vendedor != null) {
            System.out.println("O vendedor " + this.vendedor.getNome() + " foi demitido da loja " + this.nome);
        } else {
            System.out.println("Não há vendedor contratado no momento.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
