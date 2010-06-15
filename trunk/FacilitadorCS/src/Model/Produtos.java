package Model;

import java.sql.Blob;

public class Produtos {

	private int idProduto;
	private char descricao;
	private Blob Foto;
	private float porcLucro;
	private int qtdeMinima;
	private float valorUnit;
	private float valorVenda;
        private int emEstoque;
        Fornecedor fornecedor;

    public Produtos() {
    }

    public Produtos(int idProduto, char descricao, Blob Foto, float porcLucro, int qtdeMinima, float valorUnit, float valorVenda, int emEstoque, Fornecedor fornecedor) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.Foto = Foto;
        this.porcLucro = porcLucro;
        this.qtdeMinima = qtdeMinima;
        this.valorUnit = valorUnit;
        this.valorVenda = valorVenda;
        this.emEstoque = emEstoque;
        this.fornecedor = fornecedor;
    }

    public Blob getFoto() {
        return Foto;
    }

    public void setFoto(Blob Foto) {
        this.Foto = Foto;
    }

    public int getidProduto() {
        return idProduto;
    }

    public void setidProduto(int codProduto) {
        this.idProduto = codProduto;
    }

    public char getDescricao() {
        return descricao;
    }

    public void setDescricao(char descricao) {
        this.descricao = descricao;
    }

    public int getEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(int emEstoque) {
        this.emEstoque = emEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPorcLucro() {
        return porcLucro;
    }

    public void setPorcLucro(float porcLucro) {
        this.porcLucro = porcLucro;
    }

    public int getQtdeMinima() {
        return qtdeMinima;
    }

    public void setQtdeMinima(int qtdeMinima) {
        this.qtdeMinima = qtdeMinima;
    }

    public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

        
	
}