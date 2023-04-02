/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.aluguel;

 /**
  *
  * @author isabe
  */
 public class Aluguel {
 
     public static String aluguel(int aluguel){
         if (aluguel < 3){
             return "Não Desconto 5";
         }
         else if (aluguel == 3){
             return "Sim Desconto 5";
         }
         else if (aluguel >= 4){
             return "Dia Grátis";
         }
         else{
             return "Valor Inválido";
         }
     }
     
     public static String infracao(char infracao){
         return switch (infracao) {
             case 's' -> "Não Desconto 50";
             case 'n' -> "Sim Desconto 50";
             default -> "Valor Inválido";
         };
    }       
 }
 