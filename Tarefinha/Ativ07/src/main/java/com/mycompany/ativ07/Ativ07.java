/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativ07;

/**
 *
 * @author iagom
 */
import java.util.Random;
public class Ativ07 {
    public static void inverter(Fila fila){
        int num;
        Pilha pilha = new Pilha(20);
        int i = 0;
        int tamanho = fila.getTamanho();
        while(i < tamanho){
            num = fila.dequeue();
            pilha.add(num);
            i++;
        }
        pilha.imprimirPilha();
    }
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila(20);
        int num;
        for(int i = 0; i < 20; i++){
            num = random.nextInt(20);
            fila.enqueue(num);
        }
        fila.imprimirFila();
        inverter(fila);
    }
}
