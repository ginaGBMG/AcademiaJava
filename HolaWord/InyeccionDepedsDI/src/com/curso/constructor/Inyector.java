package com.curso.constructor;

public class Inyector {
	
	static Juguete getJuguete() {
		Pilas carrito = new Carrito("Hot-Whales");
		Pilas tractor = new Tractor("Mattel");

		return new Juguete("Edicion Especial", carrito);
	}
}
