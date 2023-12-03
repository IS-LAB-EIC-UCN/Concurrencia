package cl.ucn.modelo;

public class Hilos extends Thread{

	public void run() {
		
		for (int i=0; i<15; i++)
			System.out.println("Ejecutando Hilo" + this.getName());
		
	}
}
