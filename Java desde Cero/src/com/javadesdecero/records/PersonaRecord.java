package com.javadesdecero.records;

public record PersonaRecord(String nombre, String apellido, int id) {
	
	public PersonaRecord(String nombre, String apellido) {
		this(nombre, apellido, 000000);
	}
	
}
