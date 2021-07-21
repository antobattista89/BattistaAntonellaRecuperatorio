package BattistaAntonellaRecuperatorio;

public class Alma extends Gema implements IHechizable {

	public Alma() {
		super("ALMA", 2);
	
	}

	@Override
	public void setHechizo() {

		this.setPoderAIncrementar(2);
	}
	
	

}
