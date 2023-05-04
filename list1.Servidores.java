package labpratorio1;

public class Servidores extends Cliente{

	public Servidores(int dias, int quanttp,Emprestimos e) {
		super(dias, quanttp,e);
		quantpubli(7);
	}

	public int quantpubli(int g) {
		return super.quantpubli(g);
	}
	

}
