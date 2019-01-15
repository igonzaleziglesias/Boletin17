package boletin17_2;

public class Morcego extends Mamifero implements IPodeVoar{
    
    @Override
    public void camiñar() {
        System.out.println("caminando");
    }

    @Override
    public void voar() {
        System.out.println("voando");
    }
}
