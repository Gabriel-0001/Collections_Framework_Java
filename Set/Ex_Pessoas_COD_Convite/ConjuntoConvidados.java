package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	//atributo
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidadoNoSet(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c: convidadoSet) {
			if(c.getCodigoConvite()== codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidado() {
		System.out.println(convidadoSet);
	}
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do Set de Convidados");
		
		conjuntoConvidados.adicionarConvidadoNoSet("Convidado 10", 1234);
		conjuntoConvidados.adicionarConvidadoNoSet("Convidado 30", 1235);
		conjuntoConvidados.adicionarConvidadoNoSet("Convidado 48", 1235);
		conjuntoConvidados.adicionarConvidadoNoSet("Convidados 76", 1236);
		
		System.out.println("Existem" + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidados.removerConvidadoPorCodigoDoConvite(1234);
		System.out.println("Existem" + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidados.exibirConvidado();
	}
	
	
}
