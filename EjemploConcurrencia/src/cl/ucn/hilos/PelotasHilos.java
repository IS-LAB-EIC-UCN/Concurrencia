package cl.ucn.hilos;

import java.awt.Component;

import cl.ucn.modelo.Pelota;

public class PelotasHilos implements Runnable {

	private Pelota pelota;
	private Component lamina;
	
	public PelotasHilos(Pelota pelota, Component lamina ) {
		
		this.pelota = pelota;
		this.lamina = lamina;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=3000; i++){
			
			pelota.mueve_pelota(lamina.getBounds());
			
			lamina.paint(lamina.getGraphics());
			
			
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
