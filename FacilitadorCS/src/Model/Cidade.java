package Model;


public class Cidade {

	private String cidade;
        UF uf;

    public Cidade() {
    }

    public Cidade(String nome, UF uf) {
        this.cidade = nome;
        this.uf = uf;
    }

    public String getNome() {
        return cidade;
    }

    public void setNome(String nome) {
        this.cidade = nome;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

        

}