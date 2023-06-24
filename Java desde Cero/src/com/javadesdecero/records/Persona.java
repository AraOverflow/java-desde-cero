package com.javadesdecero.records;

import java.util.Objects;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int id;

	public Persona(String nombre, String apellido, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && id == other.id && Objects.equals(nombre, other.nombre);
	}
}
