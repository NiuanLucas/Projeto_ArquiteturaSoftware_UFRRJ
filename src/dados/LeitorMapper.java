package dados;

import valueObject.LeitorVO;
import java.util.ArrayList;

public class LeitorMapper {
	
	//SIMULANDO UMA TABELA SQL
	ArrayList<LeitorVO> leitoresDataTable = new ArrayList<LeitorVO> (); //
	
	//BUSCA NA BASE DE DADOS
	public LeitorVO find(int idLeitor){ 
		LeitorVO leitor = null;
		for (int i = 0; i < leitoresDataTable.size(); i++) {
			LeitorVO atualLeitor = leitoresDataTable.get(i);
		        if (atualLeitor.getIdLeitor() == idLeitor) {
		        	leitor = atualLeitor;
		        }          
			}
		return leitor;
	}
	
	//INSERE NA BASE DE DADOS
	public void insert(LeitorVO novoleitor){ 
		leitoresDataTable.add(novoleitor); 
	}
	
	//ATUALIZA DA BASE DE DADOS 
	public void update(LeitorVO leitor){ 
		for (int i = 0; i < leitoresDataTable.size(); i++) {
			LeitorVO atualLeitor = leitoresDataTable.get(i);
	        if (atualLeitor.getIdLeitor() == leitor.getIdLeitor()) {
	        		atualLeitor.setNome(leitor.getNome());	
	        }          
		}
	}
	
	//DELETA DA BASE DE DADOS
	public void delete(LeitorVO leitor){ 
		leitoresDataTable.remove(leitor);
	}
	
	
	
	
	

}
