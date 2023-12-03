package cl.ucn.concurrencia;

import cl.ucn.modelo.Hilos;

public class SincronizandoHilos {

	public static void main(String[] args) {

		Hilos hilo1 = new Hilos();
		Hilos hilo2 = new Hilos();


		hilo1.start();


		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		hilo2.start();
		System.out.println("Terminadas las tareas");
	}
}
