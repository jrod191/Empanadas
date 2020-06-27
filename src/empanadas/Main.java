package empanadas;

public class Main {
	
	public static void main(String[] args) {
	
	Empanadas quesochoclo = new Empanadas(new Ingredientes("hojaldre", "Queso Choclo"), "Horno",1800, "E01");
    Empanadas pino = new Empanadas(new Ingredientes("Clasica", "Pino"), "Horno",1800, "E02");
    Empanadas queso = new Empanadas(new Ingredientes("hojaldre", "Queso "), "Frita",1600, "E03");
	
 
    CarritoDeCompras carrito =  new CarritoDeCompras();
    carrito.agregarEmpanada(pino);
    carrito.agregarEmpanada(quesochoclo);
    carrito.agregarEmpanada(queso);
    carrito.pagar();
    
    
	
	
}
}
