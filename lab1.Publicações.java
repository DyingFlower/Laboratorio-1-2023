package labpratorio1;

abstract class Publicações {
	private String titulo;
	private int ano;
	private String autor;
	private int quant;
	
	public Publicações(String titulo,int ano, String autor, int quant) {
		this.titulo=titulo;
		this.ano=ano;
		this.autor=autor;
		this.quant=quant;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	
	
}
