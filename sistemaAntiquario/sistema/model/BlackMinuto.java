package sistema.model;

public interface BlackMinuto {
	
	public static final double cupomDesconto = 0.1;
	
	public static void definirCampanha(Produto produto) {
		produto.setPrecoPromocional(produto.getPreco() * cupomDesconto);
		
		produto.getPrecoPromocional();
	}

}
