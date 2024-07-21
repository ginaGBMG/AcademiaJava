package com.sinsingleton;

public class Elote {
	
	//Identificacion de la preparacion del producto
	private static Elote elote;
	private String preparacion;
	private int precio;
	
	private Elote(String preparacion, int precio) {
		this.preparacion = preparacion;
		this.precio = precio;
		
	}//Datos importantes para el cliente 
	
	public static Elote getInstance(String preparacion, int precio) {
		if (elote==null)
			elote = new Elote (preparacion, precio);
		return elote; 
	}
	public String getPreparacion() {
		return preparacion;
	}
	public int getPrecio() {
		return precio;
	}
}
