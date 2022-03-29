/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author FAMILIA TOJ GARCÍA
 */
public class Cola {
    private Nodo primero;
    private Nodo ultimo;
    int tamanio;
    
    public Cola(){
        primero = null;
        ultimo = null;
        tamanio = 0;
    }
    
    public boolean vacia(){
        if(this.primero != null){
            return true;
        }
        System.out.println("La lista está vacía");
        return false;
    }
    
    public void push( int dato){
        Nodo nuevo = new Nodo(dato);
        if(tamanio==0){
            primero = nuevo;}
        else{
            ultimo.setSiguiente(nuevo);
            
        }
        ultimo = nuevo;
        tamanio++;
    }
    
    public void imprimirDatos(){
        Nodo temp = primero;
        while(temp!= null){
            System.out.println("[" + temp.dato + "]");
            temp = temp.siguiente;
        }
    }
    public int pop(){
        int aux = primero.dato;
        primero = primero.siguiente;
        tamanio--;
        if(tamanio==0){
            ultimo = null;}
        return aux;
    }
    
    public int primero(){
        return primero.dato;
    }
    
    public int size(){
        return tamanio;
    }
    
    public void limpiar (){
        do{
           pop(); 
        }while(vacia()== false);        
        System.out.println("La lista se ha vaciado");
    }
}
