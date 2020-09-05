package com.poliformismo;

public class Gato extends Animal {
	
	private String Nombre;
	
	public Gato (String especie, String nombre) {
		
		super (especie); //Atributo
		this.Nombre = nombre;
		
	}
	
	public void printMensaje() {
		super.printMensaje(); //metodo
		
		System.out.println("Este es un gato que maulla");
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
		
	}
	
}
