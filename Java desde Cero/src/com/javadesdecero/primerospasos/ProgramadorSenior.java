package com.javadesdecero.primerospasos;

public class ProgramadorSenior extends Empleado implements Incentibable{

	int antigüedad;
	
	public ProgramadorSenior(String nombre, String apellido, String modalidad, int antigüedad) {
		super(nombre, apellido, modalidad);
		this.antigüedad = antigüedad;
	}
	
	public double caluloSalario() {
		return super.salario + incentivoMonetario();
	}
	
	@Override
	public double incentivoMonetario() {
		if (antigüedad < 5) {
			return 500;
		}
		return 800;
	}
	
	@Override
	public parking parking() {
		if (antigüedad < 5) {
			return parking.EXTERIOR;
		}
		return parking.CUBIERTO;
	}
	
	@Override
	public seguro seguroMedico() {
		if (antigüedad < 5) {
			return seguro.SIMPLE;
		}
		return seguro.COMPLETO;
	}
	
	@Override
	public int diasLibres()
	{
		if (antigüedad < 5) {
			return 5;
		}
		return 7;
	}
}
