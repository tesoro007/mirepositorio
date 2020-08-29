package com.javabasic;

public class Tickets {
	//objetos
	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante=false;
	String costo;

	//Dentro del constructor van las instancias.
	public Tickets (int precioNormal,int edadPersona, boolean CredencialEstudiante ) { 
     
	 precioAdulto = precioNormal;
	 precioNino= precioNormal*(.85);
	 precioEstudiante= precioNormal * (.5);
	 costo="Precio Normal";
	 edad=edadPersona;
	 estudiante=CredencialEstudiante;
	 	 
	
}
	
	
	//Metodos
	 
	public void costodia() {
		 
		 System.out.println("El costo del ticket "  +costo);
	 }

	 public void precioAdulto() {
		 System.out.println("Ticket adulto: $"  +precioAdulto);
		 
		 	 }
	 
	 public void precioNino () {
		 System.out.println("Ticket Niño: $"  +precioNino);
		 
		 
	 }
	 
	 public void precioEstudiante() {
		 System.out.println("Ticket Estudianhte: $"  +precioEstudiante);
		 
	 }
	 
	 public void VerificardorCosto(){
		 if (estudiante==true) {
			 System.out.println("Eres un  ESTUDIANTE el precio del ticket es:  $"  +precioEstudiante);
		 }else if (edad<18) {
			 System.out.println("Eres un Adulto el precio del tcket es:  $"  +precioAdulto);
		 }else {
			 System.out.println("Eres un nino el precio del ticket es:  $"  +precioNino);
		 }
	 }
	 
	 //Sobre carga de metodos.
	 
	 public double sumarTickets() {
		 double suma= precioAdulto + precioNino;
		 System.out.println(suma);
		 return suma;
		 
	 }

	 public double sumarTickets(int descuento) {
		 double suma= (precioAdulto + precioNino)- descuento;
		 System.out.println(suma);
		 return suma; 
	 }
	 
	 public double sumarTickets(int descuento, int descuentoExtra) {
		 double suma= (precioAdulto + precioNino) - (descuento + descuentoExtra);
		 System.out.println(suma);
		 return suma; 
	 }
	 
	 
	 public double sumarlosTickets(int descuento, int descuentoExtra, double descuentoVa) {
		 double suma= (precioAdulto + precioNino) - (descuento + descuentoExtra)*descuentoVa;
		 System.out.println(suma);
		 return suma; 
		 
	 }
			 
	 public static void main(String[] args) {	
		
Tickets tickets= new Tickets(120, 19, true);

tickets.costodia();
tickets.precioAdulto();
tickets.precioNino();
tickets.precioEstudiante();

//tickets.sumarTickets(20, 20);
tickets.sumarlosTickets(10,10,5);

	}

}
