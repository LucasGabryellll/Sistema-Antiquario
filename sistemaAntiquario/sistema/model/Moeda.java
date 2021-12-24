package sistema.model;

public class Moeda extends Produto {

	private String tipo;
	private double valor;
	private int anoLancamento;
	private String pais;
	private String estado;
	
	
	public Moeda(String codBarras, double preco, String tipo, double valor, int anoLancamento,
			String pais, String estado) {
		super(codBarras, preco);
		this.tipo = tipo;
		this.valor = valor;
		this.anoLancamento = anoLancamento;
		this.pais = pais;
		this.estado = estado;
	}


	@Override
	public String toString() {
		return super.toString() + "Moeda [tipo=" + tipo + ", valor=" + valor + ", anoLancamento=" + anoLancamento + ", pais=" + pais
				+ ", estado=" + estado + "]";
	}


	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
