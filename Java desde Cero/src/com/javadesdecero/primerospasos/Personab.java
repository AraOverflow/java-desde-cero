package com.javadesdecero.primerospasos;
import java.util.Objects;

public class Personab {
    private String nombre;
    private String apellidos;
    private int id;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return id;
    }
    public void setEdad(int edad) {
        this.id = edad;
    }
    public Personab (String nombre, String apellidos, int edad) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = edad;
    }
    @Override
    public int hashCode() {
        return Objects.hash(apellidos, id, nombre);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personab other = (Personab) obj;
        return Objects.equals(apellidos, other.apellidos) && id == other.id && Objects.equals(nombre, other.nombre);
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + id + "]";
    }





}