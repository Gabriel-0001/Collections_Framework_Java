package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDasCompras {
	private List <Item> carrinhoDeCompras;
	
	public CarrinhoDasCompras() {
		this.carrinhoDeCompras = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoDeCompras.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String name) {
		List <Item> itemParaRemover = new ArrayList<>();
		if (! carrinhoDeCompras.isEmpty()) {
			for (Item i: carrinhoDeCompras) {
				if (i.getNome().equalsIgnoreCase(name)) {
					itemParaRemover.add(i);
				}
			}
			carrinhoDeCompras.removeAll(itemParaRemover);
		} else {
			System.out.println("A lsita está vazia");
		}
	}
	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!carrinhoDeCompras.isEmpty()) {
			for (Item i: carrinhoDeCompras) {
				double valorItem = i.getPreco() * i.getQuant();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	public void exibirItens () {
		if (! carrinhoDeCompras.isEmpty()) {
		System.out.println(this.carrinhoDeCompras);
		} else {
			System.out.println("A lista está vazia");
		}
	}
	@Override
	public String toString() {
		return "CarrinhoDasCompras [itens =" + carrinhoDeCompras + "]";
	}
	public static void main(String[] args) {
	    CarrinhoDasCompras carrinhoDasCompras = new CarrinhoDasCompras();

	    carrinhoDasCompras.adicionarItem("Lápis", 2d, 3);
	    carrinhoDasCompras.adicionarItem("Lápis", 2d, 3);
	    carrinhoDasCompras.adicionarItem("Caderno", 35d, 1);
	    carrinhoDasCompras.adicionarItem("Borracha", 2d, 2);

	    carrinhoDasCompras.exibirItens();

	    carrinhoDasCompras.removerItem("Lápis");
	    carrinhoDasCompras.exibirItens();

	    System.out.println("O valor total da compra é = " + carrinhoDasCompras.calcularValorTotal());
	  }
	
}
