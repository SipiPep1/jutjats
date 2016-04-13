package paquet;

import java.util.ArrayList;

public class Abogat {
/**canviiiiiiiiii*/
	private static int contador = 0;
	private String nom;
	private int identificador;
	ArrayList<Judici> llistaJudicisAcusant;
	ArrayList<Judici> llistaJudicisDefensor;

	public Abogat(String nom) {

		contador++;
		this.nom = nom;
		llistaJudicisAcusant = new ArrayList<>();
		llistaJudicisDefensor = new ArrayList<>();
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

	public ArrayList<Judici> getLlistaJudicisAcusant() {
		return llistaJudicisAcusant;
	}

	public ArrayList<Judici> getLlistaJudicisDefensor() {
		return llistaJudicisDefensor;
	}

	public void afegirLlistaAcusant(Judici nou) {

		llistaJudicisAcusant.add(nou);
	}

	public void afegirLlistaDefensor(Judici nou) {

		llistaJudicisDefensor.add(nou);
	}

	@Override
	public String toString() {
		return "Abogat [nom=" + nom + ", identificador=" + identificador + "\nLlista de judicis com a acusant="
				+ llistaJudicisAcusant + "\nLlista de judicis com a defensor=" + llistaJudicisDefensor + "]";
	}

}
