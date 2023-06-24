package com.javadesdecero.primerospasos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Foreach, como un for y sirve para recorrer, es una funcion final.
 * Sorted, ordenar segun el parametro que le pasemos
 * Distinc que nos va a eliminar los duplicados
 * Limit que nos va a mostrar solamente los primeros x elemntos
 * 
 * count nos devuelve el numero de elementos que tiene
 * collect que nos transforma el stream en una coleccion.
 * 
 * Filter que hace un filtro.
 * Map que modifica el stream.
 * Reduce, reduce todo el conjunto a un solo elemento.
 * 
 */

public class MainF {
	
	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList();
		
		alumnos.add(new Alumno("Juan","Perez",7));
		alumnos.add(new Alumno("Manuel","Rodriguez",5));
		alumnos.add(new Alumno("Antonio","Gonzalez",3));
		
		
		
		
		//Foreach
		alumnos.stream().parallel().forEach(x->System.out.println(x.getNombre()));
		
		
		//Filter
		alumnos.stream().filter(x -> x.getNotaMedia() < 7).forEach(x -> System.out.println(x.getNombre()));
		
		//Map
		List<String> listaNombres = alumnos.stream().
				map(x -> x.getNombre() + "- alumn").
				filter(x -> x.contains("o")).
				collect(Collectors.toList());
		
		listaNombres.forEach(System.out::println);
		
		//Reduce
		double notaMedia = alumnos.stream().map(x -> x.getNotaMedia()).reduce(0.0,(a,b) -> a + b)/alumnos.size();
		
		System.out.println(notaMedia);
		
	}

}
