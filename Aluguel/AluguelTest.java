/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aluguel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author isabe
 */
public class AluguelTest {
    
    public AluguelTest() {
    }

    @ParameterizedTest
    @CsvSource ("n")
    public void Desconto50_Acerto(char a){
        String oraculo = "Sim Desconto 50";
        String obtido = Aluguel.infracao(a);
        assertEquals(oraculo, obtido);
    }

    @ParameterizedTest
    @CsvSource ({"s"})
    public void Desconto50_Falha(char a){
        String oraculo = "Sim Desconto 50";
        String obtido = Aluguel.infracao(a);
        assertEquals(oraculo, obtido);
    }    

    @ParameterizedTest
    @CsvSource ({"n"})
    public void INVALIDO_Acerto(char a){
        String oraculo = "Valor Inválido";
        String obtido = Aluguel.infracao(a);
        assertEquals(oraculo, obtido);
    }
    @ParameterizedTest
    @CsvSource ({"i"})
    public void INVALIDO_Falha(char a){
        String oraculo = "Valor Inválido";
        String obtido = Aluguel.infracao(a);
        assertEquals(oraculo, obtido);
    }    

    @ParameterizedTest
    @CsvSource ({"3"})
    public void Desconto5_Acerto(int a){
        String oraculo = "Sim Desconto 5";
        String obtido = Aluguel.aluguel(a);
        assertEquals(oraculo, obtido);
    }

    @ParameterizedTest
    @CsvSource ({"6"})
    public void Desconto5_Falha(int a){
        String oraculo = "Sim Desconto 5";
        String obtido = Aluguel.aluguel(a);
        assertEquals(oraculo, obtido);
    }

    @ParameterizedTest
    @CsvSource ({"2", "0"})
    public void NaoDesconto5_Acerto(int a){
        String oraculo = "Não Desconto 5";
        String obtido = Aluguel.aluguel(a);
        assertEquals(oraculo, obtido);
    }    
    
    @ParameterizedTest
    @CsvSource ({"3"})
    public void NaoDesconto5_Falha(int a){
        String oraculo = "Não Desconto 5";
        String obtido = Aluguel.aluguel(a);
        assertEquals(oraculo, obtido);
    }

    @ParameterizedTest
    @CsvSource ({"10"})
    public void Gratis_Acerto(int a){
        String oraculo = "Dia Grátis";
        String obtido = Aluguel.aluguel(a);
        assertEquals(oraculo, obtido);
    }
    
    @ParameterizedTest
    @CsvSource ({"1"})
    public void Gratis_Falha(int a){
        String oraculo = "Dia Grátis";
        String obtido = Aluguel.aluguel(a);
        assertEquals(oraculo, obtido);
    }
}
