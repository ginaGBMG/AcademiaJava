package com.curso.setter;

public class Tractor implements Pilas {
	private String version;

	public Tractor(String version) {
		this.version = version;
	}
	@Override
	public void baterias() {
	System.out.println( " Con baterias incluidas:" + version);
	}
}
