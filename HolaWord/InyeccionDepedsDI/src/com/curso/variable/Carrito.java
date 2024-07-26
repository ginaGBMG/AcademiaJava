package com.curso.variable;

public class Carrito implements Pilas{
	
	private String version;

	public Carrito(String version) {
		this.version = version;
	}
	@Override
	public void baterias() {
	System.out.println( " Con baterias incluidas:" + version);
	}
}
