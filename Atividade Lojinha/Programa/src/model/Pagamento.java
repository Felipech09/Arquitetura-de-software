public class Pagamento {
    private int id;
    private Pedido pedido;
    private double valor;
    private String status;

    public Pagamento(int id, Pedido pedido, double valor) {
        this.id = id;
        this.pedido = pedido;
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}