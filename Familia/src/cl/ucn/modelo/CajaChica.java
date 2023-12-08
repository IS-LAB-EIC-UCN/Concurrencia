package cl.ucn.modelo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import cl.ucn.interfaces.CajaDinero;

public class CajaChica implements CajaDinero{

	int monto = 100000;

	private final Lock sincronizar = new ReentrantLock();
	private Condition saldoInsuficiente;


	public CajaChica () {

		this.saldoInsuficiente = this.sincronizar.newCondition();

	}

	//synchronized
	public synchronized void descontar(int cantidad) throws InterruptedException {
		// TODO Auto-generated method stub

		sincronizar.lock();
		try {

			while (monto - cantidad < 0) {

				wait();
			}

			this.monto =this.monto - cantidad;
			System.out.println(Thread.currentThread().getName());
			System.out.println("El total con el descuento es: " + this.monto);

			saldoInsuficiente.signalAll();

		}
		finally {
			sincronizar.unlock();
		}

	}

	public synchronized  void adicionar(int cantidad) throws InterruptedException {


		while (monto + cantidad > 100000) {
			wait();
		}

		this.monto = this.monto + cantidad;
		System.out.println(Thread.currentThread().getName());
		System.out.println("El total con la adicion es: " + this.monto);
		
		notifyAll();
	}
}
