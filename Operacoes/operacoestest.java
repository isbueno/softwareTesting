
package com.mycompany.operacoes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author isbueno
 */
public class OperacoesTest {
    
    public OperacoesTest() {
    }

    @ParameterizedTest
    @CsvSource("2,3")
    public void testSoma(int a, int b) {
        String oraculo = "Greater than zero";
        String obtido = Operacoes.soma(a, b);
        assertEquals(oraculo, obtido);
    }

    @ParameterizedTest
    @CsvSource("20")
    public void testEven(int a) {
        String oraculo = "Even";
        String obtido = Operacoes.even(a);
        assertEquals(oraculo, obtido);
    }
    
}
