/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.clientevip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Aluno
 */
public class ClienteVipTest {
    
    public ClienteVipTest() {
    }

    @ParameterizedTest
    @CsvSource({"1,400", "2,200", "1,300"})
    public void testACERTO_NaoVIP(int a, int b) {
    String esperado = "Não VIP";
    String obtido = ClienteVip.ClienteVip(a, b);
    assertEquals(esperado, obtido);          
    }
    
    @ParameterizedTest
    @CsvSource({"2,4000", "3,4000", "10,3000"})
    public void testFALHA_NaoVIP(int a, int b) {
    String esperado = "Não VIP";
    String obtido = ClienteVip.ClienteVip(a, b);
    assertEquals(esperado, obtido);          
    }

    @ParameterizedTest
    @CsvSource({"2,2000", "7,5000", "2,2010"})
    public void testACERTO_VIP(int a, int b) {
    String esperado = "VIP";
    String obtido = ClienteVip.ClienteVip(a, b);
    assertEquals(esperado, obtido);          
    }
    
    @ParameterizedTest
    @CsvSource({"1,4000", "3,400", "10,0"})
    public void testFALHA_VIP(int a, int b) {
    String esperado = "VIP";
    String obtido = ClienteVip.ClienteVip(a, b);
    assertEquals(esperado, obtido);          
    }    
}
