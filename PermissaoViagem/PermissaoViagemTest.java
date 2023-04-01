/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.permissaoviagem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author isabe
 */
public class PermissaoViagemTest {
    
    public PermissaoViagemTest() {
    }
    
    @ParameterizedTest
    @CsvSource ({"5, n, s", "5, s, n", "18, n, n"})
    public void ViagemNegada_Acerto(int a, char b, char c){
        String oraculo = "Viagem Negada";
        String obtido = PermissaoViagem.PermissaoViagem(a, b, c);
        assertEquals(oraculo, obtido);
    }
    
    @ParameterizedTest
    @CsvSource ({"5, s, s", "19, s, n", "20, s, n"})
    public void ViagemNegada_Falha(int a, char b, char c){
        String oraculo = "Viagem Negada";
        String obtido = PermissaoViagem.PermissaoViagem(a, b, c);
        assertEquals(oraculo, obtido);
    }

    @ParameterizedTest
    @CsvSource ({"35, s, s", "35, s, n", "10, s, s"})
    public void ViagemAutorizada_Acerto(int a, char b, char c){
        String oraculo = "Viagem Autorizada";
        String obtido = PermissaoViagem.PermissaoViagem(a, b, c);
        assertEquals(oraculo, obtido);
    }
    
    @ParameterizedTest
    @CsvSource ({"5, s, n", "13, n, n", "20, n, s"})
    public void ViagemAutorizada_Falha(int a, char b, char c){
        String oraculo = "Viagem Autorizada";
        String obtido = PermissaoViagem.PermissaoViagem(a, b, c);
        assertEquals(oraculo, obtido);
    }


}
