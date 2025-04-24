
package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Sobremesa sorvete() {
        return new Sobremesa("Sorvete", 5.00);
    }

    public static Sobremesa brownie() {
        return new Sobremesa("Brownie", 6.50);
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
