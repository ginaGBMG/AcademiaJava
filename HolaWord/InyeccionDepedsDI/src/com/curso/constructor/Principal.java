package com.curso.constructor;

public class Principal {
	
	public static void main(String[] args) {
		
		Juguete juguete = Inyector.getJuguete();
		juguete.baterias();
		}
}
