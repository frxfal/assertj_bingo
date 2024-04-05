package org.iesvdm;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;

public class BingoTest {

    @Test
    void testPrueba() {
        assertThat(1!=1).isFalse();
    }

    @Test
    void testrellenarNumerosCarton(){
        int[][] carton = new int[9][3];
        Bingo.rellenarNumerosCarton(carton);
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length - 1; j++) {
                for (int k = j + 1; k < carton[i].length; k++) {
                    assertThat(carton[i][j]).isNotEqualTo(carton[i][k]);
                }
            }
        }
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                assertThat(carton[i][j]).isGreaterThanOrEqualTo(1);
                assertThat(carton[i][j]).isLessThanOrEqualTo(90);
            }
        }
    }

    @Test
    void testPonerBlancos(){
        // Genero los arrays columnas:
//        int[] col0 = new int[3];
//        int[] col1 = new int[3];
//        int[] col2 = new int[3];
//        int[] col3 = new int[3];
//        int[] col4 = new int[3];
//        int[] col5 = new int[3];
//        int[] col6 = new int[3];
//        int[] col7 = new int[3];
//        int[] col8 = new int[3];
//
//        // Los paso a mi matriz o array bidimensional:
//        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

        int[][] cartonDirecto = new int[9][3];

        Bingo.ponerBlancos(cartonDirecto);
        String[] filas = {"", "", ""};
        for( int[] col : cartonDirecto ) {
            for(int j = 0; j < 3; j++) {
                filas[j] += (col[j] == 0 ? " 0": col[j]) +" ";
            }
        }

        for(String fila : filas)
            System.out.println(fila);

        int contBCarton = 0;
        for(int[] col : cartonDirecto) {
            for(int celda : col) {
                if(celda == -1) contBCarton++;
            }
        }
        assertThat(contBCarton).isEqualTo(3*4);
    }

    @Test
    void testBuscarFila() {
        int[][] carton = {
                {1, 2, 3},
                {4, 5, -1},
                {7, 8, 9},
                {10, -1, 12},
                {13, 14, 15},
                {16, 17, 18},
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
        };
        assertThat(Bingo.buscarFila(carton, 2, 1)).isTrue();
        assertThat(Bingo.buscarFila(carton, 2, 5)).isFalse();
    }

    @Test
    void testBuscarColumna() {
        int[][] carton = {
                {1, 2, 3},
                {4, 5, -1},
                {7, 8, 9},
                {10, 11, -1},
                {13, 14, 15},
                {16, 17, 18},
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
        };
        assertThat(Bingo.buscarColumna(carton, 2)).isFalse();
        assertThat(Bingo.buscarColumna(carton, 1)).isFalse();
    }
    @Test
    void testBuscarValorRepetido() {
        int[] array = {1, 2, 3, 4, 5};
        assertThat(Bingo.buscarValorRepetido(array, 3)).isTrue();
        assertThat(Bingo.buscarValorRepetido(array, 6)).isFalse();
    }

    @Test
    void testPintarCarton() {
        int[][] carton = {
                {1, 2, 3},
                {4, 5, -1},
                {7, 8, 9},
                {10, 11, -1},
                {13, 14, 15},
                {16, 17, 18},
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
        };
        int[] numerosGenerados = {1, 5, 10, 14};
        assertThat(Bingo.pintarCarton(carton, numerosGenerados)).isEqualTo(4);
    }

    @Test
    void testInsertarAlFinal() {
        int[] array = {1, 2, 3, 4, 5};
        int[] nuevoArray = Bingo.insertarAlFinal(array, 6);
        assertThat(nuevoArray.length).isEqualTo(6);
        assertThat(nuevoArray[5]).isEqualTo(6);
    }

    @Test
    void testOrdenar() {
        int[] array = {5, 2, 8, 1, 9};
        int[] arrayOrdenado = Bingo.ordenar(array);
        Arrays.sort(array);
        assertThat(arrayOrdenado).isEqualTo(array);
    }
}
