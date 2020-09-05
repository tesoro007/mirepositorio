package com.Herencia;

public class Persona {
	
	private String nombre;
	private int edad;
	private char sexo;
	private boolean hombre;
	
	public Persona() {
		
	}
	
	public Persona (String nombre, int edad, char sexo ) {
		this.nombre= nombre;
		this.edad= edad;
		this.sexo=sexo;
		
	}
	
	public void printMesage() {
		System.out.println(" Soy una persona.");
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String Nombre) {
		this.nombre=Nombre;
	}
	
	public boolean isHombre() {
		return this.hombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
	
		this.edad=edad;
	}
	
	public char getSexo() {
		return sexo;
		
	}
	
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	
}
