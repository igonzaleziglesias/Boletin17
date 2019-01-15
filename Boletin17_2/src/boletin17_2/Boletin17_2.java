package boletin17_2;

public class Boletin17_2 {

    public static void main(String[] args) {


        
        //solo precisas incluir os metodos da interface IPodeNadar na clase gato, 
        //por que hereda da clase mamifero os metodos da interface IPodeCamiñar

        Gato obxG = new Gato();
        System.out.println("gato:");
        obxG.camiñar();
        obxG.nadar();
        
        Papagaio obxP = new Papagaio();
        System.out.println("Papagaio:");
        obxP.camiñar();
        obxP.voar();
        
        Avestruz obxA = new Avestruz();
        System.out.println("Avestruz:");
        obxA.camiñar();
        
        
        Morcego obxM = new Morcego();
        System.out.println("Morcego:");
        obxM.camiñar();
        obxM.voar();
        
        Tigre obxT = new Tigre();        
        System.out.println("Tigre:");
        obxT.camiñar();
        obxT.nadar();
        
           

    }
    
}
