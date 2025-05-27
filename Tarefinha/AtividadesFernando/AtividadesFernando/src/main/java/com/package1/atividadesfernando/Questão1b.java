/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.atividadesfernando;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author okmen
 */
public class Questão1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Digite palavra: ");
        Scanner input = new Scanner(System.in);
        
        String prima = input.nextLine();
        prima.toLowerCase();
        String original = prima.replaceAll("\\s+", "");
        
        String armazenar = prima.toLowerCase();
        
        Stack<Character> pilha = new Stack<>();
        for(char elementos : prima.toCharArray()){
            pilha.push(elementos);
        }
        String inverte = "";
        while(!pilha.isEmpty()){
            inverte += pilha.pop();
        }
        
        if(original.equals(inverte)){
            System.out.println("E um polidromo");
        }
        else{
            System.out.println("N e um polidromo");
        }
        input.close();
        
        
    }
}
