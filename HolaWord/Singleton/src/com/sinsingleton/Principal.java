//Se declara que esta clase es parte del paquete com.sinsingleton. Los paquetes se utilizan para organizar clases relacionadas.
package com.sinsingleton;

// Se declara una clase pública llamada Principal. Esta es la clase que contiene el método main.
public class Principal {

	public static void main(String[] args) {
//Se define el método main, que es el punto de entrada para la ejecución de la aplicación Java	
		
		//Estas líneas crean dos instancias de la clase Elote utilizando el método getInstance. 
		//Esto sugiere que la clase Elote está utilizando el patrón Singleton, 
		//lo que significa que getInstance devuelve la misma instancia de Elote cada vez que se llama.
		Elote elote1 = Elote.getInstance("Elote con Chile", 35);
		Elote elote2 = Elote.getInstance("Elote Natural", 30);
		
		
		//Estas líneas imprimen mensajes en la consola utilizando las instancias elote1 y elote2. 
		//Utilizan los métodos getPreparacion y getPrecio de la clase Elote para obtener la información necesaria.
		System.out.println("Tu pedido es un " + 
		elote1.getPreparacion() + "," +
		" con un costo de "+ 
		elote1.getPrecio()+ 
				" pesos "+","+"la orden de Elotes Gutiérrez esta lista para disfrutar.");
		
		System.out.print("Sabemos que te gusta el picante de acuerdo a tu preferencias de " +
		elote2.getPreparacion()+ ","+ "lo cual cambia de precio " +
		elote2.getPrecio()+ " pesos,"+
				" La atencion en la preparacion de tu pedido es nuestra prioridad");
	}

}
