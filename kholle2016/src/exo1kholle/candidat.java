package exo1kholle;

public class candidat implements Comparable {

	public String nom;
	public String prenom;
	public String numero;
	public int moyenne;
	
	public candidat(String nom, String prenom, String numero, int moyenne){
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.moyenne = moyenne;
	}
	
	public int compareTo(Object o){
		candidat c = (candidat)o;
		return this.numero.compareTo(c.getNumero());
	}
	
	private String getNumero() {
		return numero;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	int getMoyenne() {
		return moyenne;
	}
	
	public String toString(){
		return "candidat["+nom+ " " +prenom+ " numero : " +numero+ " moyenne : " +moyenne + "]";
	}
}
