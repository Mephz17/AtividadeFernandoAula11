/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ07;

/**
 *
 * @author iagom
 */
public class Fila {
    private int elementos[];
    private int fim;
    private int capacidade;
    private int inicio;
    private int tamanho;
    
    public Fila(int capacidade){
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.capacidade = capacidade;
        this.tamanho = 0;
    }
    
    public void enqueue(int elemento){
        if(isFull()){
            System.out.println("Fila cheia");
            return;
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }
    public Integer dequeue(){
        if(isEmpty()){
            System.out.println("Fila vazia");
            return -1;
        }
        int elementoRemovido = elementos[inicio];
        elementos[inicio] = 0; // Valor padrão para inteiros
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        return elementoRemovido;
    }
    public Integer front() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }

        return elementos[inicio];
    }
    public boolean verificaFila(int num) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidade;
            if(elementos[indice] == num){
                return true;
            }
        }
        return false;
}
    public void imprimirFila(){
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        for(int i = 0; i < tamanho; i++){
            int indice = (inicio + i) % capacidade;
            System.out.print(elementos[indice]+" ");
        }
        System.out.println();
    }
    public int getTamanho(){
        return this.tamanho;
    }
    private boolean isEmpty(){
        return tamanho == 0;
    }
    private boolean isFull(){
        return tamanho == capacidade;
    }
}
