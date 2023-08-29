import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtosSet;

    public CadastroProdutos(){
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProdutos (long codigo, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }
    
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProdutos(1l, "Prosuto 5", 15d, 5);
        cadastroProdutos.adicionarProdutos(2l, "Produto 8", 20d, 10);
        cadastroProdutos.adicionarProdutos(1l, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProdutos(9l, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());

    }
}
