/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.permissaoviagem;

 /**
  *
  * @author isBueno
  */
 public class PermissaoViagem {
 
     public static String PermissaoViagem(int idade, char passaporte, char responsavel){
         switch (passaporte) {
             case 'n' -> {
                 return "Viagem Negada";
             }
             case 's' -> {
                 if (idade >= 18){
                     return "Viagem Autorizada";
                 }
                 else{
                     return switch (responsavel) {
                         case 'n' -> "Viagem Negada";
                         case 's' -> "Viagem Autorizada";
                         default -> "Valor Inválido";
                     };
                 }
             }
             default -> {
                 return "valor inválido";
             }
 
         }
     }
 }
 