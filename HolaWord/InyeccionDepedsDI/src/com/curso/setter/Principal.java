package com.curso.setter;

public class Principal {
	
	public static void main(String[] args) {
		
		Juguete juguete = new Juguete("Hot-Whales Mx");
		
		Inyector.inyectarCarrito(juguete);
		
		juguete.baterias();
		}
}
