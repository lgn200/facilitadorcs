package Model;


public class Fornecedor extends Pessoa{

	private int idFornecedor;
        private String contato;
        private String ramo;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, String contato, String ramo) {
        this.idFornecedor = idFornecedor;
        this.contato = contato;
        this.ramo = ramo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

}