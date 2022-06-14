package valueObject;

public class LivroVO {
	private int idLivro;
	private String titulo;
	
	public LivroVO(int idLivro, String titulo) {
		this.setIdLivro(idLivro);
		this.setTitulo(titulo);
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
