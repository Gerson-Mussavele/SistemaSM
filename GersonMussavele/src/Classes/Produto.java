package Classes;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String referencia;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String referencia, String nome, double preco, int quantidade) {
        this.referencia = referencia;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para criar um novo produto
    public static void criarProduto(List<Produto> listaProdutos, String referencia, String nome, double preco, int quantidade) {
        Produto novoProduto = new Produto(referencia, nome, preco, quantidade);
        listaProdutos.add(novoProduto);
    }

    // Método para ler um produto pelo nome
    public static Produto lerProdutoPorNome(List<Produto> listaProdutos, String nome) {
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    // Método para atualizar os dados de um produto
    public static void atualizarProduto(Produto produto, String novoNome, double novoPreco, int novaQuantidade) {
        produto.setNome(novoNome);
        produto.setPreco(novoPreco);
        produto.setQuantidade(novaQuantidade);
    }

    // Método para excluir um produto
    public static void excluirProduto(List<Produto> listaProdutos, Produto produto) {
        listaProdutos.remove(produto);
    }

    // Método para gerar um relatório dos produtos
    public static void gerarRelatorio(List<Produto> listaProdutos) {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println("Referência: " + produto.getReferencia());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("-------------------------");
        }
    }
}