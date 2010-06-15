package Model;

public class Telefone {

    private String telefone;
    private String comercial ;
    private String celular;
    private String residencial;
    private String fax;

    public Telefone() {
    }

    public Telefone(String telefone, String comercial, String celular, String residencial, String fax) {
        this.telefone = telefone;
        this.comercial = comercial;
        this.celular = celular;
        this.residencial = residencial;
        this.fax = fax;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

