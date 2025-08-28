class TempoOrdenecao {
    double tempoMs;
    String algoritmo;
    int tamanhoLista;

    public TempoOrdenecao(double tempoMs, String algoritmo, int tamanhoLista) {
        this.tempoMs = tempoMs;
        this.algoritmo = algoritmo;
        this.tamanhoLista = tamanhoLista;
    }

    @Override
    public String toString() {
        return String.format("Algoritmo: %-15s | Tamanho: %5d | Tempo: %.3f ms", algoritmo, tamanhoLista, tempoMs);
    }

}