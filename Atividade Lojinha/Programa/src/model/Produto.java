public class Produto {
    private int id;
    private String nome;
    private double valor;
    private int estoque;

    public Produto(int id, String nome, double valor, int estoque) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }
}