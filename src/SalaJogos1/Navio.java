package SalaJogos1;

public class Navio extends Brinquedo {
    @Override
    public void mover(){
        System.out.println(" O navio está se movendo a " + velocidade + " nós. Aceleração: "+ aceleracao + " m/s");
    }
}
