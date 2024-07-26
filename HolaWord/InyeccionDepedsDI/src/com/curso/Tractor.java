package com.curso;

public class Tractor {
	private String version;

	public Tractor(String version) {
		this.version = version;
	}
	public void baterias() {
	System.out.println( " Con baterias incluidas:" + version);
	}
}
