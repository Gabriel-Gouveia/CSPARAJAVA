/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */

// Algorítmo para aumentar salário. 
public class JavaApplication1 {

    public static void main(String[] args)
    {
        double salario;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o seu salário?");
        salario = Double.parseDouble(s.nextLine());
        
        if (salario < 1500)
        {
            System.out.println("Você receberá 10% de aumento");
            salario = salario * 1.10;
        } else
        {
                System.out.println("Você receberá 2% de aumento");
                salario = salario * 1.02;
                }
        
        System.out.println("Seu salário passou a ser " + salario);       
        
        
        
    }
}
