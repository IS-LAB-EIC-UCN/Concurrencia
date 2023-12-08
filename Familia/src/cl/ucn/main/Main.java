package cl.ucn.main;

import cl.ucn.interfaces.CajaDinero;
import cl.ucn.modelo.CajaChica;
import cl.ucn.modelo.Hijo1;
import cl.ucn.modelo.Hijo2;
import cl.ucn.modelo.Madre;
import cl.ucn.modelo.Padre;

public class Main {

	public static void main(String args[]) {


		CajaDinero cajaChica = new CajaChica();

		for (int i = 0; i < 10; i++)
		{

			Runnable padre = new Padre(cajaChica);
			Runnable madre = new Madre(cajaChica);
			Runnable hijo1 = new Hijo1(cajaChica);
			Runnable hijo2 = new Hijo2(cajaChica);

			Thread threadPadre = new Thread(padre);
			Thread threadMadre = new Thread(madre);
			Thread threadHijo1 = new Thread(hijo1);
			Thread threadHijo2 = new Thread(hijo2);

			threadHijo1.start();
			threadMadre.start();
			threadHijo2.start();
			threadPadre.start();


		}


	}
}
