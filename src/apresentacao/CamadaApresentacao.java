package apresentacao;

import java.util.ArrayList;

import dominio.EfetuarEmprestimo;
import valueObject.EmprestimoVO;
import valueObject.LeitorVO;
import valueObject.LivroVO;

public class CamadaApresentacao {

	private static LeitorVO leitor = new LeitorVO(1, "Niuan");
	private static LivroVO livro = new LivroVO(1, "Batman: Ano Um");
	private static ArrayList<EmprestimoVO> emprestimo = null;
	
	private static EfetuarEmprestimo efetuarEmprestimo = new EfetuarEmprestimo();
	
	public static void main(String[] args) {
		
		iniciarEmprestimo();
		emprestarLivro();
		encerrarEmprestimo();
			
	}

	
	private static void iniciarEmprestimo() {
		// TODO Auto-generated method stub
		efetuarEmprestimo.iniciarEmprestimo(leitor.getIdLeitor());
	}	
	
	private static void emprestarLivro() {
		// TODO Auto-generated method stub
		efetuarEmprestimo.emprestarLivro(livro.getIdLivro(), leitor.getIdLeitor(), emprestimo);
	}

	private static void encerrarEmprestimo() {
		// TODO Auto-generated method stub
		efetuarEmprestimo.encerrarEmprestimo(leitor.getIdLeitor(), livro.getIdLivro(), emprestimo);
		
	}


	
	
}
