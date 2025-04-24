
package br.fastfood.model;

public class Bebida implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Bebida cocaCola() {
        return new Bebida("Coca-Cola", 6.00);
    }

    public static Bebida sucoLaranja() {
        return new Bebida("Suco de Laranja", 7.00);
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
