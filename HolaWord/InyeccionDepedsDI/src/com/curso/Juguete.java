package com.curso;

public class Juguete {

	private String producto;
	Carrito Matel;

	public Juguete(String producto) {
		
				this.producto = producto;
	}
	void baterias() {
		System.out.print(producto);
		Matel = new Carrito("Hot Wheels");
		Matel.baterias();
	}
}
