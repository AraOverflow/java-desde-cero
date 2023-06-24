package com.javadesdecero.sokects;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import com.javadesdecero.primerospasos.Alumno;

public class Hilo extends Thread {
	
	Socket socketRecibido;
	
	public Hilo(Socket socketRecibido) {
		this.socketRecibido = socketRecibido;
	}

	@Override
	public void run() {
		esperaConexion();
	}
	
	public void esperaConexion() {
		
		try {
			ObjectInputStream flujo_entrada = new ObjectInputStream(socketRecibido.getInputStream());
			Alumno alumnoRecibido = (Alumno)flujo_entrada.readObject();
			
			System.out.println("Mostrando esto desdel el servidor :" + alumnoRecibido.getNombre());
			
		
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
