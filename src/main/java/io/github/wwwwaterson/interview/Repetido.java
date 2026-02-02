package io.github.wwwwaterson.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Repetido {

    /**
     * Remove elementos repetidos usando HashSet
     * HashSet não permite elementos duplicados, então ao adicionar elementos
     * do array original, duplicatas são automaticamente ignoradas.
     * 
     * @param array Array original com possíveis duplicatas
     * @return ArrayList sem elementos repetidos
     */
    public static ArrayList<Integer> removerRepetidosComHashSet(Integer[] array) {
        // HashSet remove duplicatas automaticamente
        HashSet<Integer> conjunto = new HashSet<>(Arrays.asList(array));

        // Converte o HashSet de volta para ArrayList
        return new ArrayList<>(conjunto);
    }

    /**
     * Remove elementos repetidos usando apenas ArrayList
     * Percorre o array original e adiciona apenas elementos que ainda não
     * estão presentes no ArrayList resultado.
     * 
     * @param array Array original com possíveis duplicatas
     * @return ArrayList sem elementos repetidos
     */
    public static ArrayList<Integer> removerRepetidosComArrayList(Integer[] array) {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (Integer elemento : array) {
            // Adiciona apenas se o elemento ainda não existe no resultado
            if (!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }

    /**
     * Método genérico que funciona com qualquer tipo de objeto
     * 
     * @param <T>   Tipo genérico
     * @param array Array de qualquer tipo
     * @return ArrayList sem elementos repetidos
     */
    public static <T> ArrayList<T> removerRepetidosGenerico(T[] array) {
        HashSet<T> conjunto = new HashSet<>(Arrays.asList(array));
        return new ArrayList<>(conjunto);
    }

    public static void main(String[] args) {
        // Exemplo 1: Array com números inteiros repetidos
        Integer[] numeros = { 1, 2, 3, 2, 4, 1, 5, 3, 6, 4 };

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println();

        // Usando HashSet
        ArrayList<Integer> semRepetidosHashSet = removerRepetidosComHashSet(numeros);
        System.out.println("Usando HashSet: " + semRepetidosHashSet);

        // Usando ArrayList
        ArrayList<Integer> semRepetidosArrayList = removerRepetidosComArrayList(numeros);
        System.out.println("Usando ArrayList: " + semRepetidosArrayList);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Exemplo 2: Array com strings repetidas
        String[] palavras = { "java", "python", "java", "c++", "python", "javascript" };

        System.out.println("Array de strings: " + Arrays.toString(palavras));
        ArrayList<String> palavrasSemRepeticao = removerRepetidosGenerico(palavras);
        System.out.println("Sem repetição: " + palavrasSemRepeticao);

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Exemplo 3: Comparação de performance
        Integer[] arrayGrande = new Integer[1000];
        for (int i = 0; i < arrayGrande.length; i++) {
            arrayGrande[i] = i % 100; // Cria muitas duplicatas
        }

        long inicio = System.nanoTime();
        ArrayList<Integer> resultadoHashSet = removerRepetidosComHashSet(arrayGrande);
        long tempoHashSet = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        ArrayList<Integer> resultadoArrayList = removerRepetidosComArrayList(arrayGrande);
        long tempoArrayList = System.nanoTime() - inicio;

        System.out.println("Performance (array com 1000 elementos):");
        System.out.println("HashSet: " + tempoHashSet + " ns");
        System.out.println("ArrayList: " + tempoArrayList + " ns");
        System.out.println("Elementos únicos encontrados: " + resultadoHashSet.size());
    }

}
