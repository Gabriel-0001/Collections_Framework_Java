package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	//atributo
	private String nome;
	private int codigoConvidado;
	
	public Convidado(String nome, int codigoConvidado) {
		this.nome = nome;
		this.codigoConvidado = codigoConvidado;
	}
	
	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvidado;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvidado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvidado == other.codigoConvidado;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome 
				+ ", codigoConvidado=" + codigoConvidado 
				+ "]";
	}
	
	

}
