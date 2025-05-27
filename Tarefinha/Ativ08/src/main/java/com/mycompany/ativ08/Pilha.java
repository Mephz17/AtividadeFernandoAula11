/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ08;

/**
 *
 * @author iagom
 */
public class Pilha {
    private int elementos[];
    private int capacidade;
    private int topo;
    
    public Pilha(int capacidade){
        this.elementos = new int[capacidade];
        this.capacidade = capacidade;
        this.topo = -1;
    }
    
    public void add(int elemento){
        if(isFull()){
            throw new IllegalStateException("Pilha cheia");
        }
        elementos[++topo] = elemento;
    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
       return elementos[topo--];
    }
    public void imprimirPilha(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
        for(int i = topo; i >= 0; i--){
            System.out.print(elementos[i]+" ");
        }
        System.out.println();
    }
    public int getTamanho(){
        return topo+1;
    }
    public boolean isEmpty(){
        return topo == -1;
    }
    public boolean isFull(){
        return topo == capacidade - 1;
    }
}
