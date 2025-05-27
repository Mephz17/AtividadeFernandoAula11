/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.package1.atividadesfernando;
import java.util.Queue;

/**
 *
 * @author okmen
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Aviao {
    String nome;
    int numero;

    public Aviao(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String toString() {
        return "Aviao " + nome + " (ID: " + numero + ")";
    }
}

public class Questao3 {
    static Queue<Aviao> fila = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Listar numero de avioes");
            System.out.println("2 - Autorizar decolagem");
            System.out.println("3 - Adicionar aviao");
            System.out.println("4 - Listar todos os avioes");
            System.out.println("5 - Mostrar primeiro aviao");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Total na fila: " + fila.size());
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        Aviao a = fila.poll();
                        System.out.println("Decolagem autorizada: " + a);
                    } else {
                        System.out.println("Fila vazia");
                    }
                    break;
                case 3:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Numero: ");
                    int numero = sc.nextInt();
                    fila.add(new Aviao(nome, numero));
                    break;
                case 4:
                    for (Aviao aviao : fila) {
                        System.out.println(aviao);
                    }
                    break;
                case 5:
                    if (!fila.isEmpty()) {
                        System.out.println("Primeiro: " + fila.peek());
                    } else {
                        System.out.println("Fila vazia");
                    }
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}

