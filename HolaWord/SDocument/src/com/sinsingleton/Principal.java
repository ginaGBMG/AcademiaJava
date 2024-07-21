package com.sinsingleton;

public class Principal {
    public static void main(String[] args) {
        // Creación de objetos 
        EloteMx doriesquites = new Doriesquites(); // Referencia de tipo de la interfaz
        
        // Llamada a los métodos 
        doriesquites.servidoEn();  
        doriesquites.acompañadoDe();  
        doriesquites.precio();  
    }
}
