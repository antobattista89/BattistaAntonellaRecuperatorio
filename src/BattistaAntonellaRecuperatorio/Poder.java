package BattistaAntonellaRecuperatorio;

public class Poder extends Gema implements IHechizable {

	public Poder() {
		super("PODER", 2);
	
	}

	@Override
	public void setHechizo() {

		this.setPoderAIncrementar(3);
	}
	
	

}
