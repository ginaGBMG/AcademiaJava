package com.curso;

public class Mensajeria {
	
	private String nombre;
	PcWindows myPc;

	public Mensajeria(String nombre) {
		
				this.nombre = nombre;
	}
	void encenderPc() {
		System.out.print(nombre);
		myPc = new PcWindows("Windows 10");
		myPc.encender();
	}//Alto acoplamiento
	
}//cierre
