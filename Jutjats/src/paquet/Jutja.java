package paquet;

import java.util.ArrayList;

public class Jutja {

	private static int contador = 0;
	private String nom;
	private int identificador;
	ArrayList<Judici> llistaCasos;

	public Jutja(String nom) {
		llistaCasos = new ArrayList<>();
		contador++;
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

	public ArrayList<Judici> getLlistaCasos() {
		return llistaCasos;
	}

	public void afegirJudici(Judici nou){
		llistaCasos.add(nou);
	}

	@Override
	public String toString() {
		return "Jutja [Identificador=" + identificador + "Nom=" + nom +  "\nLlista de Casos=" + llistaCasos + "]";
	}
	
	
}
