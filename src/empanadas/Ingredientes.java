package empanadas;

public class Ingredientes {

	private String tipoDeMasa;
	private String relleno;
	
	public Ingredientes(String tipoDeMasa, String relleno) {
		this.tipoDeMasa = tipoDeMasa;
		this.relleno = relleno;
	}

	public String getTipoDeMasa() {
		return tipoDeMasa;
	}

	public void setTipoDeMasa(String tipoDeMasa) {
		this.tipoDeMasa = tipoDeMasa;
	}

	public String getRelleno() {
		return relleno;
	}

	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	
	
	
	
	
}
