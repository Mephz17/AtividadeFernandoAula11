/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.atividadesfernando;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author okmen
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Queue<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack();
        Random rand = new Random();
        HashSet<Integer> jaTem = new HashSet<>();
        
        for(int i = 0; i < 1000; i++){
            int num = rand.nextInt(5000);
            if(!jaTem.contains(num)){
                F.add(num);
                jaTem.add(num);
                
            }
            else{
                P.push(num);
            }
        }
        System.out.println("Fila F: ");
        for(int n : F){
            System.out.println(n + " ");
        }
        
        System.out.println("\n\nPilha P: ");
        for(int i = P.size() - 1; i >= 0; i--){
            System.out.println(P.get(i) + " ");
        }
    }
}
