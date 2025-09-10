public class Voo {
    private int nroVoo;
    private String codigoVoo;
    private String origem;
    private String destino;
    private String anoVoo;
    private String data;
    private int qtdePassageiros;
    private Passageiro [] vetPassageiros;

    public int getNroVoo() {
        return nroVoo;
    }

    public void setNroVoo(int nroVoo) {
        this.nroVoo = nroVoo;
    }

    public String getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAnoVoo() {
        return anoVoo;
    }
    
    public void setAnoVoo(String anoVoo) {
        this.anoVoo = anoVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Passageiro getPassageiro(int pos){
        return vetPassageiros[pos];
    }
    
    public void setPassageiro(Passageiro a) {
        if (this.qtdePassageiros < 50){
            this.vetPassageiros[qtdePassageiros] = a;
            qtdePassageiros++;
        }
    }


}
