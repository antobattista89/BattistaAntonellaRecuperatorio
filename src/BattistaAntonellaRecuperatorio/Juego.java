package BattistaAntonellaRecuperatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Juego {

	private Map<String, Personaje> villanos;
	private Map<String, Personaje> heroes;
	private List<Batalla> batallas;
	private List<Personaje> villanosGanadores;
	private List<Personaje> heroesGanadores;
	
	public Juego() {
	
		this.villanos = new HashMap<String, Personaje>();
		this.heroes = new HashMap<String, Personaje>();
		this.batallas = new ArrayList<Batalla>();
		this.villanosGanadores = new ArrayList<Personaje>();
		this.heroesGanadores = new ArrayList<Personaje>();
		
	}


	public void agregarVillano(String nombre, Integer poderInicial) {

		this.villanos.put(nombre, new Villano(nombre, poderInicial));
		
	}


	public void agregarHeroe(String nombre, Integer poderInicial) {

		this.heroes.put(nombre, new Heroe(nombre, poderInicial));
		
	}

	public Integer cantidadDeVillanos()
	{
		return this.villanos.size();
	}
	
	public void obtenerGema(String nombrePersonaje, Gema gema)
	{
		Personaje personaje = null;
		
		personaje = this.heroes.get(nombrePersonaje);
		
		if (personaje != null)
		{
			personaje.obtieneGema(gema);
		}
		else
		{
			personaje = this.villanos.get(nombrePersonaje);
			personaje.obtieneGema(gema);
		}
			
	}		
	
	public Personaje getPersonaje(String nombrePersonaje)
	{
		Personaje personaje = null;
		
		personaje = this.heroes.get(nombrePersonaje);
		
		if (personaje == null)
		{
			personaje = this.villanos.get(nombrePersonaje);
		}
			
		return personaje;
	}		
		
	
	public void agregaBatalla(Personaje heroe, Personaje villano)
	{
		Batalla batalla = new Batalla(heroe, villano);
		
		this.batallas.add(batalla);
		
	}
		

	public void batallar()
	{
		Personaje ganador = null;
		
		for(Batalla batalla : this.batallas)
		{
			ganador = batalla.getGanador();
			
			if (ganador.getTipo().equals("Villano"))
			{
				this.villanosGanadores.add(ganador);
				
			}
			else
			{
				this.heroesGanadores.add(ganador);
			}

			
		}
	}

	public List<Personaje> getVillanosGanadores()
	{
		return this.villanosGanadores;
	}
	
	public List<Personaje> getHeroesGanadores()
	{
		return this.heroesGanadores;
	}
	
	public Boolean elMundoEstaASalvo() throws WorldDestroyedException
	{
		if (this.villanosGanadores.size() <= this.heroesGanadores.size() )
		{
			return true;
		}
		else
		{
			throw new WorldDestroyedException(); 
		}
	}
	
	
	
}
