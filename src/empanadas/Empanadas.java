package empanadas;

public class Empanadas {
	
	private Ingredientes ingredientes;
	private String coccion;
	private int precio;
	private String codigo;
	
	public Empanadas(Ingredientes ingredientes, String coccion, int precio, String codigo) {
		this.ingredientes = ingredientes;
		this.coccion = coccion;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Ingredientes getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredientes ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getCoccion() {
		return coccion;
	}

	public void setCoccion(String coccion) {
		this.coccion = coccion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return ingredientes.getRelleno() + " " + ingredientes.getTipoDeMasa();
	}
	
	
	
	
}