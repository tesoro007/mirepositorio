package com.exesise1;

public class PolimorfismoPoligono {

	public static void main(String[] args) {
		Poligono poligono = new Rectangulo(4,4,2,2);
       System.out.println(poligono.toString());
		double perimetro1 = poligono.perimetro();
		System.out.println("El prerimetro es:" + perimetro1);
		
		poligono=new Rectangulo(2,2);
		double area1= poligono.area();
		System.out.println("El area es:" + area1);
		
        poligono= new Triangulo(3,3,3);
       System.out.println(poligono.toString());
	   double perimetro2 = poligono.perimetro();
	    System.out.println("El prerimetro es:" + perimetro2);
	    
	    poligono=new Triangulo(2,2);
		double area2= poligono.area();
		System.out.println("El area es:" + area2);
	    
	    	
	}

	
	
}
