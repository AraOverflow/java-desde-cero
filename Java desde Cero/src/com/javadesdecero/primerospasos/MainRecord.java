package com.javadesdecero.primerospasos;

import java.time.LocalDate;

public class MainRecord {

	public static void main(String[] args) {
		
		RecordTest recordTest = new RecordTest("Juan Jose", "Gomez", "12345763J", LocalDate.of(1982,01,17));
		
		System.out.println(recordTest.nombre());
		
		System.out.println(recordTest);
		
		RecordTest recordTest2 = new RecordTest("Pedro","Pacheco","23412e231");

		System.out.println(recordTest2);
	}

}
