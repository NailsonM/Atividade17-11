package Questao3;

public class App {
    public static void main(String[] args) {
        Loja novaLoja = new Loja("Tech", "Informática e Eletrônicos", 2022);

        novaLoja.admitirVendedor("Marcelo Campos", 28);
        novaLoja.getVendedor().vender();
        novaLoja.demitirVendedor();

    }
}
