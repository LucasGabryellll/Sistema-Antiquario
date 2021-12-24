package sistema.model;

public class Livro extends Produto {

	private String isbn;
	private String titulo;
	private String autor;
	private String editora;
	private int volume;
	private int ano;
	
	public Livro(String codBarras, double preco, String isbn, String titulo, String autor,
			String editora, int volume, int ano) {
		super(codBarras, preco);
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.volume = volume;
		this.ano = ano;
		
//		setEstoque(new Estoque(this));
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "Livro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", volume="
				+ volume + ", ano=" + ano  + "]";
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
