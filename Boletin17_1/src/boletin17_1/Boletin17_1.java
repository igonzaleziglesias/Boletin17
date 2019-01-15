package boletin17_1;

public class Boletin17_1 {

    public static void main(String[] args) {

        Mamifero obxM = new Mamifero();
        System.out.println("mamifero:");
        obxM.camiñar();
        
        //solo precisas incluir os metodos da interface IPodeNadar na clase gato, 
        //por que hereda da clase mamifero os metodos da interface IPodeCamiñar

        Gato obxG = new Gato();
        System.out.println("gato:");
        obxG.camiñar();
        obxG.nadar();
        
        Papagaio obxP = new Papagaio();
        System.out.println("Papagaio:");
        obxP.camiñar();

    }
    
}
