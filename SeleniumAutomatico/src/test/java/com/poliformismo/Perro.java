package com.poliformismo;

public class Perro extends Animal {
	
	private String Nombre;
	
	public Perro(String especie, String Nombre) {
		super(especie);
		this.Nombre=Nombre;
		
	}
	
	public void printMensaje() {
		super.printMensaje();
		
		System.out.println("Este es un perro y ladra");
	}	
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		
		this.Nombre= Nombre;
	}

}
