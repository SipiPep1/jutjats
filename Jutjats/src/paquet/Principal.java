package paquet;

public class Principal {

	public static void main(String[] args) {

		
		Principal m = new Principal();
		System.out.println("******PROGRAMA PER GESTIONAR JUTJATS*******\n");
		m.inicialitzacio();

	}

	public void inicialitzacio() {

		Judici judici001 = new Judici("Cas Fruita", "Robar menjar en una fruiteria");
		

		Jutja jutja001 = new Jutja("Toni Perellò");

		Acusat acusat001 = new Acusat("Bernat Sipi");

		Abogat abogat001 = new Abogat("Margalida Bonet");
		Abogat abogat002 = new Abogat("Joan Alzamora");

		judici001.setaAcusant(abogat001);
		judici001.setaDfensor(abogat002);
		judici001.setNomJutja(jutja001);
		judici001.setNomAcusat(acusat001);
		

		jutja001.afegirJudici(judici001);
		abogat001.afegirLlistaAcusant(judici001);
		
		acusat001.afegirJudicis(judici001);
		
		
		//System.out.println(jutja001);

		System.out.println(acusat001);

	}

}
