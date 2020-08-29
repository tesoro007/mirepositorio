package com.exesise1;

public class Rectangulo extends Poligono{
	
	private  double lado1, lado2,lado3,lado4;
	private double base,altura;

	public Rectangulo() {
		
		
	}
	
public Rectangulo(double lado1, double lado2, double lado3, double lado4){
		super (4);
		this.lado1= lado1;
		this.lado2=lado2;
		this.lado3=lado3;
		this.lado4=lado4;
			}
public Rectangulo(double base, double altura){
	super (4);
	this.base= base;
	this.altura=altura;
	
		}

//Encapsular
public void setlado1(double lado1) {
	this.lado1= lado1;
	
}

public double getlado1() {
	return lado1;
	
}

public void setlado2(double lado2) {
	this.lado2= lado2;
	
}

public double getlado2() {
	return lado2;
	
}


public void setlado3(double lado3) {
	this.lado3= lado3;
	
}

public double getlado3() {
	return lado3;
	
}

public void setlado4(double lado4) {
	this.lado4= lado4;
	
}

public double getlado4() {
	return lado4;
	
}

@Override

public String toString() {
	String message= " RECTANGULO " + super.toString() +
			"\nLADO 1= " + lado1 + " LADO 2= " + lado2 + " LADO 3= " + lado3 + " LADO 4= " + lado4;
       return message;
}

	@Override
	public double area() {
		return base * altura;
	
	}

	@Override
	public double perimetro() {
		
		return lado1+lado2+lado3+lado4;
	}
	
	

}
