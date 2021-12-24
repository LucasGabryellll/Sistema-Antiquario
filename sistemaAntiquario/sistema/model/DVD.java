package sistema.model;

public class DVD extends Produto {
	
	private String autor;
	private String genero;
	private int numFaixas;
	
	
	public DVD(String codBarras, double preco, String autor, String genero, int numFaixas) {
		super(codBarras, preco);
		this.autor = autor;
		this.genero = genero;
		this.numFaixas = numFaixas;
	
	}

	

	@Override
	public String toString() {
		return  super.toString() + "DVD [autor=" + autor + ", genero=" + genero + ", numFaixas=" + numFaixas + "]";
	}

	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
}
