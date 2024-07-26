package com.curso;

public class Carrito {
	
	private String version;

	public Carrito(String version) {
		this.version = version;
	}
	public void baterias() {
	System.out.println( " Con baterias incluidas:" + version);
	}
}
