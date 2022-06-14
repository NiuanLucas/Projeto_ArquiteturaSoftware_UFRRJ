package valueObject;

public class SituacaoLeitorVO {
	
private LeitorVO leitor;
private Boolean permiteEmprestimo;

public SituacaoLeitorVO(String nome, int idLeitor, Boolean permiteEmprestimo)
{
	this.leitor = new LeitorVO(idLeitor, nome);
	this.setPermiteEmprestimo(permiteEmprestimo);
	
}

public Boolean getPermiteEmprestimo() {
	return permiteEmprestimo;
}
public void setPermiteEmprestimo(Boolean permiteEmprestimo) {
	this.permiteEmprestimo = permiteEmprestimo;
}

public LeitorVO getLeitor() {
	return leitor;
}





}
