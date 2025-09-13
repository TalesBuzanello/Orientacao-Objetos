public class Companhia {
    private String nomeCompanhia;
    private String cnpj;
    private String telefone;
    private String emailComercial;
    private int qtdeVoos;
    private Voo[] vetVoos;

    public Companhia (){
        this.vetVoos = new Voo[20];
    }

    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmailComercial() {
        return emailComercial;
    }

    public void setEmailComercial(String emailComercial) {
        this.emailComercial = emailComercial;
    }

    public int getQtdeVoos() {
        return qtdeVoos;
    }

    public void setQtdeVoos(int qtdeVoos) {
        this.qtdeVoos = qtdeVoos;
    }

    public Voo getVoo (int pos){
        return vetVoos[pos];
    }

    public void setVoo (Voo v) {
        if (this.qtdeVoos < 10){
            this.vetVoos[this.qtdeVoos] = v;
            qtdeVoos++;
        }
    }

    
}
