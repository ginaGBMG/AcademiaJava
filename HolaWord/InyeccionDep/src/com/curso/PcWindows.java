package com.curso;

public class PcWindows {
	
	private String version;

	public PcWindows(String version) {
		//super();
		this.version = version;
	}
	public void encender() {
	System.out.println( " Enciende pc:" + version);
	}
}
