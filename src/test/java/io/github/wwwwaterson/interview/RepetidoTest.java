package io.github.wwwwaterson.interview;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class RepetidoTest {

    @Test
    public void testRemoveRepetidosComHashSet() {
        Integer[] array = { 1, 2, 3, 2, 4, 1, 5, 3, 6, 4 };
        ArrayList<Integer> resultado = Repetido.removerRepetidosComHashSet(array);
        assertTrue(resultado.size() == 6);
        assertTrue(resultado.contains(1));
        assertTrue(resultado.contains(2));
        assertTrue(resultado.contains(3));
        assertTrue(resultado.contains(4));
        assertTrue(resultado.contains(5));
        assertTrue(resultado.contains(6));
    }

    @Test
    public void testRemoveRepetidosComArrayList() {
        Integer[] array = { 1, 2, 3, 2, 4, 1, 5, 3, 6, 4 };
        ArrayList<Integer> resultado = Repetido.removerRepetidosComArrayList(array);
        assertTrue(resultado.size() == 6);
        assertTrue(resultado.contains(1));
        assertTrue(resultado.contains(2));
        assertTrue(resultado.contains(3));
        assertTrue(resultado.contains(4));
        assertTrue(resultado.contains(5));
        assertTrue(resultado.contains(6));
    }

    @Test
    public void testRemoveRepetidosGenerico() {
        String[] array = { "java", "python", "java", "c++", "python", "javascript" };
        ArrayList<String> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 4);
        assertTrue(resultado.contains("java"));
        assertTrue(resultado.contains("python"));
        assertTrue(resultado.contains("c++"));
        assertTrue(resultado.contains("javascript"));
    }

    @Test
    public void testRemoveRepetidosComArrayVazio() {
        Integer[] array = {};
        ArrayList<Integer> resultado = Repetido.removerRepetidosComHashSet(array);
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testRemoveRepetidosComArraySemRepeticao() {
        Integer[] array = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> resultado = Repetido.removerRepetidosComHashSet(array);
        assertTrue(resultado.size() == 5);
        assertTrue(resultado.contains(1));
        assertTrue(resultado.contains(2));
        assertTrue(resultado.contains(3));
        assertTrue(resultado.contains(4));
        assertTrue(resultado.contains(5));
    }

    @Test
    public void testRemoveRepetidosComArrayDeStrings() {
        String[] array = { "a", "b", "a", "c", "b", "a" };
        ArrayList<String> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains("a"));
        assertTrue(resultado.contains("b"));
        assertTrue(resultado.contains("c"));
    }

    @Test
    public void testRemoveRepetidosComArrayDeFloats() {
        Float[] array = { 1.0f, 2.5f, 1.0f, 3.0f, 2.5f };
        ArrayList<Float> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains(1.0f));
        assertTrue(resultado.contains(2.5f));
        assertTrue(resultado.contains(3.0f));
    }

    @Test
    public void testRemoveRepetidosComArrayDeCaracteres() {
        Character[] array = { 'a', 'b', 'a', 'c', 'b', 'a' };
        ArrayList<Character> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains('a'));
        assertTrue(resultado.contains('b'));
        assertTrue(resultado.contains('c'));
    }

    @Test
    public void testRemoveRepetidosComArrayDeBooleanos() {
        Boolean[] array = { true, false, true, true, false };
        ArrayList<Boolean> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 2);
        assertTrue(resultado.contains(true));
        assertTrue(resultado.contains(false));
    }

    @Test
    public void testRemoveRepetidosComArrayDeLongos() {
        Long[] array = { 1L, 2L, 1L, 3L, 2L };
        ArrayList<Long> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains(1L));
        assertTrue(resultado.contains(2L));
        assertTrue(resultado.contains(3L));
    }

    @Test
    public void testRemoveRepetidosComArrayDeDoubles() {
        Double[] array = { 1.0, 2.5, 1.0, 3.0, 2.5 };
        ArrayList<Double> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains(1.0));
        assertTrue(resultado.contains(2.5));
        assertTrue(resultado.contains(3.0));
    }

    @Test
    public void testRemoveRepetidosComArrayDeShorts() {
        Short[] array = { (short) 1, (short) 2, (short) 1, (short) 3, (short) 2 };
        ArrayList<Short> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains((short) 1));
        assertTrue(resultado.contains((short) 2));
        assertTrue(resultado.contains((short) 3));
    }

    @Test
    public void testRemoveRepetidosComArrayDeBytes() {
        Byte[] array = { (byte) 1, (byte) 2, (byte) 1, (byte) 3, (byte) 2 };
        ArrayList<Byte> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains((byte) 1));
        assertTrue(resultado.contains((byte) 2));
        assertTrue(resultado.contains((byte) 3));
    }

    @Test
    public void testRemoveRepetidosComArrayDeInteirosGrandes() {
        Integer[] array = { 1000, 2000, 1000, 3000, 2000 };
        ArrayList<Integer> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains(1000));
        assertTrue(resultado.contains(2000));
        assertTrue(resultado.contains(3000));
    }

    @Test
    public void testRemoveRepetidosComArrayDeStringsVazias() {
        String[] array = { "", "", "a", "", "b", "" };
        ArrayList<String> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains(""));
        assertTrue(resultado.contains("a"));
        assertTrue(resultado.contains("b"));
    }

    @Test
    public void testRemoveRepetidosComArrayDeStringsComEspacos() {
        String[] array = { "hello world", "hello world", "hello", "world" };
        ArrayList<String> resultado = Repetido.removerRepetidosGenerico(array);
        assertTrue(resultado.size() == 3);
        assertTrue(resultado.contains("hello world"));
        assertTrue(resultado.contains("hello"));
        assertTrue(resultado.contains("world"));
    }
}