/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativ06;

/**
 *
 * @author iagom
 */
import java.util.Random;
public class Ativ06 {

    public static void main(String[] args) {
        Random random = new Random();
        Pilha pilha = new Pilha(2000);
        Fila fila = new Fila(2000);
        
        int i = 0;
        int num;
        while(i < 1000){
            num = random.nextInt(1000)+1;
            fila.enqueue(num);
            num = -(random.nextInt(1000)+1);
            fila.enqueue(num);
            if(fila.front() > 0){
                num = fila.front();
                fila.dequeue();
                pilha.add(num);
            }
            else{
                num = pilha.pop();
                System.out.println(num);
            }
        }
        
        
    }
}
