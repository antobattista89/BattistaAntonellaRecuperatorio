package BattistaAntonellaRecuperatorio;

public class Tiempo extends Gema implements IHechizable {

	public Tiempo() {
		super("TIEMPO", 2);
	
	}

	@Override
	public void setHechizo() {

		this.setPoderAIncrementar(3);
	}
	
	

}
