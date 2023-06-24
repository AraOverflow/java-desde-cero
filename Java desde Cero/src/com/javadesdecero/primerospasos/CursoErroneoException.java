package com.javadesdecero.primerospasos;

public class CursoErroneoException extends Exception {
	
	public CursoErroneoException() {
		super("El curso no puede ser mayor a 4");
	}

}
