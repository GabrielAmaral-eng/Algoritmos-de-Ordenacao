import java.io.IOException;

public class Dados {

    //Define as Listas de Filmes
    public static Filme[] lista_filmes_1000;
    public static Filme[] lista_filmes_5000;
    public static Filme[] lista_filmes_10000;
    public static Filme[] lista_filmes_25000;
    public static Filme[] lista_filmes_50000;

    public static void carregarVetores() {

        //Carrega os dados para o vetor
        try {
            Dados.lista_filmes_1000 = LeitorDeArquivos.carregarFilmes("Filmes1000.csv", 1000);
            Dados.lista_filmes_5000 = LeitorDeArquivos.carregarFilmes("Filmes5000.csv", 5000);
            Dados.lista_filmes_10000 = LeitorDeArquivos.carregarFilmes("Filmes10000.csv", 10000);
            Dados.lista_filmes_25000 = LeitorDeArquivos.carregarFilmes("Filmes25000.csv", 25000);
            Dados.lista_filmes_50000 = LeitorDeArquivos.carregarFilmes("Filmes50000.csv", 50000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}