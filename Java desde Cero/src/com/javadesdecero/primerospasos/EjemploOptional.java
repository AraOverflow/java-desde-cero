package com.javadesdecero.primerospasos;

import java.util.ArrayList;
import java.util.Optional;

public class EjemploOptional {

	public static void main(String[] args) {

		//Alumno alumno = getEmpiezaJ().orElse(new Alumno("Predeterminado", "Predeterminado", 0));
		//System.out.println(alumno.getNombre());
		
		Alumno alumno = getEmpiezaJ().orElseGet(()->{return new Alumno("Predeterminado", "Predeterminado", 0);});
		System.out.println(alumno.getNombre());
	}
	
	public static Optional<Alumno> getEmpiezaJ() {
		
		ArrayList<Alumno> alumnos = new ArrayList();
		
		alumnos.add(new Alumno("Pedro","Gonzalez",4));
		alumnos.add(new Alumno("Antonio","Perez",6));
		alumnos.add(new Alumno("Huan","Hernandez",7));
		alumnos.add(new Alumno("Maria","Fernandez",9));
		alumnos.add(new Alumno("Jose","Rodriguez",2));
		
		Alumno alumno = null;
		
		for ( Alumno valor : alumnos) {
			if (valor.getNombre().startsWith("J")) {
				alumno = valor;
				break;
			}
		}
		
		return Optional.ofNullable(alumno);
	}

}
