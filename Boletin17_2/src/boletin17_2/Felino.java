package boletin17_2;


public class Felino extends Mamifero implements IPodeNadar{

    @Override
    public void camiñar() {
        System.out.println("caminando");
    }

    @Override
    public void nadar() {
        System.out.println("nadando");
    }
    
}
