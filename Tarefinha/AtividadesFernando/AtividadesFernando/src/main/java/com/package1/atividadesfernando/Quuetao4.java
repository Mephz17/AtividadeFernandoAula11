/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.atividadesfernando;

/**
 *
 * @author okmen
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Quuetao4 {
    public static void main(String[] args) {
        Queue<Integer> F1 = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            F1.add(rand.nextInt(1000));
        }

        Stack<Integer> pilha = new Stack<>();
        while (!F1.isEmpty()) {
            pilha.push(F1.poll());
        }

        Queue<Integer> F2 = new LinkedList<>();
        while (!pilha.isEmpty()) {
            F2.add(pilha.pop());
        }

        System.out.println("Fila F2 invertida:");
        for (int n : F2) {
            System.out.print(n + " ");
        }
    }
}

