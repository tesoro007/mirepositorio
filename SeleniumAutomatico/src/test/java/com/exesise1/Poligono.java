package com.exesise1;

public abstract class Poligono {

private int numlados;

//constructor

public Poligono() {
	
	
}

//Constructor

public Poligono(int numlados) {
	
	this.numlados= numlados;
	
	
}

//Encapsular Getter and Setter

public void setNumLados(int numlados) {

	this.numlados = numlados;
}

public int getnumlados() {
		return numlados;
}

@Override
public String toString() {
	
	return "Numero de lados" + numlados;
	
}

//Metodos de abtración 

public abstract double area() ;
public abstract double perimetro();
	

}
