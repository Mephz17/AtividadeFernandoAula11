/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativ08;

/**
 *
 * @author iagom
 */
import java.util.Random;
public class Ativ08 {

    public static void main(String[] args) {
        Pilha pilha1 = new Pilha(1000);
        Pilha pilha2 = new Pilha(1000);
        TestaPilha obj = new TestaPilha(pilha1, pilha2);
        Random random = new Random();
        int num;
        for(int i = 0; i < 1000; i++){
            num = random.nextInt(201) - 100;
            obj.add(num);
        }
        
    }
}
