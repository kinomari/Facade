
package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(
                    Burger.bigCheddar(),
                    Bebida.cocaCola(),
                    Sobremesa.sorvete()
                );
                break;
            case 2:
                combo = new Combo(
                    Burger.baconBurger(),
                    Bebida.sucoLaranja(),
                    Sobremesa.brownie()
                );
                break;
            default:
                System.out.println("Combo inválido. Selecionando o Combo 1 por padrão.");
                criarCombo(1);
        }
    }

    public void exibirItens() {
        if (combo != null) {
            System.out.println("Itens do combo:");
            System.out.println("- " + combo.getBurger());
            System.out.println("- " + combo.getBebida());
            System.out.println("- " + combo.getSobremesa());
        }
    }

    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getBurger().getPreco()
                 + combo.getBebida().getPreco()
                 + combo.getSobremesa().getPreco();
        }
        return 0;
    }
}
