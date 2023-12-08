package cl.ucn.modelo;

import cl.ucn.interfaces.CajaDinero;

public class Madre implements  Runnable{

	CajaDinero cajaDinero;

	public Madre(CajaDinero cajaDinero) {
		this.cajaDinero = cajaDinero;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.cajaDinero.adicionar(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
