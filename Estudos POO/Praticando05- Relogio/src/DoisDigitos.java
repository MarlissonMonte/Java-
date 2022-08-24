public class DoisDigitos {
    //Atributo
    private int limite;
    private int valorAtual;    

    //Métodos Construtor 
    public DoisDigitos(int plimite){
        limite = plimite;
        valorAtual = 0 ;
    }
    //Métodos especiais
    public int getValor(){
        return valorAtual;
    }
    public void setValor(int pvalor){
        if((pvalor >= 0) && pvalor < limite){
            valorAtual = pvalor;
        }
    }
    public void incrementar(){
        valorAtual = (valorAtual +1) % limite;
    }
    public String getValorParaMostrar(){
        if (valorAtual < 10){
            return "0" + valorAtual;
        }else {
            return "" + valorAtual;
        }
    }

}