package com.curso.setter;

public class Juguete {

	private String producto;
	private Carrito mattel;
	
	public Juguete(String producto) {
				this.producto = producto;
	}
	public Carrito getMattel() {
		return mattel;
	}
	public void setMattel(Carrito mattel) {
		this.mattel = mattel;
	}
	void baterias() {
		System.out.print(producto);
		mattel.baterias();
    }
}
