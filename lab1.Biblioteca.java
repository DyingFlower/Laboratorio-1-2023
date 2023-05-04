package labpratorio1;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Cliente> listac = new ArrayList<>();
	
	public Biblioteca(ArrayList<Cliente> listac) {
		this.listac=listac;
	}
	public void listadeuso() {
		for(int i=0;i<listac.size();i++) {
			listac.get(i).getEmprestimo() // get e set animal
		}
	}
}
