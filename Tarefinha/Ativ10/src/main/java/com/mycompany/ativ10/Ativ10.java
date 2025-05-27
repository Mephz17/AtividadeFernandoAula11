/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativ10;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ativ10 {
    public static int expo(int base, int expo){
        if(expo == 1){
            return base;
        }
        return base * expo(base, expo - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base e do expoente, respectivamente: ");
        int valorBase = input.nextInt();
        int valorExpo = input.nextInt();
        System.out.println(expo(valorBase, valorExpo));
        
    }
}
