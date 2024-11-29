public class MenuProjeto {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(16);
        pessoa.setNome("Pedroso");

        System.out.println("Seu nome é: " + pessoa.getNome());
        System.out.println("Sua idade é: " + pessoa.getIdade());

        pessoa.verificarIdade(pessoa.getIdade());
    }
}
