package ex3;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraSalarioTeste {

    @Test
    public void testDesenvolvedorComSalarioMaiorOuIgual3000() {
        Funcionario dev = new Funcionario("João", "joao@empresa.com", 3000.00, Cargo.DESENVOLVEDOR);
        assertEquals(2400.00, CalculadoraSalario.calcularSalarioLiquido(dev), 0.01);
    }

    @Test
    public void testDesenvolvedorComSalarioMenorQue3000() {
        Funcionario dev = new Funcionario("Maria", "maria@empresa.com", 2500.00, Cargo.DESENVOLVEDOR);
        assertEquals(2250.00, CalculadoraSalario.calcularSalarioLiquido(dev), 0.01);
    }

    @Test
    public void testDBAComSalarioMaiorOuIgual2000() {
        Funcionario dba = new Funcionario("Carlos", "carlos@empresa.com", 2000.00, Cargo.DBA);
        assertEquals(1500.00, CalculadoraSalario.calcularSalarioLiquido(dba), 0.01);
    }

    @Test
    public void testDBAComSalarioMenorQue2000() {
        Funcionario dba = new Funcionario("Ana", "ana@empresa.com", 1500.00, Cargo.DBA);
        assertEquals(1275.00, CalculadoraSalario.calcularSalarioLiquido(dba), 0.01);
    }

    @Test
    public void testTestadorComSalarioMaiorOuIgual2000() {
        Funcionario testador = new Funcionario("Lucas", "lucas@empresa.com", 2500.00, Cargo.TESTADOR);
        assertEquals(1875.00, CalculadoraSalario.calcularSalarioLiquido(testador), 0.01);
    }

    @Test
    public void testTestadorComSalarioMenorQue2000() {
        Funcionario testador = new Funcionario("Sofia", "sofia@empresa.com", 1800.00, Cargo.TESTADOR);
        assertEquals(1530.00, CalculadoraSalario.calcularSalarioLiquido(testador), 0.01);
    }

    @Test
    public void testGerenteComSalarioMaiorOuIgual5000() {
        Funcionario gerente = new Funcionario("Pedro", "pedro@empresa.com", 6000.00, Cargo.GERENTE);
        assertEquals(4200.00, CalculadoraSalario.calcularSalarioLiquido(gerente), 0.01);
    }

    @Test
    public void testGerenteComSalarioMenorQue5000() {
        Funcionario gerente = new Funcionario("Clara", "clara@empresa.com", 4000.00, Cargo.GERENTE);
        assertEquals(3200.00, CalculadoraSalario.calcularSalarioLiquido(gerente), 0.01);
    }
}
