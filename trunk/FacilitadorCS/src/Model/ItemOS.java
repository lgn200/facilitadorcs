package Model;

public class ItemOS extends Produtos {

    private float total;
    private int qtdeProduto;

    public ItemOS() {
    }

    public ItemOS(float total, int qtdeProduto) {
        this.total = total;
        this.qtdeProduto = qtdeProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
