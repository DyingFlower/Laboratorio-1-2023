package labpratorio1;

public class Professor extends Cliente {

	public Professor(int dias, int quanttp,Emprestimos e) {
		super(dias, quanttp,e);
		quantpubli(10);
	}

	public int quantpubli(int g) {	
		return super.quantpubli(g);
	}

}
