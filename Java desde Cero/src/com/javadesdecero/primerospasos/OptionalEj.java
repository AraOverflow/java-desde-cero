package com.javadesdecero.primerospasos;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalEj {

	public static void main(String[] args) {
	
		//Alumno alumno = getEmpiezaJ().orElse(new Alumno("Predeterminado", "Predeterminado", 0));
		//System.out.println(alumno.getNombre());
		
		Alumno alumno = getEmpiezaJ().orElseGet(()->{return new Alumno("Predeterminado", "Predeterminado", 0);});
		System.out.println(alumno.getNombre());

	}
	
	//public static Alumno esNull() {
		//return new Alumno("Predeterminado", "Predeterminado", 0);
	//}
	
	public static Optional<Alumno> getEmpiezaJ() {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList();
		
		listaAlumnos.add(new Alumno("Pedro", "Gonzalez", 4));
		listaAlumnos.add(new Alumno("Antonio", "Perez", 5));
		listaAlumnos.add(new Alumno("Huan", "Hernandez", 7));
		listaAlumnos.add(new Alumno("Maria", "Fernandez", 9));
		listaAlumnos.add(new Alumno("Hose", "Rodriguez", 3));
		
		Alumno alumno = null;
		
		for(Alumno valor : listaAlumnos) {
			if(valor.getNombre().startsWith("J")) {
				alumno = valor;
				break;
			}
		}
		
		return Optional.ofNullable(alumno);
	}

}
