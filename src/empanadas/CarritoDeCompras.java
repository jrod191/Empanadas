package empanadas;

import java.util.ArrayList;

public class CarritoDeCompras {
	
	private int total;
	private ArrayList <Empanadas> empanadas;
	
	public CarritoDeCompras() {
		total = 0;
		empanadas = new ArrayList <Empanadas>();
		
	}
	
	public void agregarEmpanada (Empanadas empanada) {
		empanadas.add(empanada);
		total = total+empanada.getPrecio();
		
	}
	
	public void eliminarEmpanada (Empanadas empanada) {
		empanadas.remove(empanada);
		total = total-empanada.getPrecio();
	}
	
	public void vaciarCarrito () {
		empanadas.clear();
		total = 0;
	}
	
	public void pagar () {
		System.out.println("**********BOLETA********** ");
		imprimirEmpanadas();
		System.out.println("Total: $ "+total);		
		
	}
	
	private void imprimirEmpanadas () {
		for (Empanadas aux:empanadas) {
			System.out.println(aux.toString());
		}
	}
	
	
	
}
