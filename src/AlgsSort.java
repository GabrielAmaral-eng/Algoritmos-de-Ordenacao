public class AlgsSort {

    //Calculo do Tempo do Merge Sort
    public static long MergeSort(Filme[] filmes, int inicio, int fim){
        //Inicia o Tempo de Ordenacao
        long tempoInicial = System.nanoTime();
        MergeSort_(filmes, inicio, fim);
        //Finaliza e retorna o Tempo de Ordenacao
        long tempFinal = System.nanoTime();
        long duracao = tempFinal-tempoInicial;
        System.out.println(filmes.length+": OK");
        return duracao;
    }

    //Ordenacao pelo Merge Sort
    private static void MergeSort_(Filme[] filmes, int inicio, int fim){
        //Percorre o vetor recursivamente
        if (inicio < fim){
            int meio = (inicio+fim)/2;
            //Divide o vetor em vetores menores
            MergeSort_(filmes, inicio, meio);
            MergeSort_(filmes, meio+1, fim);
            Intercala(filmes, inicio, meio, fim);

        }
    }

    //Metodo utilizado pelo Merge Sort para ordenar os vetores menores recebidos
    private static void Intercala(Filme[] filmes,int inicio, int meio, int fim){
        //Cria um vetor secundario
        Filme[] b = new Filme[filmes.length];
        //Preenche o vetor secundario
        for (int i=inicio; i<=meio; i++){
            b[i] = filmes[i];
        }
        //Ordena o Vetor
        for (int j=meio+1; j<=fim; j++){
            b[fim+meio+1-j] = filmes[j];
        }
        int i = inicio;
        int j = fim;
        for (int k=inicio; k<=fim; k++){
            if (b[i].getAvaliacao() <= b[j].getAvaliacao()){
                filmes[k] = b[i];
                i += 1;
            }
            else{
                filmes[k] = b[j];
                j -= 1;
            }
        }
    }

    //Metodo de ordenacao pelo Insertion Sort
    public static long insertionSort(Filme[] filmes){
        //Inicia contador de Tempo
        long tempoInicial = System.nanoTime();
        int n = filmes.length;
        //Percorre o vetor
        for (int i=1; i<=n-1;i++){
            int j=i;
            //Passa trocando a posicao do vetor
            while(j>0 && filmes[j-1].getAvaliacao() > filmes[j].getAvaliacao()){
                Filme temp = filmes[j];
                filmes[j] = filmes[j-1];
                filmes[j-1] = temp;
                j--;
            }
        }
        //Finaliza e retorna o tempo da ordenacao
        long tempFinal = System.nanoTime();
        long duracao = tempFinal-tempoInicial;
        System.out.println(filmes.length+": OK");
        return duracao;
    }


    public static long bubbleSort(Filme[] filmes){
        //Inicia o Tempo de Ordenacao
        long tempoInicial = System.nanoTime();
        int n = filmes.length;
        //Percorre o vetor
        for (int i=0; i<=n-1; i++){
            //Compara pares de posicao para as trocas
            for (int j = 1; j <= n-1; j++){
                if (filmes[j-1].getAvaliacao() > filmes[j].getAvaliacao()){
                    Filme temp = filmes[j];
                    filmes[j] = filmes[j-1];
                    filmes[j-1] = temp;
                }
            }
        }
        //Finaliza e retorna o Tempo de Ordenacao
        long tempFinal = System.nanoTime();
        long duracao = tempFinal-tempoInicial;
        System.out.println(filmes.length+": OK");
        return duracao;
    }

    public static long selectionSort (Filme[] filmes){
        //Inicia o Tempo de Ordenacao
        long tempoInicial = System.nanoTime();
        //Percorre o Vetor
        for (int i=0; i<= filmes.length-1; i++){
            int min = i;
            //Procura o menor valor
            for (int j= i+1; j <= filmes.length-1; j++){
                if (filmes[j].getAvaliacao() < filmes[min].getAvaliacao()){
                    min = j;
                }
            }
            //Adiciona o menor valor no comeco
            Filme temp = filmes[i];
            filmes[i] = filmes[min];
            filmes[min] = temp;
        }
        //Finaliza e retorna o Tempo de Ordenacao
        long tempFinal = System.nanoTime();
        long duracao = tempFinal-tempoInicial;
        System.out.println(filmes.length+": OK");
        return duracao;
    }

    //Calculo do tempo do Quick Sort
    public static long QuickSort(Filme[] filmes, int inicio, int fim){
        //Inicia o Tempo de Ordenacao
        long tempoInicial = System.nanoTime();
        QuickSort_(filmes,inicio,fim);
        //Finaliza e retorna o Tempo de Ordenacao
        long tempFinal = System.nanoTime();
        long duracao = tempFinal-tempoInicial;
        System.out.println(filmes.length+": OK");
        return duracao;
    }

    private static void QuickSort_(Filme[] filmes, int inicio, int fim){
        if (inicio < fim) {
            //Escolhe o pivo para particionar o vetor
            int meio = particionar(filmes, inicio, fim);
            //Divide o vetor em vetores menores
            QuickSort_(filmes, inicio, meio - 1);
            QuickSort_(filmes, meio + 1, fim);
        }
    }

    private static int particionar(Filme[] filmes, int inicio, int fim){
        int i = inicio+1;
        int j = fim;
        //Ordena os vetores
        while(i <= j){
            if(filmes[i].getAvaliacao() < filmes[inicio].getAvaliacao()){
                i++;
            }
            else{
                if (filmes[j].getAvaliacao() > filmes[inicio].getAvaliacao()){
                    j--;
                }
                else{
                    Filme aux = filmes[i];
                    filmes[i] = filmes[j];
                    filmes[j] = aux;
                    i++;
                    j--;
                }
            }
        }
        Filme aux = filmes[inicio];
        filmes[inicio] = filmes[j];
        filmes[j] = aux;
        return j;
    }

    public static long HeapSort(Filme[] filmes, int tamanho){
        //Inicia o Tempo de Ordenacao
        long tempoInicial = System.nanoTime();
        //Cria o Heap
        CriarHeap(filmes, tamanho);
        int fim = tamanho - 1;
        //Ordena o Heap
        while(fim > 0){
            swap(filmes, 0, fim);
            fim -= 1;
            ArrumaHeap(filmes, 0, fim);
        }
        //Finaliza e retorna o Tempo de Ordenacao
        long tempFinal = System.nanoTime();
        long duracao = tempFinal-tempoInicial;
        System.out.println(filmes.length+": OK");   
        return duracao;
    }

    private static void CriarHeap (Filme[] filmes, int tamanho){
        //Transforma o vetor em Heap
        int inicio = (tamanho-1)/2;
        while(inicio >= 0){
            ArrumaHeap(filmes, inicio, tamanho-1);
            inicio = inicio-1;
        }
    }
    private static void ArrumaHeap(Filme[] filmes, int inicio, int fim){
        int raiz = inicio;
        //Organiza a Heap
        while(raiz*2 + 1 <= fim){
            int filho = raiz *2 + 1;
            int trocar = raiz;
            if (filmes[trocar].getAvaliacao() < filmes[filho].getAvaliacao()){
                trocar = filho;
            }
            if (filho+1 <= fim && filmes[trocar].getAvaliacao() < filmes[filho+1].getAvaliacao()){
                trocar = filho + 1;
            }
            if(trocar == raiz){
                return;
            }
            else {
                swap(filmes, raiz, trocar);
                raiz = trocar;
            }
        }
    }

    //Metodo de troca de posicoes no Vetor
    private static void swap(Filme[] filmes, int i, int j){
        Filme temp = filmes[j];
        filmes[j] = filmes[i];
        filmes[i] = temp;
    }

}
