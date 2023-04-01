/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clientevip;

/**
 *
 * @author isBueno
 */
public class ClienteVip {

    public static String ClienteVip(int ano, float saldo){
        if (ano < 2 && saldo < 2000)
            {return "Não VIP";}
        if (ano >= 2 && saldo < 2000)
            {return "Não VIP";}
        if (ano >= 2 && saldo >= 2000)
            {return "VIP";}
        return null;
     
    }
}
