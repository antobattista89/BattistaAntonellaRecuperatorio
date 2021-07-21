package BattistaAntonellaRecuperatorio;

public class Batalla {

	Personaje heroe;
	Personaje villano;
	
	public Batalla(Personaje heroe, Personaje villano) {
		this.heroe = heroe;
		this.villano = villano;
	}
	
	public  Personaje getGanador()
	{
		
		if (heroe.getPoderActual() > villano.getPoderActual())
		{
			return heroe;
		}
		else
		{
			return villano;
		}
		
	}
	
	
	
}
