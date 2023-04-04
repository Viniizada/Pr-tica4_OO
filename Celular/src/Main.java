public class Main {
    public static void main(String[] args) {
        CelularFabricanteA celularA = new CelularFabricanteA();
        CelularFabricanteB celularB = new CelularFabricanteB();

        // testando os objetos dos celulares
        boolean ligouDesligouA = celularA.ligarDesligar();
        boolean usouCameraA = celularA.usarCamera();
        // ...

        boolean ligouDesligouB = celularB.ligarDesligar();
        boolean usouCameraB = celularB.usarCamera();
        // ...
    }
}