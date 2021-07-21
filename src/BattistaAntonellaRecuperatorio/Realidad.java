package BattistaAntonellaRecuperatorio;

public class Realidad extends Gema implements IHechizable {

	public Realidad() {
		super("REALIDAD", 2);
	
	}

	@Override
	public void setHechizo() {

		this.setPoderAIncrementar(2);
	}
	
	

}
