public class Filme {
    //Definicao das variaveis da classe
    private String titulo;
    private double avaliacao;

    //Construtoe de Filme
    public Filme(String titulo, double avaliacao) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }

    //Setters e Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
