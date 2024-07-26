package com.curso.constructor;

public class Juguete {

	private String producto;
	private Carrito mattel;

	public Juguete(String producto, Carrito mattel) {
				this.producto = producto;
				this.mattel = mattel;
	}
	
	private String producto2;
	private Pilas mattels;
	
	public Juguete(String producto2, Pilas mattels) {
		this.producto2 = producto2;
		this.mattels = mattels;
	}
	void baterias() {
		System.out.print(producto);
		mattel.baterias();
	}
}
