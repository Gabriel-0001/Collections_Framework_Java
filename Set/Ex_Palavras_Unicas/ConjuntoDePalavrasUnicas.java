package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoDePalavrasUnicas {
	//atributo
	private Set <String> conjuntoPalavrasSet;
	
	public ConjuntoDePalavrasUnicas() {
		this.conjuntoPalavrasSet = new HashSet<>();
	}
	
	public void adcionarPalvras(String palavra) {
		conjuntoPalavrasSet.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if (!conjuntoPalavrasSet.isEmpty()) {
			conjuntoPalavrasSet.remove(palavra);
		}
		else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		return conjuntoPalavrasSet.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
	    if(!conjuntoPalavrasSet.isEmpty()) {
	      System.out.println(conjuntoPalavrasSet);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	}
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
      }

}
