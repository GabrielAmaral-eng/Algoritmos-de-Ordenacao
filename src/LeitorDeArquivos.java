import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivos {

    //Método responsável por fazer a leitura dos arquivos.
    public static Filme[] carregarFilmes(String caminhoArquivo, int tamanho) throws IOException {
        Filme[] filmes = new Filme[tamanho];
        BufferedReader br = new BufferedReader(new FileReader("data/" + caminhoArquivo));
        String linha;
        int i = 0;
        br.readLine(); // pular cabeçalho
        while ((linha = br.readLine()) != null && i < tamanho) {
            String[] partes = linha.split(",");
            filmes[i] = new Filme(partes[0], Double.parseDouble(partes[1]));
            i++;
        }
        br.close();
        return filmes;
    }
}
