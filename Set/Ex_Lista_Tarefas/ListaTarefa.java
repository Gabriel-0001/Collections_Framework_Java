package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	private Set <Tarefas> listaTarefasSet;

	public ListaTarefa() {
		this.listaTarefasSet = new HashSet<>();
	}
	public void adicionarTarefa (Tarefas tarefas){
		listaTarefasSet.add(tarefas);
	}
	public void removerTarefa (String descricao) {
		Tarefas tarefaParaRemover = null;
		if(!listaTarefasSet.isEmpty()) {
			for (Tarefas t: listaTarefasSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = t;
					break;
				}
			}
			listaTarefasSet.remove(tarefaParaRemover);
		}
		else {
			System.out.println("O conjunto esta vazio");
		}
		if (tarefaParaRemover == null) {
			System.out.println("Tarefa não encontrada");
		}
	}
	
	public void exibirTarefas() {
	    if(!listaTarefasSet.isEmpty()) {
	      System.out.println(listaTarefasSet);
	    } else {
	      System.out.println("Tarefa não encontrada!");
	    }
	  }

	  public int contarTarefas() {
	    return listaTarefasSet.size();
	  }

	  public Set<Tarefas> obterTarefasConcluidas() {
	    Set<Tarefas> tarefasConcluidas = new HashSet<>();
	    for (Tarefas t : listaTarefasSet) {
	      if (t.isConcluida()) {
	        tarefasConcluidas.add(t);
	      }
	    }
	    return tarefasConcluidas;
	  }

	  public Set<Tarefas> obterTarefasPendentes() {
	    Set<Tarefas> tarefasNaoConcluidas = new HashSet<>();
	    for (Tarefas t : listaTarefasSet) {
	      if (!t.isConcluida()) {
	        tarefasNaoConcluidas.add(t);
	      }
	    }
	    return tarefasNaoConcluidas;
	  }

	  public void marcarTarefaConcluida(String descricao) {
	    for (Tarefas t : listaTarefasSet) {
	      if (t.getDescricao().equalsIgnoreCase(descricao)) {
	        t.setConcluida(true);
	      }
	    }
	  }

	  public void marcarTarefaPendente(String descricao) {
	    Tarefas tarefaParaMarcarComoPendente = null;
	    for (Tarefas t : listaTarefasSet) {
	      if (t.getDescricao().equalsIgnoreCase(descricao)) {
	        tarefaParaMarcarComoPendente = t;
	        break;
	      }
	    }

	    if (tarefaParaMarcarComoPendente != null) {
	      tarefaParaMarcarComoPendente.setConcluida(true);
	      System.out.println("Tarefa marcada como pendente: " + tarefaParaMarcarComoPendente.getDescricao());
	    } else {
	      System.out.println("Tarefa não encontrada na lista.");
	    }
	  }

	  public void limparListaTarefas() {
	    if(listaTarefasSet.isEmpty()) {
	      System.out.println("A lista já está vazia!");
	    } else {
	      listaTarefasSet.clear();
	    }
	  }

	  public static void main(String[] args) {
	    ListaTarefa listaTarefa = new ListaTarefa();

	    listaTarefa.adicionarTarefa(new Tarefas("Tarefa 1", false));
	    listaTarefa.adicionarTarefa(new Tarefas("Tarefa 2", false));
	    listaTarefa.adicionarTarefa(new Tarefas("Tarefa 3", false));
	    listaTarefa.adicionarTarefa(new Tarefas("Tarefa 4", false));
	    listaTarefa.exibirTarefas();

	    listaTarefa.removerTarefa("Tarefa 55");
	    listaTarefa.exibirTarefas();

	    System.out.println("Existem " + listaTarefa.contarTarefas() + " na lista de tarefas.");

	    System.out.println(listaTarefa.obterTarefasConcluidas());

	    System.out.println(listaTarefa.obterTarefasPendentes());

	    listaTarefa.marcarTarefaConcluida("Tarefa 2");
	    listaTarefa.marcarTarefaConcluida("Tarefa 1");
	    listaTarefa.exibirTarefas();
	    listaTarefa.limparListaTarefas();
	    listaTarefa.exibirTarefas();
	  }
	
	

}
