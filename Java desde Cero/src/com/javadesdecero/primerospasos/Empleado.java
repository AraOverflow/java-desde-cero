package com.javadesdecero.primerospasos;

public class Empleado extends Persona {

	String nombre;
	String apellido;
	String categoria;
	double salario = 1200;
	String modalidad;
	
	public Empleado(String nombre, String apellido, String modalidad) {
		super.setNombre(nombre);
		super.setApellido(apellido);
		this.modalidad = modalidad;
	}
}
