package paquet;

public class Judici {

	private static int contador = 0;
	private String nom;
	private int identificador;
	private Abogat aDefensor;
	private Abogat aAcusant;
	private String delicte;
	private Jutja nomJutja;
	private Acusat nomAcusat;

	public Judici(String nom, String delicte) {
		this.nom = nom;
		this.delicte=delicte;
	}

	public Judici(String nom, Abogat aDefensor, Abogat aAcusant, String delicte, Jutja nomJutja, Acusat nomAcusat) {

		contador++;
		this.nom = nom;
		this.aDefensor = aDefensor;
		this.aAcusant = aAcusant;
		this.delicte = delicte;
		this.nomJutja = nomJutja;
		this.nomAcusat = nomAcusat;
		identificador=contador;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Abogat getaDfensor() {
		return aDefensor;
	}

	public void setaDfensor(Abogat aDfensor) {
		this.aDefensor = aDfensor;
	}

	public Abogat getaAcusant() {
		return aAcusant;
	}

	public void setaAcusant(Abogat aAcusant) {
		this.aAcusant = aAcusant;
	}

	public String getDelicte() {
		return delicte;
	}

	public void setDelicte(String delicte) {
		this.delicte = delicte;
	}

	public Jutja getNomJutja() {
		return nomJutja;
	}

	public void setNomJutja(Jutja nomJutja) {
		this.nomJutja = nomJutja;
	}

	public Acusat getNomAcusat() {
		return nomAcusat;
	}

	public void setNomAcusat(Acusat nomAcusat) {
		this.nomAcusat = nomAcusat;
	}

	public int getIdentificador() {
		return identificador;
	}

	@Override
	public String toString() {
		return "Judici [\nIdentificador=" + identificador + "\nNom=" + nom + ",\nAbogat Defensor=" + aDefensor.getNom() + ",\nAbogat Acusant="
				+ aAcusant.getNom() + ",\nDelicte=" + delicte + ",\nJutja=" + nomJutja.getNom() + ",\nAcusat=" + nomAcusat.getNom() + "]\n\n";
	}
	
	

}
