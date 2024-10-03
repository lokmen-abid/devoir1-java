/*Devoir 1 OOP , Equipe 6 
 * Lokmen Abid 
 */

package Exam1;


public class Infirmier {
	
	
	// Declaration des variables pour la classe infirmier 
	
	String prenom ; 
	String nom; 
	int nbHeure ; 
	Departements departement; 
	
	// Le constructeur suivants nous permet d'initialiser notre Objet
	
	public Infirmier (String Prenom, String Nom , int nbH , Departements Depart) {
		prenom = Prenom ; 
		nom = Nom; 
		nbHeure = nbH; 
		departement = Depart ; 
	}
	
	// methode mutateur pour le nombre d'heure de travail
	
	public void SetnbHeure (int nbh) {
		this.nbHeure=nbh ;
	}
		
	// methode pour ajouter les heures supplementaires 
	
	public void ajoutHeure(int supH) {
		this.nbHeure+=supH; 
	}
	
	// methode toString 
	
	public String toString() {
		return "\n\t prenom infirmier : "+prenom+
				"\n\\t nom infirmier :"+nom+
				"\n\t nombre d'heure infirmier :"+nbHeure+
				"\n\t departement infirmier :"+departement; 
	}
	
			
	
	/*Les methodes accesseurs suivants peut nous rendre les informations 
	avec les variables declares */
	public String getPrenom(){
		return prenom;  
	}
	
	public String getnom(){
		return nom;  
	}
	public int getNbHeure(){
		return nbHeure ;  
	}
	public Departements getEnuDepart(){
		return departement;    
	}
	
	
	
	public static void main(String[] args) { 
		
	}
	
	
}
