package BattistaAntonellaRecuperatorio;

public class Espacio extends Gema implements IHechizable {

	public Espacio() {
		super("ESPACIO", 2);
	
	}

	@Override
	public void setHechizo() {

		this.setPoderAIncrementar(2);
	}
	
	

}
