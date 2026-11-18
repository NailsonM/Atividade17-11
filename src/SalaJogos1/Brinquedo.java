package SalaJogos1;

public class Brinquedo {
    protected double velocidade;
    protected double aceleracao;


    public void mover() {
        System.out.println("Brinquedo movido!");
    }
    public void velocidade(int vel) {
        this.velocidade = vel;
    }
    public void velocidade(double vel) {
        this.velocidade = vel;
    }
    public void velocidade(double vel, double acel) {
        this.velocidade = vel;
        this.aceleracao = acel;
    }

}
