public class RodaProjeto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Camisa ErasedProject");
        produto.setPreco(99.99);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());

        produto.aplicarDesconto(15);

        System.out.println("O preço final do produto (após desconto), é de: " + produto.getPreco());
    }
}
