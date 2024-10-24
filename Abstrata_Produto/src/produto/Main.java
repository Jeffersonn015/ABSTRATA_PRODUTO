package produto;

public class Main {
    public static void main(String[] args) {
        // Criando um produto genérico
        Produto produtoGeral = new Produto("Caderno", 10.0, 20.0); // Atualizado para um produto específico
        System.out.println("Produto Geral:");
        produtoGeral.mostrarInformacoes();
        produtoGeral.salvar();
        produtoGeral.atualizar(1); // Atualizando o produto com id 1
        produtoGeral.deletar(1); // Deletando o produto com id 1

        System.out.println();

        // Criando um produto alimentício
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Biscoito", 2.0, 5.0, "2025-12-31", "100g de carboidratos");
        System.out.println("Produto Alimentício:");
        produtoAlimenticio.mostrarInformacoes();
        produtoAlimenticio.salvar();
        produtoAlimenticio.atualizar(2); // Atualizando o produto com id 2
        produtoAlimenticio.deletar(2); // Deletando o produto com id 2

        System.out.println();

        // Criando um produto de vestuário
        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camisa", 30.0, 60.0, "M", "Azul", "Algodão");
        System.out.println("Produto de Vestuário:");
        produtoVestuario.mostrarInformacoes();
        produtoVestuario.salvar();
        produtoVestuario.atualizar(3); // Atualizando o produto com id 3
        produtoVestuario.deletar(3); // Deletando o produto com id 3
    }
}
