package BattistaAntonellaRecuperatorio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class prubasReccuperatorio {


	@Test
	public void poderCrearUnJuegoYAgregarPersonajes() {
		
		Juego marvel = new Juego();
		
		marvel.agregarHeroe("Hulk", 1000);
		marvel.agregarHeroe("Thor", 800);
		marvel.agregarHeroe("Capitan America", 600);
		marvel.agregarHeroe("Black Widow", 100);
		marvel.agregarHeroe("Iron Man", 500);
		
		marvel.agregarVillano("Loki", 1000);
		marvel.agregarVillano("Ronnan", 800);
		marvel.agregarVillano("Red SKull", 600);
		marvel.agregarVillano("Hela", 500);
		marvel.agregarVillano("Soldado del Invierno", 100);

				
				
		
		assertEquals((Integer)5, marvel.cantidadDeVillanos());
	}
	
	
	@Test
	public void queUnPersonajeVeaIncrementadoSuPoderInicial() {
		
		Juego marvel = new Juego();
		
		marvel.agregarHeroe("Hulk", 1000);
		marvel.agregarHeroe("Thor", 800);
		marvel.agregarHeroe("Capitan America", 600);
		marvel.agregarHeroe("Black Widow", 100);
		marvel.agregarHeroe("Iron Man", 500);
		
		marvel.agregarVillano("Loki", 1000);
		marvel.agregarVillano("Ronnan", 800);
		marvel.agregarVillano("Red SKull", 600);
		marvel.agregarVillano("Hela", 500);
		marvel.agregarVillano("Soldado del Invierno", 100);

		Alma gemaAlma = new Alma();
		
		marvel.obtenerGema("Thor",gemaAlma);
		
		assertEquals((Integer)1600, marvel.getPersonaje("Thor").getPoderActual());

	}
	
	@Test
	public void queUnPersonajeVeaIncrementadoSuPoderInicialConHechizo() {
		
		Juego marvel = new Juego();
		
		marvel.agregarHeroe("Hulk", 1000);
		marvel.agregarHeroe("Thor", 800);
		marvel.agregarHeroe("Capitan America", 600);
		marvel.agregarHeroe("Black Widow", 100);
		marvel.agregarHeroe("Iron Man", 500);
		
		marvel.agregarVillano("Loki", 1000);
		marvel.agregarVillano("Ronnan", 800);
		marvel.agregarVillano("Red SKull", 600);
		marvel.agregarVillano("Hela", 500);
		marvel.agregarVillano("Soldado del Invierno", 100);

		Tiempo gemaTiempo= new Tiempo();
		
		gemaTiempo.setHechizo();
		
		marvel.obtenerGema("Thor", gemaTiempo);
		
		assertEquals((Integer)2400, marvel.getPersonaje("Thor").getPoderActual());

	}
	
	

	@Test
	public void queSePuedanGenerarBatallaYSeObtengaUnGanador() {
		
		Juego marvel = new Juego();
		
		marvel.agregarHeroe("Hulk", 1000);
		marvel.agregarHeroe("Thor", 800);
		marvel.agregarHeroe("Capitan America", 600);
		marvel.agregarHeroe("Black Widow", 100);
		marvel.agregarHeroe("Iron Man", 500);
		
		marvel.agregarVillano("Loki", 500);
		marvel.agregarVillano("Ronnan", 800);
		marvel.agregarVillano("Red SKull", 200);
		marvel.agregarVillano("Hela", 2000);
		marvel.agregarVillano("Soldado del Invierno", 100);

		Tiempo gemaTiempo= new Tiempo();
		
		gemaTiempo.setHechizo();
		
		marvel.obtenerGema("Thor", gemaTiempo);

		Personaje heroe = marvel.getPersonaje("Hulk");
		Personaje villano = marvel.getPersonaje("Loki");
		
		marvel.agregaBatalla(heroe, villano);

		marvel.batallar();
		
		assertEquals((Integer)1, (Integer)marvel.getHeroesGanadores().size());

	}
	

	@Test (expected = WorldDestroyedException.class)
	public void queNoSePudoVencerAThanos() throws WorldDestroyedException{
		
		Juego marvel = new Juego();
		
		marvel.agregarHeroe("Hulk", 1);
		marvel.agregarHeroe("Thor", 2);
		marvel.agregarHeroe("Capitan America", 3);
		marvel.agregarHeroe("Black Widow", 4);
		marvel.agregarHeroe("Iron Man", 500);
		
		marvel.agregarVillano("Loki", 500);
		marvel.agregarVillano("Ronnan", 800);
		marvel.agregarVillano("Red Skull", 200);
		marvel.agregarVillano("Hela", 2000);
		marvel.agregarVillano("Soldado del Invierno", 100);

		Tiempo gemaTiempo= new Tiempo();
		
		gemaTiempo.setHechizo();
		
		marvel.obtenerGema("Thor", gemaTiempo);
		
		marvel.agregaBatalla(marvel.getPersonaje("Hulk"), marvel.getPersonaje("Loki"));
		marvel.agregaBatalla(marvel.getPersonaje("Thor"), marvel.getPersonaje("Ronnan"));
		marvel.agregaBatalla(marvel.getPersonaje("Capitan America"), marvel.getPersonaje("Red Skull"));
		marvel.agregaBatalla(marvel.getPersonaje("Black Widow"), marvel.getPersonaje("Hela"));
		marvel.agregaBatalla(marvel.getPersonaje("Iron Man"), marvel.getPersonaje("Soldado del Invierno"));

		marvel.batallar();
		
		assertTrue(marvel.elMundoEstaASalvo());

	}

}	
