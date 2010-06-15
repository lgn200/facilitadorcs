package Model;

import java.util.Date;

public class Pessoa {
    private int idPessoa;
    private String cpf_cnpj;
    private String coment;
    private Date dataNasciemnto;
    private String email;
    private String nome;
    TipoPessoa tipopessoa;
    Telefone telefone;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String cpf_cnpj, String coment, Date dataNasciemnto, String email, String nome, TipoPessoa tipopessoa, Telefone telefone) {
        this.cpf_cnpj = cpf_cnpj;
        this.idPessoa = idPessoa;
        this.coment = coment;
        this.dataNasciemnto = dataNasciemnto;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public Date getDataNasciemnto() {
        return dataNasciemnto;
    }

    public void setDataNasciemnto(Date dataNasciemnto) {
        this.dataNasciemnto = dataNasciemnto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public TipoPessoa getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(TipoPessoa tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    
}
