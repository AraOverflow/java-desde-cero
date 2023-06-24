package com.javadesdecero.sokects;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		
		try {
			ServerSocket socketServidor = new ServerSocket(8765);
			
			while(true) {
				
				Socket socketRecibido = socketServidor.accept();
				
				Hilo hilo = new Hilo(socketRecibido);
				hilo.start();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
