package SalaJogos1;

public class Caminhao extends Brinquedo {
    @Override
    public void mover(){
        System.out.println(" O Caminhão está se movendo a " + velocidade + " km/h. Aceleração: " + aceleracao + " m/s");
    }
}

