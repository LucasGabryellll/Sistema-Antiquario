package sistema.model;

public class Campanha implements BlackMinuto {

	private boolean isCapanha = true;
	
	public void disparar() {
		try {
			Thread.sleep(10000);
			if (isCapanha == true) {
				BlackMinuto.definirCampanha(null);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
