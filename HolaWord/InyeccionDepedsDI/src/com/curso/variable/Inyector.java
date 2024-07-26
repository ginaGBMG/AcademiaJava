package com.curso.variable;

public class Inyector {
	static void inyectarCarrito (Juguete jug) {		
		jug.setMattel (new Carrito("Hot-Whales"));
	}
}
