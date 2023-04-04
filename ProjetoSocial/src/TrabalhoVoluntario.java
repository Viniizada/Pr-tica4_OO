public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }


    public boolean validaProjeto() {
        if (getDuracaoTrabalho() >= 2) {
            boolean result = true;
        }
        else {
            boolean result = false;
        }

        public void imprimePojeto(){
            System.out.println("Nome do projeto: "+ getNomeProjeto()+"\n Descrição: "+getDescricao()+"\n DataInicio: "
                    +getDatainicio()+"\n DataFim: "+getDatafim()+"\n TipoTrabalho: "+getTipoTrabalho()+"\n DuraçãoTrabalho: "+getDuracaoTrabalho());

        }
    }
}
