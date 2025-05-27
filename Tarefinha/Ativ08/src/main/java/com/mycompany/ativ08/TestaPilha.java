/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ08;

/**
 *
 * @author iagom
 */
public class TestaPilha {
    private Pilha positivos;
    private Pilha negativos;
    public TestaPilha(Pilha n, Pilha p){
        this.positivos = p;
        this.negativos = n;
    }
    
    public void add(int elemento){
        if(elemento > 0){
            positivos.add(elemento);
            return;
        }
        else if(elemento < 0){
            negativos.add(elemento);
            return;
        }
        System.out.println(positivos.pop());
        System.out.println(negativos.pop());
    }
}
