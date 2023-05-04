package labpratorio1;

import java.util.ArrayList;

abstract class Cliente {
	private int dias;
	private int quanttp;
	private Emprestimos e;
	
	
	public Cliente(int dias, int quanttp,Emprestimos e) {

		this.dias=dias;
		this.quanttp=quanttp;
		this.e=e;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public int getQuanttp() {
		return quanttp;
	}
	public void setQuanttp(int quanttp) {
		this.quanttp = quanttp;
	}
	public  int quantpubli(int g) {
		return g;
	}
	
	
	
}
