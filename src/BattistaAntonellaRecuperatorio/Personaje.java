package BattistaAntonellaRecuperatorio;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {

	private String nombre;
	private Integer poderInicial;
	private String tipo;
	List<Gema> gemas;
	
	public Personaje(String nombre, Integer poderInicial, String tipo) {
		this.nombre = nombre;
		this.poderInicial = poderInicial;
		this.tipo=tipo;
		this.gemas = new ArrayList<Gema>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPoderInicial() {
		return poderInicial;
	}

	public void setPoderInicial(Integer poderInicial) {
		this.poderInicial = poderInicial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Gema> getGemas() {
		return gemas;
	}

	public void setGemas(List<Gema> gemas) {
		this.gemas = gemas;
	}
}
