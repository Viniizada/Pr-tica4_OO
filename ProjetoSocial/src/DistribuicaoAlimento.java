public class DistribuicaoAlimento  extends  Projeto{
    private String descAlimteo;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
    }

    public String getDescAlimteo() {
        return descAlimteo;
    }

    public void setDescAlimteo(String descAlimteo) {
        this.descAlimteo = descAlimteo;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }


    public boolean validaProjeto() {
        if(getDatafim() == null){
            return true;
        }
        return false;
    }


    public void imprimePojeto() {
        System.out.println("Nome do projeto: "+ getNomeProjeto()+"\n Descrição: "+getDescricao()+"\n DataInicio: "
                +getDatainicio()+"\n DataFim: "+getDatafim()+"\n DescAliemto: "+getDescAlimteo()+"\n Quantidade: "+getQtde());

    }
}
