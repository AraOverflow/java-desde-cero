package com.javadesdecero.primerospasos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Hilotest extends Thread{
	
	Socket socketRecibido;
	
	public Hilotest(Socket socketRecibido)
	{
		this.socketRecibido = socketRecibido;
	}

	@Override
	public void run() {
		esperaConexiones();
	}
	
public void esperaConexiones() {
		
		try {
			
			ObjectInputStream flujo_entrada = new ObjectInputStream(socketRecibido.getInputStream());
			Alumno alumnoRecibido = (Alumno) flujo_entrada.readObject();
			System.out.println("Nombre recibido en el servidor: " + alumnoRecibido.getNombre());
				
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
