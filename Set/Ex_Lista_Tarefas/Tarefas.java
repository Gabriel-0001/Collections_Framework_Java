package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefas {
	private String descricao;
	private boolean concluida;
	
	public Tarefas(String tarefa, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}
	

	public void setDescricao(String tarefa) {
		this.descricao = descricao;
	}
	

	public boolean isConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
	    this.concluida = concluida;
	  }


	@Override
	public String toString() {
		return "Tarefas { tarefa = " + descricao + " }";
	}
	
	

}
