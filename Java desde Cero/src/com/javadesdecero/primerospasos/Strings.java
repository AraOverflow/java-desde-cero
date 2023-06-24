package com.javadesdecero.primerospasos;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "Hola soy un String";
		String string2 = "Y yo tambien soy un String";
		String string3 = "Hola soy Un String";
		
		String string4 = " ";
		String string5 = "";
		
		System.out.println(string1.length());//el tamaño del String.
		System.out.println(string1.toLowerCase());//pasar todo el String a minusculas
		System.out.println(string1.toUpperCase());//pasa todo el String a Mayusculas
		System.out.println(string1.charAt(6)); //Va a devolver el caracter correspondiente al indicado
		System.out.println(string1.concat(string2));// concatena un String con otro
		System.out.println(string1.equals(string3));//Devuelve True si son iguales
		System.out.println(string1.equalsIgnoreCase(string3)); //Devuelve True si son iguales ignorando Mayusculas/Minusculas
		System.out.println(string1.indexOf('a')); //Devuelve la posición de ese caracter
		System.out.println(string1.contains("HOla"));//Devuelve True o False si se encuentra esa cadena
		System.out.println(string1.strip());//Devuelve un String eliminando los caracteres en blanco del principio y del final
		System.out.println(string1.replace('o', 'a')); //Sustituir un caracter por otro
		System.out.println(string1.startsWith("HOla")); //Devuelve True si el String empieza por el argumento
		System.out.println(string1.endsWith("StRing")); //Devulve True si el Strin acaba por el argumento
		System.out.println(string5.isBlank()); //Devuelve True si el contendio es vacío o en Blanco.
		System.out.println(string5.isEmpty()); //Devuelve True si no hay contenido.
		System.out.println(string1.substring(1,6)); //Devuelve un substring que empieza con el primer argumento y acaba en el segundo no incluido.
		System.out.println(string1.matches("[0-9]+"));
		char[] arrayCaracteres = string1.toCharArray();
		System.out.println(arrayCaracteres);
		
		
	}

}
