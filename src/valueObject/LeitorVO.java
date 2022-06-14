package valueObject;

public class LeitorVO {
	private int idLeitor;
	private String nome;
	
	public LeitorVO(int idLeitor, String nome)
	{
		this.setIdLeitor(idLeitor);
		this.setNome(nome);
	}
	
	public int getIdLeitor() {
		return idLeitor;
	}
	public void setIdLeitor(int idLeitor) {
		this.idLeitor = idLeitor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
