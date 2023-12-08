package cl.ucn.modelo;

import cl.ucn.interfaces.CajaDinero;

public class Hijo1 implements  Runnable{

	CajaDinero cajaDinero;
	public Hijo1(CajaDinero cajaDinero) {

		this.cajaDinero = cajaDinero;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.cajaDinero.descontar(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
