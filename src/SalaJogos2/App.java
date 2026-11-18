package SalaJogos2;

import SalaJogos1.*;

public class App {
    public static void main(String[] args){
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.velocidade(15, 10);

        Brinquedo caminhao = new Caminhao();
        caminhao.velocidade(80, 3.5);

        Brinquedo helicoptero = new Helicoptero();
        helicoptero.velocidade(180.0);

        Brinquedo navio = new Navio();
        navio.velocidade(25);

        ControleRemoto controle = new ControleRemoto(brinquedo);
        ControleRemoto controle1 = new ControleRemoto(navio);

        System.out.println("--Controlando os Brinquedos-- \n----------------------------");
        controle.mover();
        System.out.println("--------------------------");
        controle1.mover();
        System.out.println("--------------------------");
        controle1.setBrinquedo(helicoptero);
        controle1.mover();
        System.out.println("--------------------------");
        controle1.setBrinquedo(caminhao);
        controle1.mover();
        System.out.println("-------------------------");


    }
}

/* Questão - 2

     2.1) O método m1 na classe B está realizando a sobrescrita, porque o método já havia sido criado na superclasse A,
     e foi implementado novamente para a utilização de novos parâmetros.

     2.2) Na classe A acontece a sobrecarga no construtor, possibilitando duas formas de atribuir valores,
     assim como no método m1. Seguindo este modelo, ocorre novamente na classe B,
     em que o método m1 tem a possibilidade de inserir dois tipos de valores ou nenhum.

*/
