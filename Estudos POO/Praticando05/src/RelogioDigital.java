public class RelogioDigital {

    private DoisDigitos horas;
    private DoisDigitos minutos;
    private String telaString;

    public RelogioDigital(){
        horas = new DoisDigitos(24);
        minutos = new DoisDigitos(60);

    }
    public RelogioDigital(int horaEspecificas, int minutosEspecificos){
        horas = new DoisDigitos(24);
        minutos = new DoisDigitos(60);
        setTempo(horaEspecificas, minutosEspecificos);
    }

    public void setTempo(int phoras, int pminutos){
        horas.setValor(phoras);
        minutos.setValor(pminutos);
        atualizarTela();

    }

    public void TempoTic() {
        minutos.incrementar();
        if (minutos.getValor() == 0) {
            horas.incrementar();
        }
        atualizarTela();
        
    }

    public void atualizarTela(){
        telaString = horas.getValorParaMostrar() + ":" + minutos.getValorParaMostrar();
    } 
    
    public String getTempo(){
        return telaString;
    }
}
