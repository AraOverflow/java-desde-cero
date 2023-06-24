package com.javadesdecero.primerospasos;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (!getEmpiezaJ().isEmpty()) {
			System.out.println(getEmpiezaJ().get().getNombre());
		}
		else {
			System.out.println("Predeterminado");
		}
		
		//Alumno alumno = getEmpiezaJ().orElse(new Alumno("Predeterminado", "Predeterminado", 0));
		//System.out.println(alumno.getNombre());
		
		//Alumno alumno = getEmpiezaJ().orElseGet(()->esNull());
		//System.out.println(alumno.getNombre());
		
	}
	
	public static Alumno esNull() {
		return new Alumno("Predeterminado", "Predeterminado", 0);
	}
	
	public static  Optional<Alumno> getEmpiezaJ() {
		ArrayList<Alumno> arrayNombres = new ArrayList();
		
		arrayNombres.add(new Alumno("Pedro", "Gonzalez", 4));
		arrayNombres.add(new Alumno("Antonio", "Perez", 7));
		arrayNombres.add(new Alumno("Juan", "Hernandez", 5));
		arrayNombres.add(new Alumno ("Maria", "Fernandez", 8));
		arrayNombres.add(new Alumno ("Jose", "Rodriguez", 9));
		
		Alumno alumno = null;
		
		for ( Alumno valor : arrayNombres) {
			if (valor.getNombre().startsWith("J")) {
				alumno = valor;
				break;
			}
		}

		//return alumno;

		return Optional.of(alumno);
		//return Optional.ofNullable(alumno);
	}

}
