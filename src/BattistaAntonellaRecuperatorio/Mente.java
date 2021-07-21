package BattistaAntonellaRecuperatorio;

public class Mente extends Gema implements IHechizable {

	public Mente() {
		super("MENTE", 2);
	
	}

	@Override
	public void setHechizo() {

		this.setPoderAIncrementar(3);
	}
	
	

}
