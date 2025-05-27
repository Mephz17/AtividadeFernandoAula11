/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.package1.atividadesfernando;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author okmen
 */
public class Questao1 {

    public static void main(String[] args) {
        String test = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        
        Stack <Character> pilha = new Stack<>();
        for(char elementos : test.toCharArray()){
            pilha.push(elementos);
        }
        
        while(!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
