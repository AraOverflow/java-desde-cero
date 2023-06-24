package com.javadesdecero.primerospasos;

public class ProgramadorJunior extends Empleado implements Incentibable{

	int antigüedad;
	
	public ProgramadorJunior() {
		super("Juan", "Prieto", "teletrabajo");
	}
	
	public ProgramadorJunior(String nombre, String apellido, String modalidad, int antigüedad) {
		super(nombre, apellido, modalidad);
		this.antigüedad = antigüedad;
	}
	
	public double calculoSalario() {
		return super.salario + incentivoMonetario();
	}
	
	public double calculoSalario(double cantidad) {
		return super.salario + incentivoMonetario() + cantidad;
	}
	
		
	@Override
	public double incentivoMonetario() {
		if (antigüedad < 2) {
			return 50;
		}
		return 100;
	}
	
	@Override
	public parking parking() {
		if (antigüedad < 2) {
			return parking.SIN_DERECHO;
		}
		return parking.EXTERIOR;
	}
	
	@Override
	public seguro seguroMedico() {
		if (antigüedad < 2) {
			return seguro.SIN_COBERTURA;
		}
		return seguro.SIMPLE;
	}
	
	@Override
	public int diasLibres()
	{
		if (antigüedad < 2) {
			return 1;
		}
		return 3;
	}
}
