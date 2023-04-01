/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.vendabebidaalcolica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author isBueno
 */
public class VendaBebidaAlcolicaTest {
    
    public VendaBebidaAlcolicaTest() {
    }

    //@Test
    @ParameterizedTest
    @ValueSource (ints={18})
    public void testVendaBebida(int a) {
        //int a = 18;
        String oraculo = "Sim";
        String obtido = VendaBebidaAlcolica.VendaBebida(a);
        assertEquals (oraculo, obtido);
    }
    //@Test
    @ParameterizedTest
    @ValueSource (ints={17})
    public void testVendaBebida1(int a) {
        //int a = 17;
        String oraculo = "Não";
        String obtido = VendaBebidaAlcolica.VendaBebida(a);
        assertEquals (oraculo, obtido);
    }
    
}
