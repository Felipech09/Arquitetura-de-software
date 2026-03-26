import java.util.Random;

public class Sistema {
    private static Sistema instancia;

    private Sistema() {}

    public static Sistema getInstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }

    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor);

        // simulação
        return new Random().nextBoolean();
    }
}