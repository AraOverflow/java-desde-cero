package com.javadesdecero.records;

public class Main {

	public static void main(String[] args) {
		
		PersonaRecord personaRecord = new PersonaRecord("Juan", "Gomez", 231112341);
		
		PersonaRecord personaRecord2 = new PersonaRecord("Daniel", "Gonzalez");
		
		System.out.println(personaRecord2.nombre( )+" " + personaRecord2.apellido()+" "+personaRecord2.id());

	}

}
