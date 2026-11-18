package SalaJogos1;

public class Helicoptero extends Brinquedo {
    @Override
    public void mover(){
        System.out.println(" O helicoptero está se movendo a " + velocidade + " km/h. Aceleração: "+ aceleracao + " m/s");
    }
}
