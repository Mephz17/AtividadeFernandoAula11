/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativ09;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Ativ09 {
    public static int somaValores(List<Integer> valores){
        if(valores.size() == 1){
            return valores.get(0);
        }
        int soma = valores.get(0);
        return soma + somaValores(valores.subList(1, valores.size()));
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite qualquer valor ou 0 para encerrar a entrada de dados: ");
        int num = input.nextInt();
        while(num != 0){
            numeros.add(num);
            num = input.nextInt();
        }
        System.out.println(somaValores(numeros));
    }
}
