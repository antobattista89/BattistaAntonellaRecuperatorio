package BattistaAntonellaRecuperatorio;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje{

	private String nombre;
	private Integer poderInicial;
	private Integer poderActualizado;
	private String tipo;
	private List<Gema> gemas;
	
	public Personaje(String nombre, Integer poderInicial, String tipo) {
		this.nombre = nombre;
		this.poderInicial = poderInicial;
		this.tipo = tipo;
		this.gemas = new ArrayList<Gema>();
		this.poderActualizado = poderInicial;
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
		
		this.poderActualizado = this.poderInicial * gema.getPoderAIncrementar();
		
	}
	
	public Integer getPoderActual() {
		return this.poderActualizado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
