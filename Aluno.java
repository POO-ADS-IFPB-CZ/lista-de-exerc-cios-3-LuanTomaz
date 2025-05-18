public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;
    private int indiceNota;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
        this.indiceNota = 0;
    }

    public void cadastrarNota(double nota) {
        if(indiceNota < 4) {
            notas[indiceNota++] = nota;
        }else {
            System.out.println("Máximo de 4 notas atingido");
        }
    }

    public double calculaMedia() {
        double soma = 0;
        for(int i = 0; i < indiceNota; i++) {
            soma += notas[i];
        }
        return indiceNota > 0 ? soma / indiceNota : 0.0;
    }

    public boolean estaAprovado() {
        return calculaMedia() >=7.0;
    }

    public String getNome() {
        return nome;
    }

}
