package dominio;

import java.time.LocalDate;
import dados.EmprestimoMapper;
import dados.LeitorMapper;
import dados.LivroMapper;
import valueObject.EmprestimoVO;
import valueObject.LivroVO;
import valueObject.SituacaoLeitorVO;
import valueObject.LeitorVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EfetuarEmprestimo {
	
	LeitorMapper leitorMapper = new LeitorMapper();
	LivroMapper livroMapper = new LivroMapper();
	EmprestimoMapper emprestimoMapper = new EmprestimoMapper();
	
	public SituacaoLeitorVO iniciarEmprestimo(int idLeitor) {
		LeitorVO leitor = leitorMapper.find(idLeitor);
		ArrayList<EmprestimoVO> emprestimos_nao_concluidos = emprestimoMapper.find(idLeitor);
		SituacaoLeitorVO situacao_leitor = null;
				if(emprestimos_nao_concluidos.isEmpty()) {
					String nome = leitor.getNome();
					situacao_leitor = new SituacaoLeitorVO(nome,idLeitor, true);
				}
		return situacao_leitor;
	}
	

	public LocalDate emprestarLivro(int idLivro, int idLeitor, ArrayList<EmprestimoVO> emprestimo) {
		LivroVO livro = livroMapper.find(idLivro);
		
		LocalDate dataEmprestimo = LocalDate.now();
		LocalDate dataDevolucao = dataEmprestimo.plusDays(30);
		
		ArrayList<LivroVO> novosLivrosEmprestimo = new ArrayList<LivroVO>();
		ArrayList<EmprestimoVO> emprestimos_nao_concluidos = emprestimoMapper.find(idLeitor);
		EmprestimoVO novoEmprestimo = new EmprestimoVO(novosLivrosEmprestimo,dataEmprestimo,dataDevolucao);
		
		if(emprestimos_nao_concluidos.isEmpty()) {
			 novoEmprestimo.addLivro(livro);
		}
		
		//retornar a data de hoje + alguns dias
		return dataDevolucao;
	}
	
	
	public void encerrarEmprestimo(int idLeitor, int idLivro, ArrayList<EmprestimoVO> emprestimo ) {
		LivroVO livro = livroMapper.find(idLivro);
		ArrayList<EmprestimoVO> emprestimos_nao_concluidos = emprestimoMapper.find(idLivro);
		ArrayList<LivroVO> livrosEmprestimo = new ArrayList<LivroVO>();
		LocalDate dataEmprestimo = LocalDate.now();
		LocalDate dataDevolucao = dataEmprestimo.plusDays(30);
		
		if(emprestimos_nao_concluidos.isEmpty()) {
			emprestimoMapper.insert(livrosEmprestimo, dataDevolucao, dataEmprestimo);
		}
		
		
	}
	

}
