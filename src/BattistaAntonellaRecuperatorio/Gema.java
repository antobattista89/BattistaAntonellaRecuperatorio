package BattistaAntonellaRecuperatorio;

public class Gema {
	
	private String nombre;
	private Integer poderAIncrementar;
	
	public Gema(String nombre, Integer poderAIncrementar) {
		this.nombre = nombre;
		this.poderAIncrementar = poderAIncrementar;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPoderAIncrementar() {
		return poderAIncrementar;
	}

	public void setPoderAIncrementar(Integer poderAIncrementar) {
		this.poderAIncrementar = poderAIncrementar;
	}
	
}
