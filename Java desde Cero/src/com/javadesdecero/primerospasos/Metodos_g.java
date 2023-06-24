package com.javadesdecero.primerospasos;

import java.util.ArrayList;

public class Metodos_g {
	
	public <t extends Incentibable> double mostrar(t dato) {
		
		return dato.incentivoMonetario();
		
	}
	
	public void metodo (ArrayList<? extends Persona> personas) {
		personas.size();
	}

}
