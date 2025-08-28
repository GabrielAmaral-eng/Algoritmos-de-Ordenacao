public class Main {

    public static void main(String[] args) {

        //Faz a leitura dos arquivos passando para os vetores.
        Dados.carregarVetores();

        String[] vetor = {"Insertion" ,"Selection", "Bubble", "Merge", "Quick", "Heap"};

        String aux = "";
        TempoOrdenecao[] tempoInsertion = new TempoOrdenecao[5];
        TempoOrdenecao[] tempoSelection = new TempoOrdenecao[5];
        TempoOrdenecao[] tempoBubble = new TempoOrdenecao[5];
        TempoOrdenecao[] tempoMerge = new TempoOrdenecao[5];
        TempoOrdenecao[] tempoQuick = new TempoOrdenecao[5];
        TempoOrdenecao[] tempoHeap = new TempoOrdenecao[5];

        for(int i=0; i< vetor.length; i++){
            Filme [] dadosTemp_1000 = Dados.lista_filmes_1000.clone();
            Filme [] dadosTemp_5000 = Dados.lista_filmes_5000.clone();
            Filme [] dadosTemp_10000 = Dados.lista_filmes_10000.clone();
            Filme [] dadosTemp_25000 = Dados.lista_filmes_25000.clone();
            Filme [] dadosTemp_50000 = Dados.lista_filmes_50000.clone();



            switch (vetor[i]) {
                case "Insertion" -> {
                    System.out.println("Executando o Insertion Sort...");
                    tempoInsertion[0] = new TempoOrdenecao(AlgsSort.insertionSort(dadosTemp_1000) / 1000000.0, "Insertion Sort", 1000);
                    tempoInsertion[1] = new TempoOrdenecao(AlgsSort.insertionSort(dadosTemp_5000) / 1000000.0, "Insertion Sort", 5000);
                    tempoInsertion[2] = new TempoOrdenecao(AlgsSort.insertionSort(dadosTemp_10000) / 1000000.0, "Insertion Sort", 10000);
                    tempoInsertion[3] = new TempoOrdenecao(AlgsSort.insertionSort(dadosTemp_25000) / 1000000.0, "Insertion Sort", 25000);
                    tempoInsertion[4] = new TempoOrdenecao(AlgsSort.insertionSort(dadosTemp_50000) / 1000000.0, "Insertion Sort", 50000);

                }
                case "Selection" -> {
                    System.out.println("\nExecutando o Selection Sort...");
                    tempoSelection[0] = new TempoOrdenecao(AlgsSort.selectionSort(dadosTemp_1000) / 1000000.0, "Selection Sort", 1000);
                    tempoSelection[1] = new TempoOrdenecao(AlgsSort.selectionSort(dadosTemp_5000) / 1000000.0, "Selection Sort", 5000);
                    tempoSelection[2] = new TempoOrdenecao(AlgsSort.selectionSort(dadosTemp_10000) / 1000000.0, "Selection Sort", 10000);
                    tempoSelection[3] = new TempoOrdenecao(AlgsSort.selectionSort(dadosTemp_25000) / 1000000.0, "Selection Sort", 25000);
                    tempoSelection[4] = new TempoOrdenecao(AlgsSort.selectionSort(dadosTemp_50000) / 1000000.0, "Selection Sort", 50000);

                }
                case "Bubble" -> {
                    System.out.println("\nExecutando o Bubble Sort...");
                    tempoBubble[0] = new TempoOrdenecao(AlgsSort.bubbleSort(dadosTemp_1000) / 1000000.0, "Bubble Sort", 1000);
                    tempoBubble[1] = new TempoOrdenecao(AlgsSort.bubbleSort(dadosTemp_5000) / 1000000.0, "Bubble Sort", 5000);
                    tempoBubble[2] = new TempoOrdenecao(AlgsSort.bubbleSort(dadosTemp_10000) / 1000000.0, "Bubble Sort", 10000);
                    tempoBubble[3] = new TempoOrdenecao(AlgsSort.bubbleSort(dadosTemp_25000) / 1000000.0, "Bubble Sort", 25000);
                    tempoBubble[4] = new TempoOrdenecao(AlgsSort.bubbleSort(dadosTemp_50000) / 1000000.0, "Bubble Sort", 50000);

                }
                case "Merge" -> {
                    System.out.println("\nExecutando o Merge Sort...");
                    tempoMerge[0] = new TempoOrdenecao(AlgsSort.MergeSort(dadosTemp_1000, 0, dadosTemp_1000.length - 1) / 1000000.0, "Merge Sort", 1000);
                    tempoMerge[1] = new TempoOrdenecao(AlgsSort.MergeSort(dadosTemp_5000, 0, dadosTemp_5000.length - 1) / 1000000.0, "Merge Sort", 5000);
                    tempoMerge[2] = new TempoOrdenecao(AlgsSort.MergeSort(dadosTemp_10000, 0, dadosTemp_10000.length - 1) / 1000000.0, "Merge Sort", 10000);
                    tempoMerge[3] = new TempoOrdenecao(AlgsSort.MergeSort(dadosTemp_25000, 0, dadosTemp_25000.length - 1) / 1000000.0, "Merge Sort", 25000);
                    tempoMerge[4] = new TempoOrdenecao(AlgsSort.MergeSort(dadosTemp_50000, 0, dadosTemp_50000.length - 1) / 1000000.0, "Merge Sort", 50000);

                }
                case "Quick" -> {
                    System.out.println("\nExecutando o Quick Sort...");
                    tempoQuick[0] = new TempoOrdenecao(AlgsSort.QuickSort(dadosTemp_1000, 0, dadosTemp_1000.length - 1) / 1000000.0, "Quick Sort", 1000);
                    tempoQuick[1] = new TempoOrdenecao(AlgsSort.QuickSort(dadosTemp_5000, 0, dadosTemp_5000.length - 1) / 1000000.0, "Quick Sort", 5000);
                    tempoQuick[2] = new TempoOrdenecao(AlgsSort.QuickSort(dadosTemp_10000, 0, dadosTemp_10000.length - 1) / 1000000.0, "Quick Sort", 10000);
                    tempoQuick[3] = new TempoOrdenecao(AlgsSort.QuickSort(dadosTemp_25000, 0, dadosTemp_25000.length - 1) / 1000000.0, "Quick Sort", 25000);
                    tempoQuick[4] = new TempoOrdenecao(AlgsSort.QuickSort(dadosTemp_50000, 0, dadosTemp_50000.length - 1) / 1000000.0, "Quick Sort", 50000);

                }
                case "Heap" -> {
                    System.out.println("\nExecutando o Heap Sort");
                    tempoHeap[0] = new TempoOrdenecao(AlgsSort.HeapSort(dadosTemp_1000, dadosTemp_1000.length) / 1000000.0, "Heap Sort", 1000);
                    tempoHeap[1] = new TempoOrdenecao(AlgsSort.HeapSort(dadosTemp_5000, dadosTemp_5000.length) / 1000000.0, "Heap Sort", 5000);
                    tempoHeap[2] = new TempoOrdenecao(AlgsSort.HeapSort(dadosTemp_10000, dadosTemp_10000.length) / 1000000.0, "Heap Sort", 10000);
                    tempoHeap[3] = new TempoOrdenecao(AlgsSort.HeapSort(dadosTemp_25000, dadosTemp_25000.length) / 1000000.0, "Heap Sort", 25000);
                    tempoHeap[4] = new TempoOrdenecao(AlgsSort.HeapSort(dadosTemp_50000, dadosTemp_50000.length) / 1000000.0, "Heap Sort", 50000);

                }
            }
        }
        System.out.println(aux);


        //Imprimindo o tempo do Selection Sort
        System.out.println("\nTempos Selection Sort: ");
        for (TempoOrdenecao x : tempoSelection){
            System.out.println(x.toString());
        }

        //Imprimindo o tempo do Insertion Sort
        System.out.println("\nTempos Insertion Sort: ");
        for (TempoOrdenecao x : tempoInsertion){
            System.out.println(x.toString());
        }

        //Imprimindo o tempo do Bubble Sort
        System.out.println("\nTempos Bubble Sort: ");
        for (TempoOrdenecao x : tempoBubble){
            System.out.println(x.toString());
        }

        //Imprimindo o tempo do Merge Sort
        System.out.println("\nTempos Merge Sort: ");
        for (TempoOrdenecao x : tempoMerge){
            System.out.println(x.toString());
        }

        //Imprimindo o tempo do Quick Sort
        System.out.println("\nTempos Quick Sort: ");
        for (TempoOrdenecao x : tempoQuick){
            System.out.println(x.toString());
        }

        //Imprimindo o tempo do Heap Sort
        System.out.println("\nTempos Heap Sort: ");
        for (TempoOrdenecao x : tempoHeap){
            System.out.println(x.toString());
        }
    }
}
