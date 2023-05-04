package labpratorio1;

public class Aluno extends Cliente {

	public Aluno(int dias, int quanttp,Emprestimos e) {
		super(dias, quanttp, e);
		quantpubli(5);

	}

	@Override
	public int quantpubli(int g) {
		return super.quantpubli(g);
	}

}
