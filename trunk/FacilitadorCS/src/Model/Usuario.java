package Model;


public class Usuario extends Pessoa {

	private String acesso;
	private boolean ativo;
	private String senha;
        Funcao funcao;
    private int idPessoa;


    public Usuario() {
              super();
              acesso = "";
              ativo = false;
              senha = "";
              
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

        



}