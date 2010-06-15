package Model;

public class OS {

    private String descricao, atendente, tecnico, dataAb, dataFc, horaAb, horaFc;
    private Long nOS;
    private Float totalPagar;
    private Pessoa cliente;
    private Usuario usuario;
    private ItemOS item;

    public OS() {
    }

    public OS(String descricao, String atendente, String tecnico, String dataAb, String dataFc, String horaAb, String horaFc, Long nOS, Float totalPagar, Pessoa cliente, Usuario usuario, ItemOS item) {
        this.descricao = descricao;
        this.atendente = atendente;
        this.tecnico = tecnico;
        this.dataAb = dataAb;
        this.dataFc = dataFc;
        this.nOS = nOS;
        this.totalPagar = totalPagar;
        this.cliente = cliente;
        this.usuario = usuario;
        this.horaAb = horaAb;
        this.horaFc = horaFc;
        this.item = item;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String getDataAb() {
        return dataAb;
    }

    public void setDataAb(String dataAb) {
        this.dataAb = dataAb;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ItemOS getItem() {
        return item;
    }

    public void setItem(ItemOS item) {
        this.item = item;
    }

    public Long getnOS() {
        return nOS;
    }

    public void setnOS(Long nOS) {
        this.nOS = nOS;
    }

    public Float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataFc() {
        return dataFc;
    }

    public void setDataFc(String dataFc) {
        this.dataFc = dataFc;
    }

    public String getHoraAb() {
        return horaAb;
    }

    public void setHoraAb(String horaAb) {
        this.horaAb = horaAb;
    }

    public String getHoraFc() {
        return horaFc;
    }

    public void setHoraFc(String horaFc) {
        this.horaFc = horaFc;
    }
}
