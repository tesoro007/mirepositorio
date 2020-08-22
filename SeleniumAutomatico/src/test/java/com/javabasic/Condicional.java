package com.javabasic;

public class Condicional {

	public static void main(String[] args) {
		int velocidad= 60;
		int limiteVelocidad=60;
		
		
//		if(velocidad>limiteVelocidad) {
//			System.out.println("Multa");
//		} 
		
//		

		//IF ANIDADO
//		boolean hidway= true;
//		
//		if(hidway==true) {
//			
//		
//		System.out.println("Go to hidaway");
//		if (velocidad>limiteVelocidad) {
//			System.out.println ("Vamos a una velocidad adecuada");
//		}
//		
//
//	}
		//IF ELSE
		
//        boolean hidway= false;
//		
//		if(hidway==true) {
//			
//		
//		System.out.println("Go to hidaway");
//		limiteVelocidad=100;
//		
//		if (velocidad>limiteVelocidad) {
//			System.out.println ("multa");
//		}else {
//			System.out.println ("Vamos a una velocidad adecuada");
//		}
//		
//
//	}else if(velocidad>limiteVelocidad) {
//		System.out.println("Vas en una calle a alta velocidad Multa");
//	}else {
//		System.out.println("Vas en una calle a una velocidad adecuada");
//	}
		//SWICH CASE
		
		int Temperatura=32;
		switch (Temperatura) {
		case 10:
		
		System.out.println("Frio");
		break ;
		
		case 20:
		System.out.println("Clima agradable");
		break;
		
		case 30:
		System.out.println("Calor");
		break;
		
		case 40:
		System.out.println("Hace demasiado calor");
		break;
		
		default:
			System.out.println("Da igual");
			break;

		}
		
 }

}
