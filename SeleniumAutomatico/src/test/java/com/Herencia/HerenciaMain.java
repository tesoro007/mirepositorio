package com.Herencia;

public class HerenciaMain {

	public static void main(String [] args) {
		
		Empleado Pedro= new Empleado();
		
		Pedro.setNombre("Pedro");
		Pedro.setEdad(20);
        Pedro.setSexo('M');
        
        Pedro.setNumeroEmpleado(1521);
        Pedro.setPuesto("TESTER JR");
        Pedro.setDeparamento("SISTEMAS");
        
        System.out.println("Nombre del empleado: " + Pedro.getNombre());
        System.out.println("Puesto del empleado " + Pedro.getPuesto());

	}

}
