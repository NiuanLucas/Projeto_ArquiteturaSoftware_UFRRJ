package dados;

import java.util.ArrayList;

import valueObject.LivroVO;

public class LivroMapper {

	//SIMULANDO UMA TABELA SQL
	private ArrayList<LivroVO> livrosDataTable = new ArrayList<LivroVO> (); //
	
	//BUSCA NA BASE DE DADOS
	public LivroVO find(int idLivro){ 
		LivroVO livro = null;
		for (int i = 0; i < livrosDataTable.size(); i++) {
			LivroVO atualLivro = livrosDataTable.get(i);
		        if (atualLivro.getIdLivro() == idLivro) {
		        	livro = atualLivro;
		        }          
			}
		return livro;
	}
	
	//INSERE NA BASE DE DADOS
	public void insert(LivroVO novolivro){ 
		livrosDataTable.add(novolivro); 
	}
	
	//ATUALIZA DA BASE DE DADOS 
	public void update(LivroVO livro){ 
		for (int i = 0; i < livrosDataTable.size(); i++) {
			LivroVO atualLivro = livrosDataTable.get(i);
	        if (atualLivro.getIdLivro() == livro.getIdLivro()) {
	        		atualLivro.setTitulo(livro.getTitulo());	
	        }          
		}
	}
	
	//DELETA DA BASE DE DADOS
	public void delete(LivroVO livro){ 
		livrosDataTable.remove(livro);
	}
	
	
}
