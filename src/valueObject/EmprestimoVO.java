package valueObject;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmprestimoVO {
	private LocalDate dataDevolucao;
	private LocalDate dataEmprestimo;
	private SituacaoLeitorVO situacaoLeitor;
	private ArrayList<LivroVO> livrosEmprestimo = new ArrayList<LivroVO> (); //
	
	public EmprestimoVO(ArrayList<LivroVO> livrosEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao)
	{
		this.setLivrosEmprestimo(livrosEmprestimo);
		this.setDataEmprestimo(dataEmprestimo);
		this.setDataDevolucao(dataDevolucao);
	}
	
	public ArrayList<LivroVO> getLivrosEmprestimo() {
		return livrosEmprestimo;
	}

	public void setLivrosEmprestimo(ArrayList<LivroVO> livrosEmprestimo) {
		this.livrosEmprestimo = livrosEmprestimo;
	}

	public void setSituacaoLeitorVO(SituacaoLeitorVO situacaoLeitor) {
		this.situacaoLeitor = situacaoLeitor;
	}
	
	public SituacaoLeitorVO getSituacaoLeitorVO() {
		return situacaoLeitor;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public void addLivro(LivroVO livro) {
		this.livrosEmprestimo.add(livro);
	}
	
	
	

}
