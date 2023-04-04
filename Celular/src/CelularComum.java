public class CelularComum implements UsoCelular {
    boolean enviarMensagem;
    boolean acessarInternet;
    boolean acessarEmails;
    boolean verificarSistemaDeArquivos;
    boolean usarRadio;
    boolean usarTV;

    @Override
    public boolean ligarDesligar() {
        return false;
    }

    @Override
    public boolean usarCamera() {
        return false;
    }

    @Override
    public boolean usarFoneDeOuvido() {
        return false;
    }

    @Override
    public boolean controlarVolume() {
        return false;
    }
}
