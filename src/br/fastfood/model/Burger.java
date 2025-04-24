
package br.fastfood.model;

public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Burger bigCheddar() {
        return new Burger("Big Cheddar", 15.00);
    }

    public static Burger baconBurger() {
        return new Burger("Bacon Burger", 17.50);
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
