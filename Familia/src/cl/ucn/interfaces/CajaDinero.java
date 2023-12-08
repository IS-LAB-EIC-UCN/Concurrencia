package cl.ucn.interfaces;

public interface CajaDinero {

	public void descontar(int cantidad) throws InterruptedException;
	public void adicionar(int cantidad) throws InterruptedException;
}
