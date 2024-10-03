/*Devoir 1 OOP , Equipe 6 
 * Lokmen Abid 
 * */

package Exam1;
//j'importe la bibliothèque Scanner pour nous permet d'écrire de texte (par utilisateur)
import java.util.Scanner ;

public class GestionPersonnelSoignant {
	
	
	public static void main(String[] args) {
		//on écrit objet scan de la classe Scanner pour nous permettre d'utiliser leur methode 
		Scanner scan = new Scanner(System.in);

		// on écrit 3 objets (inf_1/inf_2/inf_3) de la classe Infirmier donnant les valeurs pour les attributs 
		Infirmier inf_1 = new Infirmier("François","Gotze",20,Departements.Pédiatrie) ; 
		Infirmier inf_2 = new Infirmier("Frankie","Alonso",25,Departements.Cardiologie) ; 
		Infirmier inf_3 = new Infirmier("Pablo","Mario",30,Departements.Pneumologie) ; 
		
		
		// affichage de prénom et nom pour les trois infirmiers 
		System.out.println(inf_1.getPrenom()+"\t"+inf_1.getnom());
		System.out.println(inf_2.getPrenom()+"\t\t"+inf_2.getnom());
		System.out.println(inf_3.getPrenom()+"\t\t"+inf_3.getnom());
		
		
		//on demande de utilisateur de donner des valeurs pour le nombre d'heure en utilisant methode scan.nextInt() 
		System.out.println("donner nbr heure pour deuxième infirmier"); 
		inf_2.SetnbHeure(3*scan.nextInt());
		System.out.println("donner nbr heure pour troisième infirmier"); 
		inf_3.SetnbHeure(2*scan.nextInt());
		
		
		// on utilisant la methode ajoutHeure de la classe infirmier on ajout des heures pour infirmier 1 
		inf_1.ajoutHeure(20);
		
		
		//on a afficher les attributs pour les trois infirmiers 
		System.out.println(inf_1.getPrenom()+"\t"+inf_1.getnom()+"\t\t"+inf_1.getNbHeure()+"\t\t"+inf_1.getEnuDepart());
		System.out.println(inf_2.getPrenom()+"\t\t"+inf_2.getnom()+"\t\t"+inf_2.getNbHeure()+"\t\t"+inf_2.getEnuDepart());
		System.out.println(inf_3.getPrenom()+"\t\t"+inf_3.getnom()+"\t\t"+inf_3.getNbHeure()+"\t\t"+inf_3.getEnuDepart());

				
	}
}
