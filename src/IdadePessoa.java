public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade(int idadePessoa){
        if(this.getIdade() < 18){
            System.out.println("Você é menor de idade!");
        }else{
            System.out.println("Você é maior de idade!");
        }
    }
}
