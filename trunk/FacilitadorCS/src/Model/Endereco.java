package Model;

public class Endereco {

    private String bairro;
    private String cep;
    private String logradouro;
    private String complemento;
    private int nr;
    Cidade cidade;
    TipoComplemento tipoComplemento;

    public Endereco() {
    }

    public Endereco(String bairro, String cep, String logradouro, String complemento, int nr, Cidade cidade, TipoComplemento tipoComplemento) {
        this.bairro = bairro;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.nr = nr;
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public TipoComplemento getTipoComplemento() {
        return tipoComplemento;
    }

    public void setTipoComplemento(TipoComplemento tipoComplemento) {
        this.tipoComplemento = tipoComplemento;
    }

    
}
