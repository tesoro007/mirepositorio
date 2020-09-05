package com.poliformismo;

public class PoliformisoMain {

	public static void main(String[] args) {
		
		Animal fido, snarf;

		fido = new Perro("Perro", "Fido");
		
		snarf= new Gato("Gato", "Snarf");
		
		fido.printMensaje();
		snarf.printMensaje();
	}

}
