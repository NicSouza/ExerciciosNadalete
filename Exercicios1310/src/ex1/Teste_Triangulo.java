package ex1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Teste_Triangulo {

    @Test
    public void testEscalenoValido() {
        assertEquals("Escaleno", Triangulo.classificarTriangulo(3, 4, 5));
    }

    private void assertEquals(String string, String classificarTriangulo) {
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testIsoscelesValido() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 5, 3));
        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 3, 5));
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 5, 5));
    }

    @Test
    public void testEquilateroValido() {
        assertEquals("Equilátero", Triangulo.classificarTriangulo(6, 6, 6));
    }

    @Test
    public void testValorZero() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(0, 5, 5));
    }

    @Test
    public void testValorNegativo() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(-3, 4, 5));
    }

    @Test
    public void testSomaDoisLadosIgualTerceiro() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(1, 2, 3));
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(2, 1, 3));
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(3, 1, 2));
    }

    @Test
    public void testSomaDoisLadosMenorTerceiro() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(1, 1, 3));
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(1, 3, 1));
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(3, 1, 1));
    }

    @Test
    public void testTresValoresZero() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(0, 0, 0));
    }
}
