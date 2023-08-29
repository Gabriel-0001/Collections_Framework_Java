package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;


public class SomandoNumeros {
	private List<Integer> numerosLista;

	public SomandoNumeros() {
		this.numerosLista = new ArrayList<>();
	}
	public void adcionarNumero( int numero) {
		this.numerosLista.add(numero);
	}
	public int calucularSoma() {
		int soma = 0;
		for (Integer numero: numerosLista ) {
			soma += numero;
		}
		return soma;
	}
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if (! numerosLista.isEmpty()) {
			for (Integer numero: numerosLista) {
				if(numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}return maiorNumero;
		} else {
		      throw new RuntimeException("A lista está vazia!");
	    }
		
	}
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if (! numerosLista.isEmpty()) {
			for (Integer numero: numerosLista) {
				if(numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		}else {
		      throw new RuntimeException("A lista está vazia!");
		    }
	}
	public void exibirNumeros() {
		if (! numerosLista.isEmpty()) {
			System.out.println(this.numerosLista);
		} else {
		      System.out.println("A lista está vazia!");
	    }
		
	}
	public static void main(String[] args) {
	    SomaNumeros somaNumeros = new SomaNumeros();

	    somaNumeros.adicionarNumero(500);
	    somaNumeros.adicionarNumero(25);
	    somaNumeros.adicionarNumero(0);
	    somaNumeros.adicionarNumero(-200);
	    somaNumeros.adicionarNumero(50);
	    somaNumeros.exibirNumeros();

	    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

	    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

	    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
	  }

}
