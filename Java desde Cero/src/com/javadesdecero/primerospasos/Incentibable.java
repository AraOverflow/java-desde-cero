package com.javadesdecero.primerospasos;

public interface Incentibable {

	enum parking {SIN_DERECHO, EXTERIOR, CUBIERTO}
	enum seguro {SIN_COBERTURA, SIMPLE, COMPLETO}
	
	double incentivoMonetario();
	parking parking();
	seguro seguroMedico();
	int diasLibres();
}
