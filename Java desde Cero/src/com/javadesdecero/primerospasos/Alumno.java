package com.javadesdecero.primerospasos;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private String nombre;
	private String apellido;
	private int curso;
	private double notaMedia;
	private double notas[] = new double[5];
	
	public Alumno(String nombre, String apellido, double notaMedia) {
		super.setNombre(nombre);
		super.setApellido(apellido);
		this.notaMedia = notaMedia;
	}
	
	public void calculoMedia(double medias[]) {
		double temp = 0;
		
		for (double valor : medias) {
		temp += valor;
		}
		this.notaMedia = temp/medias.length;
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) throws CursoErroneoException{
		if (curso > 4) {		
			this.curso = 4;
			throw new CursoErroneoException();
		}
		else if (curso > 0) {
			this.curso = curso;
		}
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}	
}
