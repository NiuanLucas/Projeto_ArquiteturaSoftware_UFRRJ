package dados;


import java.util.ArrayList;

import valueObject.EmprestimoVO;
import valueObject.LeitorVO;
import valueObject.LivroVO;

import java.time.LocalDate;

public class EmprestimoMapper {

	
	//SIMULANDO UMA TABELA SQL
	ArrayList<EmprestimoVO> emprestimosDataTable = new ArrayList<EmprestimoVO> (); //
	
	//BUSCA NA BASE DE DADOS
	public ArrayList<EmprestimoVO> find(int idLivro) { 
		ArrayList<EmprestimoVO> emprestimo = null;
			for (int i = 0; i < emprestimosDataTable.size(); i++) { //PERCORRENDO A TABELA EMPRESTIMOS
				EmprestimoVO atualemprestimo = emprestimosDataTable.get(i);
					for(int j = 0 ; j < atualemprestimo.getLivrosEmprestimo().size(); j++) { //PERCORRENDO O ARRAY DE LIVROS NO EMPRESTIMO
						ArrayList<LivroVO> atualArrayLivro = atualemprestimo.getLivrosEmprestimo();
							if(atualArrayLivro.get(j).getIdLivro() == idLivro) {
								emprestimo.add(atualemprestimo);
							}		
						}
					}
			return emprestimo;
	}
	
	
	//BUSCA NA BASE DE DADOS
	public ArrayList<EmprestimoVO> find(LeitorVO leitor) { 
		int idLeitor = leitor.getIdLeitor();
		ArrayList<EmprestimoVO> emprestimo = null;
			for (int i = 0; i < emprestimosDataTable.size(); i++) { //PERCORRENDO A TABELA EMPRESTIMOS
				EmprestimoVO atualemprestimo = emprestimosDataTable.get(i);
							if(atualemprestimo.getSituacaoLeitorVO().getLeitor().getIdLeitor() == idLeitor) {
								emprestimo.add(atualemprestimo);
							}		
						
					}
			return emprestimo;
	}	
	
	
	
	//INSERE NA BASE DE DADOS
	public void insert(ArrayList<LivroVO> livrosEmprestimo, LocalDate dataDevolucao, LocalDate dataEmprestimo){ 
		EmprestimoVO novoEmprestimo = new EmprestimoVO(livrosEmprestimo, dataEmprestimo, dataDevolucao);
		emprestimosDataTable.add(novoEmprestimo); 
	}
	

	//ATUALIZA DA BASE DE DADOS 
	public void update(EmprestimoVO emprestimo){ 
		for (int i = 0; i < emprestimosDataTable.size(); i++) {
			EmprestimoVO atualEmprestimo = emprestimosDataTable.get(i);
		        if (atualEmprestimo.getLivrosEmprestimo() == emprestimo.getLivrosEmprestimo()) {
		        	atualEmprestimo.setLivrosEmprestimo(emprestimo.getLivrosEmprestimo());	
		        	atualEmprestimo.setDataDevolucao(emprestimo.getDataDevolucao());
		        	atualEmprestimo.setDataEmprestimo(emprestimo.getDataEmprestimo());
		        	atualEmprestimo.setSituacaoLeitorVO(emprestimo.getSituacaoLeitorVO());
		        }          
		}
	}
	
	
	//DELETA DA BASE DE DADOS
	public void delete(EmprestimoVO emprestimo){ 
		emprestimosDataTable.remove(emprestimo);
	}
	
	

}
