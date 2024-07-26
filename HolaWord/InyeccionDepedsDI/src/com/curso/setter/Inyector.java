package com.curso.setter;

public class Inyector {
	static void inyectarCarrito (Juguete jug) {		
		jug.setMattel (new Carrito("Hot-Whales"));
	}
}
