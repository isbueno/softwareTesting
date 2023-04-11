
 package com.mycompany.operacoes;

 /**
  *
  * @author isbueno
  */
 public class Operacoes {
 
     public static String soma(int a, int b){
         int result = a + b;
         if (result > 0)
             System.out.println("Greater than zero");
         else if (result < 0)
             System.out.println("Less than zero");
         else
             System.out.println("Zero");
         return null;
     }
     
     public static String even(int a){
         if (a%2 == 0)
             System.out.println("Even");
         
         System.out.println(a);
         return null;
     }
 }
 