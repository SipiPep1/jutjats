package paquet;

import java.util.ArrayList;

public class Acusat {

	private static int contador = 0;
	private String nom;
	private int identificador;
	ArrayList<Judici> llistaJudicis;
	

	public Acusat(String nom) {

		contador++;
		llistaJudicis = new ArrayList<>();
		this.nom = nom;
		identificador = contador;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdentificador() {
		return identificador;
	}

	public ArrayList<Judici> getLlistaJudicis() {
		return llistaJudicis;
	}
	
	public void afegirJudicis(Judici nou){
		llistaJudicis.add(nou);
	}

	@Override
	public String toString() {
		return "Acusat [nom=" + nom + ", identificador=" + identificador + ", llistaJudicis=" + llistaJudicis + "]";
	}

	
}
