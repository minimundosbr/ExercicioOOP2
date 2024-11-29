public class Aluno {
    private String nome;
    private double nota;
    private int qtdNotas;


    public void setQtdNotas(int qtdNotas) {
        this.qtdNotas = qtdNotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public int getQtdNotas() {
        return qtdNotas;
    }

    public void insereNotas(double notas){
        nota += notas;
        qtdNotas++;
    }

    public void calculaMedia(){
        double calculaNotas = nota/qtdNotas;
        System.out.println("Sua média é de: " + calculaNotas);
    }
}
