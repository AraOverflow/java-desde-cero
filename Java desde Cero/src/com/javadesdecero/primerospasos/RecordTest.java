package com.javadesdecero.primerospasos;

import java.time.LocalDate;

public record RecordTest(String nombre, String Apellido, String NIF, LocalDate fechaNacimineto) {
	
	public RecordTest(String nombre, String Apellido, String NIF) {
		this(nombre, Apellido, NIF, LocalDate.MIN);
	}
	
}
