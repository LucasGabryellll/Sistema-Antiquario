package sistema.model;

public abstract class Produto {

	private Estoque estoque;
	private String codBarras;
	private double preco;
	private double precoPromocional;
	private boolean isEstoque;
	
	public Produto(String codBarras, double preco) {
		super();
		this.codBarras = codBarras;
		this.preco = preco;
		
		precoPromocional = 0;
	
		estoque = new Estoque(this);
	}
	
	
	@Override
	public String toString() {
		return "Produto [Quantidade em Estoque:" + estoque + ", "
					  + "codBarras: " + codBarras + ", "
					  + "Preco: " + preco 
					  + ", Preço Promocional: " + precoPromocional +  "]";
	}



	public boolean isEstoque() {
		return isEstoque;
	}
	
	public void setEstoque(boolean isEstoque) {
		this.isEstoque = isEstoque;
	}

	public Estoque getEstoque() {
		return estoque;
	}
	
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public String getCodBarras() {
		return codBarras;
	}
	
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPrecoPromocional() {
		return precoPromocional;
	}
	
	public void setPrecoPromocional(double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}
}
