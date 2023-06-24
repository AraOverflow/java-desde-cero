package com.javadesdecero.primerospasos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTest {
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8765);
			
			while(true) {
				Socket socketRecibido = serverSocket.accept();
					Hilotest hilo = new Hilotest(socketRecibido);
					hilo.start();
					}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
