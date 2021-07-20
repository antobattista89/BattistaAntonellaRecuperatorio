package BattistaAntonellaRecuperatorio;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {

	private String nombre;
	private Integer poderInicial;
	private String tipo;
	private List<Gema> gemas;
	
	public Personaje(String nombre, Integer poderInicial, String tipo) {
		this.nombre = nombre;
		this.poderInicial = poderInicial;
		this.gemas = new ArrayList<Gema>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getPoderInicial() {
		return this.poderInicial;
	}
	
	public void setPoderInicial(Integer poderInicial) {
		this.poderInicial = poderInicial;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Gema> getGemas() {
		return this.gemas;
	}

	public void obtieneGema(Gema gema) {
		this.gemas.add(gema);
	}
}
