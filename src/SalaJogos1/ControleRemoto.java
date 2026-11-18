package SalaJogos1;

public class ControleRemoto {
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo brinquedo){
        setBrinquedo(brinquedo);
    }

    public void setBrinquedo(Brinquedo brinquedo){
        this.brinquedo = brinquedo;
    }

    public Brinquedo getBrinquedo(){
        return brinquedo;
    }
    public void mover() {
        System.out.print("Acionando comando -> ");
        brinquedo.mover();
    }

}
