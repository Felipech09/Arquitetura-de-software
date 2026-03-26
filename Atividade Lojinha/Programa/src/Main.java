public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Felipe", "felipe@email.com");

        Produto p1 = new Produto(1, "Teclado", 100, 10);
        Produto p2 = new Produto(2, "Mouse", 50, 20);

        Pedido pedido = new Pedido(1, cliente);

        pedido.adicionarItem(p1, 1);
        pedido.adicionarItem(p2, 2);

        pedido.finalizarPedido();

        double total = pedido.calcularTotal();

        SistemaPagamento sistema = SistemaPagamento.getInstancia();

        boolean aprovado = sistema.processarPagamento(total);

        // 7. Resultado
        if (aprovado) {
            System.out.println("Pagamento aprovado!");
            System.out.println("Pedido confirmado!");
        } else {
            System.out.println("Pagamento recusado!");
        }
    }
}