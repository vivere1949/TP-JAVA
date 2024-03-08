package tp4_JAVA;
import java.util.Scanner;
public class tp4 {

	public static void main(String[] args) {
		//exc 1 :
		 /*Scanner scanner = new Scanner(System.in);

	        // Demande à l'utilisateur d'entrer un entier positif
	        System.out.print("Entrez un entier positif : ");
	        int nombre = scanner.nextInt();

	        // Vérification de la validité de l'entrée
	        while (nombre <= 0) {
	            System.out.print("Veuillez entrer un entier positif : ");
	            nombre = scanner.nextInt();
	        }

	        // Affichage des diviseurs, leur nombre et la somme
	        int sommeDiviseurs = 0;
	        int nombreDiviseurs = 0;

	        System.out.print("Les diviseurs de " + nombre + " sont : ");
	        for (int i = 1; i <= nombre / 2; i++) {
	            if (nombre % i == 0) {
	                System.out.print(i + " ");
	                sommeDiviseurs += i;
	                nombreDiviseurs++;
	            }
	        }

	        // Ajout du nombre lui-même comme diviseur
	        System.out.print(nombre + " ");
	        sommeDiviseurs += nombre;
	        nombreDiviseurs++;

	        System.out.println("\nLe nombre total de diviseurs est : " + nombreDiviseurs);
	        System.out.println("La somme des diviseurs est : " + sommeDiviseurs);*/
		
		//exc 2 :
		
		/*Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer l'heure
        System.out.print("Entrez l'heure : ");
        int heure = scanner.nextInt();

        // Demande à l'utilisateur d'entrer les minutes
        System.out.print("Entrez les minutes : ");
        int minutes = scanner.nextInt();

        // Calcul de l'heure une minute plus tard
        minutes++; // Ajoute une minute

        // Si les minutes dépassent 59, ajuster l'heure
        if (minutes >= 60) {
            heure++;  // Ajoute une heure
            minutes = 0;  // Réinitialise les minutes à 0
        }

        // Si l'heure dépasse 23, revenir à 0
        if (heure >= 24) {
            heure = 0;
        }

        // Affichage de l'heure une minute plus tard
        System.out.println("Dans une minute, il sera " + heure + " heure(s) " + minutes + " minute(s).");

        scanner.close();*/
		
		//exc 3 :
		
		/*Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier positif supérieur à 1 : ");
        int n = scanner.nextInt();

        // Vérifier si n est un nombre parfait
        if (estNombreParfait(n)) {
            System.out.println(n + " est un nombre parfait.");
        } else {
            System.out.println(n + " n'est pas un nombre parfait.");
        }

        scanner.close();
    }

    public static boolean estNombreParfait(int n) {
        if (n <= 1) {
            return false;
        }

        int sommeDiviseurs = 1; // Initialiser avec 1 (car 1 est un diviseur de n)
        
        // Parcourir les nombres de 2 à n/2 (inclusivement)
        for (int i = 2; i <= n / 2; i++) {
            // Si i est un diviseur de n, l'ajouter à la somme
            if (n % i == 0) {
                sommeDiviseurs += i;
            }
        }
        
        // Vérifier si la somme des diviseurs est égale à n
        return sommeDiviseurs == n;
*/
		
		//exc 4 : 
		
		/*Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier entier (n) : ");
        int n = scanner.nextInt();

        System.out.print("Entrer le deuxième entier (m) : ");
        int m = scanner.nextInt();

        // Vérifier si les nombres n et m sont des nombres amis
        if (sontNombresAmis(n, m)) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }

        scanner.close();*/
   

    /*public static boolean sontNombresAmis(int n, int m) {
        // Calculer la somme des diviseurs de n et m
        int sommeDiviseursN = sommeDiviseurs(n);
        int sommeDiviseursM = sommeDiviseurs(m);

        // Vérifier si les sommes sont égales
        return (sommeDiviseursN == m) && (sommeDiviseursM == n);
    }

    public static int sommeDiviseurs(int nombre) {
        int somme = 0;
        for (int i = 2; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }
        return somme;*/
	
	    //exc 5 :
	   
		/*final int NOMBRE_JOUEURS = 22;
        int[] butsJoueurs = new int[NOMBRE_JOUEURS];

        Scanner scanner = new Scanner(System.in);

        // Entrer le nombre de buts inscrits par chaque joueur
        for (int i = 0; i < NOMBRE_JOUEURS; i++) {
            System.out.print("Entrer le nombre de buts pour le joueur " + (i + 1) + " : ");
            butsJoueurs[i] = scanner.nextInt();
        }

        // Afficher le numéro du buteur de l'équipe
        System.out.println("\nNuméro du buteur de l'équipe :");
        for (int i = 0; i < NOMBRE_JOUEURS; i++) {
            if (butsJoueurs[i] > 0) {
                System.out.println("Joueur " + (i + 1));
            }
        }

        // Calculer le nombre total des buts inscrits par l'équipe
        int totalButs = 0;
        for (int i = 0; i < NOMBRE_JOUEURS; i++) {
            totalButs += butsJoueurs[i];
        }
        System.out.println("\nNombre total de buts inscrits par l'équipe : " + totalButs);

        // Afficher le nombre de joueurs qui n'ont pas marqué de buts
        int joueursSansBut = 0;
        for (int i = 0; i < NOMBRE_JOUEURS; i++) {
            if (butsJoueurs[i] == 0) {
                joueursSansBut++;
            }
        }
        System.out.println("\nNombre de joueurs qui n'ont pas marqué de buts : " + joueursSansBut);

        // Mettre à jour le nombre de buts pour le joueur numéro 9
        System.out.print("\nEntrer le nombre de buts pour le joueur numéro 9 : ");
        int nouveauxButsJoueur9 = scanner.nextInt();
        butsJoueurs[8] = nouveauxButsJoueur9;

        // Afficher le tableau mis à jour
        System.out.println("\nTableau des buts mis à jour :");
        for (int i = 0; i < NOMBRE_JOUEURS; i++) {
            System.out.println("Joueur " + (i + 1) + " : " + butsJoueurs[i]);
        }

        scanner.close();*/
		
		//exc 6 : 
		
		/*Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le poids en kg : ");
        double poids = scanner.nextDouble();

        System.out.print("Entrer la taille en m : ");
        double taille = scanner.nextDouble();

        System.out.print("Entrer le sexe (F pour Femme, H pour Homme) : ");
        char sexe = scanner.next().charAt(0);

        double imc = poids / (taille * taille);

        System.out.println("\nL'IMC est : " + imc);

        // Déterminer l'état de poids en fonction du sexe et de l'IMC
        String etatPoids = "";

        if (sexe == 'F' || sexe == 'f') {
            if (imc < 19) {
                etatPoids = "Maigreur";
            } else if (imc >= 19 && imc < 24) {
                etatPoids = "Poids normal";
            } else if (imc >= 24 && imc < 30) {
                etatPoids = "Surcharge pondérale";
            } else if (imc >= 30 && imc < 40) {
                etatPoids = "Adiposité";
            } else {
                etatPoids = "Obésité";
            }
        } else if (sexe == 'H' || sexe == 'h') {
            if (imc < 20) {
                etatPoids = "Maigreur";
            } else if (imc >= 20 && imc < 25) {
                etatPoids = "Poids normal";
            } else if (imc >= 25 && imc < 30) {
                etatPoids = "Surcharge pondérale";
            } else if (imc >= 30 && imc < 40) {
                etatPoids = "Adiposité";
            } else {
                etatPoids = "Obésité";
            }
        } else {
            etatPoids = "Sexe non reconnu";
        }

        System.out.println("Etat de poids : " + etatPoids);

        scanner.close();*/
		
		//exc 7 : 
		
		/*Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer l'âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrer le sexe (H pour Homme, F pour Femme) : ");
        char sexe = scanner.next().charAt(0);

        boolean imposable = false;

        if (sexe == 'H' || sexe == 'h') {
            // Homme de plus de 20 ans
            if (age > 20) {
                imposable = true;
            }
        } else if (sexe == 'F' || sexe == 'f') {
            // Femme entre 18 et 35 ans
            if (age >= 18 && age <= 35) {
                imposable = true;
            }
        }

        if (imposable) {
            System.out.println("La personne est imposable.");
        } else {
            System.out.println("La personne n'est pas imposable.");
        }

        scanner.close();*/

		
		
		
	
	}

}
