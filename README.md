# Collections Framework 

## Intuito do repositório 
O propósito do repositório é apresentar a Collections Framework através de exemplos práticas criados pela DIO (Digital Innovation One ) os mesmos  foram realizados em um curso do bootcamp Java oferecido pela empresa. 

## Como foi dividido o conteúdo
O conteúdo foi divido em três partes, com exemplos dos conceitos mais utilizados no mercado, sendo eles: o Map, Set e List

## Subdivisão dos exemplos
### List
No arquivo List contem solução de quatro exercícios práticos, onde tivemos de seguir alguns passos para a solução. Sendo eles:

 1 - Lista de Tarefas

Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adicionada uma nova tarefa à lista com a descrição descrita.
- `removerTarefa(String descricao)`: Remova uma tarefa da lista com base em sua descrição.
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
- `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas da lista.

-> A solução deste desafio está no arquivo [Ex_Lista_De_Tarefas](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/List/Ex_Lista_De_Tarefas) 

2 - Carrinho de Compras:

Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `alcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

-> A solução deste desafio está no arquivo [CarrinhoDeCompras](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/List/Ex_Carrinho_De_Compras) 

 3 - Soma de Números

Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista de números.
- `calcularSoma()`: Calcula a soma de todos os números na lista e retorna o resultado.
- `encontrarMaiorNumero()`: Encontra o maior número na lista e retorna o valor.
- `encontrarMenorNumero()`: Encontra o menor número na lista e retorna o valor.
- `exibirNumeros()`: Retorna uma lista contendo todos os números presentes na lista.

-> A solução deste desafio está no arquivo [Ex_Soma_Numeros](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/List/Ex_Soma_Numeros) 

4 - Ordenação de Pessoas

Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

- `adicionarPessoa(String nome, int idade, double altura)`: Adiciona uma pessoa à lista.
- `ordenarPorIdade()`: Ordena as pessoas da lista por idade usando a interface Comparable.
- `ordenarPorAltura()`: Ordena as pessoas da lista por altura usando um Comparator personalizado.

-> A solução deste desafio está no arquivo [Ex_Ordenacao_Pessoa](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/List/Ex_Ordenacao_Pessoa) 

### Map

No arquivo Map contem solução de três exercícios práticos, onde tivemos de seguir alguns passos para a solução. Sendo eles:

1 - Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- `adicionarContato(String nome, Integer telefone)`: Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato(String nome)`: Remove um contato da agenda, dado o nome do contato.
- `exibirContatos()`: Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- `pesquisarPorNome(String nome)`: Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
</p>

-> A solução deste desafio está no arquivo [Ex_Agenda_Contatos](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Map/Ex_Agenda_Contatos)

2 - Estoque de Produtos com Preço

<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
</p>

-> A solução deste desafio está no arquivo [Ex_Agenda_Contatos](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Map/Ex_Agenda_Contatos)

3 - Agenda de Eventos

<p>
Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.
</p>

-> A solução deste desafio está no arquivo [Ex_Estoque_Produtos](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Map/Ex_Estoque_Produtos)

### Set

No arquivo Set contem solução de cinco exercícios práticos, onde tivemos de seguir alguns passos para a solução. Sendo eles:

1 - Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(String codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
</p>

-> A solução deste desafio está no arquivo [Ex_Pessoas_COD_Convite](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Set/Ex_Pessoas_COD_Convite)

2 - Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

-> A solução deste desafio está no arquivo [Ex_Palavras_Unicas](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Set/Ex_Palavras_Unicas)

3 - Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

-> A solução deste desafio está no arquivo [Ex_Lista_Contatos](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Set/Ex_Lista_Contatos)

4 - Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>

-> A solução deste desafio está no arquivo  [Ex_Lista_De_Tarefas](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Set/Ex_Lista_Tarefas)

5 - Cadastro de Produtos

<p>
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.
</p>

-> A solução deste desafio está no arquivo  [Cadastro_De_Produtos](https://github.com/Gabriel-0001/Collections_Framework_Java/tree/main/Set/Cadastro_De_Produtos)
