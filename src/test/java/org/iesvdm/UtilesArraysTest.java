package org.iesvdm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class UtilesArraysTest {
    @Test
    void testPrueba() {
        assertThat(1!=1).isFalse();
    }

    @Test
    void testLimpiar() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = UtilesArrays.limpiar();

        assertThat(newArray.length).isEqualTo(0);
    }

    @Test
    void testRellenar_IntInt() {
        int[] array = new int[5];
        int[] newArray = UtilesArrays.rellenar(array, 5);

        int[] expectedArray = {0, 0, 0, 0, 0};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testRellenar_IntIntInt() {
        int[] array = new int[5];
        int[] newArray = UtilesArrays.rellenar(array, 5, 1);

        int[] expectedArray = {1, 1, 1, 1, 1};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testInsertarAlFinal() {
        int[] array = {1, 2, 3};
        int[] newArray = UtilesArrays.insertarAlFinal(array, 4);

        int[] expectedArray = {1, 2, 3, 4};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testInsertarAlPrincipio() {
        int[] array = {2, 3, 4};
        int[] newArray = UtilesArrays.insertarAlPrincipio(array, 1);

        int[] expectedArray = {1, 2, 3, 4};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testInsertarEnPosicion() {
        int[] array = {1, 2, 4, 5};
        int[] newArray = UtilesArrays.insertarEnPosicion(array, 3, 2);

        int[] expectedArray = {1, 2, 3, 4, 5};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testInsertarOrdenado() {
        int[] array = {1, 2, 4, 5};
        int[] newArray = UtilesArrays.insertarOrdenado(array, 3);

        int[] expectedArray = {1, 2, 3, 4, 5};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testEliminarUltimo() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = UtilesArrays.eliminarUltimo(array);

        int[] expectedArray = {1, 2, 3, 4};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testEliminarPrimero() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = UtilesArrays.eliminarPrimero(array);

        int[] expectedArray = {2, 3, 4, 5};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testEliminarPosicion() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = UtilesArrays.eliminarPosicion(array, 2);

        int[] expectedArray = {1, 2, 4, 5};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testOrdenar() {
        int[] array = {5, 4, 3, 2, 1};
        int[] newArray = UtilesArrays.ordenar(array);

        int[] expectedArray = {1, 2, 3, 4, 5};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testDesordenar() {
        int[] array = {1, 2, 3, 4, 5};
        UtilesArrays.desordenar(array);

        assertThat(array).isNotEqualTo(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void testInvertir() {
        int[] array = {1, 2, 3, 4, 5};
        int[] invertedArray = UtilesArrays.invertir(array);

        int[] expectedArray = {5, 4, 3, 2, 1};

        assertThat(invertedArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < invertedArray.length; i++) {
            assertThat(invertedArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testEstaOrdenado() {
        int[] array = {1, 2, 3, 4, 5};
        assertThat(UtilesArrays.estaOrdenado(array)).isTrue();

        int[] arrayDesordenado = {5, 2, 1, 3, 4};
        assertThat(UtilesArrays.estaOrdenado(arrayDesordenado)).isFalse();
    }

    @Test
    void testBuscar() {
        int[] array = {1, 2, 3, 4, 5};
        assertThat(UtilesArrays.buscar(array, 3)).isEqualTo(2);
        assertThat(UtilesArrays.buscar(array, 6)).isEqualTo(-1);
    }

    @Test
    void testPartirPor() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = UtilesArrays.partirPor(array, 1, 3);

        int[] expectedArray = {2, 3};

        assertThat(newArray.length).isEqualTo(expectedArray.length);
        for (int i = 0; i < newArray.length; i++) {
            assertThat(newArray[i]).isEqualTo(expectedArray[i]);
        }
    }

    @Test
    void testSonIguales() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        assertThat(UtilesArrays.sonIguales(array1, array2)).isTrue();

        int[] array3 = {1, 2, 3, 4, 5};
        int[] array4 = {5, 4, 3, 2, 1};
        assertThat(UtilesArrays.sonIguales(array3, array4)).isFalse();
    }
}
