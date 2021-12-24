package sistema.model;

public class Estoque {

	private int quantidade;
	
	public Estoque(Produto produto) {}
	
	public Estoque(Produto produto, int quantidade) {
		if(!produto.isEstoque()) {
			produto.getEstoque().quantidade = quantidade;
			
			produto.setEstoque(true);
		
		} 
		
	}
	
	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + "]";
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}
