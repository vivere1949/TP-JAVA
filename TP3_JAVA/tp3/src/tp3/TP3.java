package tp3;
import java.util.Scanner;
import java.util.ArrayList;

public class TP3 {

	public static void main(String[] args) {
	        
	     // exc 1 (déclaration d'un tableau) : 
			
			//int i=0;
	         /*int[] tab = {1,2,3,4,5}; //déclaration et initialisation d'un tableau de 5 entiers
	         
	         //méthode 1 : 
	          * 
	         for (i=0;i<5;i++) {
	        	 System.out.println("la valeur " +(i+1)+ " du tableau est : " +tab[i]); 
	         }*/
	         
			 //méthode 2 :
			
			/*int[] tableau = new int [5]; //déclaration de la taille du tableau
			int i=0;
			 Scanner nc = new Scanner(System.in);
			 
			 for(i=0;i<5;i++){
				 System.out.print("entrer le valeur " +(i+1)+ " du tableau : ");
	             tableau[i] = nc.nextInt();			 
			 }
			 //affichage :
			 for (i=0;i<5;i++) {
				 System.out.println("element " +(i+1)+ " du tableau est : " +tableau[i]);
			 }*/
			
			//exc 2 :
			/*int [] tab = new int[10];
			int i=0;
			Scanner nc = new Scanner(System.in);
			//remplissage :
			for(i=0;i<10;i++) {
				System.out.print("entrer l'element " +(i+1)+ " du tableau ");
				tab[i] = nc.nextInt();		
			}
			//affichage :
			for(i=0;i<10;i++) {
				System.out.println("element " +(i+1)+ " : " +tab[i]);
			}*/
			
			//exc 3 : 
			
			/*int i=0,taille=0;
			int [] tab = null;
			
			Scanner nc = new Scanner(System.in);
			for (i=0 ; i<=50; i++) {
				System.out.print("entrer la taille du tableau : ");
				taille = nc.nextInt();
				if(taille >= 10 || taille >= 50){
					tab = new int[taille];
					break;
				}
				else {
					System.out.println("la taille doit etre comprise entre 10 et 50 ");
				}	
			}
			//remplissage :
			for(i=0;i<10;i++) {
				System.out.println("entrer l'element " +(i+1)+ " du tableau ");
				tab[i] = nc.nextInt();		
			}
			
			//affichage : 
			for (i=0;i<taille;i++) {
				System.out.println("element " +(i+1)+ " est : " +tab[i]);
			}*/
			
			//exc 4 : 
			
			/*int i=0,taille=0;
			int [] tab = null;
			
			Scanner nc = new Scanner(System.in);
			for (i=0 ; i<=50; i++) {
				System.out.print("entrer la taille du tableau : ");
				taille = nc.nextInt();
				if(taille >= 10 || taille >= 50){
					tab = new int[taille];
					break;
				}
				else {
					System.out.println("la taille doit etre comprise entre 10 et 50 ");
				}	
			}
			
			//remplissage :
					for(i=0;i<10;i++) {
						System.out.println("entrer l'element " +(i+1)+ " du tableau ");
						tab[i] = nc.nextInt();		
					}
			//affichage avant : 
					System.out.println("l'affichage avant suppression des occurrences ");
						for (i=0;i<taille;i++) {
						System.out.println("element " +(i+1)+ " est : " +tab[i]);
					}
			//affichage aprés :
						
					System.out.print("l'affichage aprés la suppression des occurrences ");
					for (i=0;i<taille;i++) {
						if (tab[i] == tab[i+1]) {
							
							
						}*/
			
			//exc 5 :
			/*int i=0,taille;
			int [] tab = new int[50];
			
			Scanner nc = new Scanner(System.in);
				System.out.print("entrer la taille du tableau : ");
				taille = nc.nextInt();	
			
			
			//remplissage :
					for(i=0;i<taille;i++) {
						System.out.println("entrer l'element " +(i+1)+ " du tableau ");
						tab[i] = nc.nextInt();		
					}
			//affichage avant l'inversement :
					System.out.println("affichage avant : ");
					for (i=0;i<taille;i++) {
						System.out.println("l'élement " +(i+1)+ " du tableau est : " +tab[i]);
					}
			//affichage aprés l'inversement :
					System.out.println("l'affichage inverse ");
					for (i=taille-1;i>=0 ;i--) {
						System.out.println("l'élément " +(i+1)+ " est : " +tab[i]);
					}*/
			
			//exc 6 :
		 /*int taille = 0, pos = 0, neg = 0;
	        int[] T = new int[50];
	        ArrayList<Integer> TP = new ArrayList<>();
	        ArrayList<Integer> TN = new ArrayList<>();
	        Scanner nc = new Scanner(System.in);
	        System.out.print("entrer la taille des tableau : ");
	        taille = nc.nextInt();

	        // Remplissage :

	        for (int i = 0; i < taille; i++) {
	            System.out.print("entrer la valeur " + (i + 1) + " du tableau : ");
	            T[i] = nc.nextInt();
	            if (T[i] >= 0) {
	                pos += 1;
	                TP.add(T[i]); // Ajout de l'élément positif à TP
	            } else {
	                neg += 1;
	                TN.add(T[i]); // Ajout de l'élément négatif à TN
	            }
	        }

	        // Affichage :

	        System.out.println("*****le tableau des vals positifs****** ");

	        for (int i = 0; i < pos; i++) {
	            System.out.println("l'élément " + (i + 1) + " du tableau est :" + TP.get(i));
	        }

	        System.out.println("**** tableau des vals négatives ****");

	        for (int i = 0; i < neg; i++) {
	            System.out.println("l'élément " + (i + 1) + " du tableau est : " + TN.get(i));
	        }*/
		
		
		//exc 7 :
		
		 /*int taille=0;
		 double somme=0;
		 Scanner nc = new Scanner (System.in);
		 System.out.println("entrer la taille du tableau : ");
		 taille=nc.nextInt();
		 double []tableau = new double[taille];
		 
		 //remplissage du tableau : 
		 
		 for (int i=0;i<taille;i++) {
			 System.out.println("entrer la valeur " +(i+1)+ " du tableau : ");
			 tableau[i] = nc.nextInt();
		 }
		 
		 //calcul des sommes des éléments saisie :
		 
		 for (int i=0;i<taille;i++) {
			 somme += tableau[i];
		 }
		 
		 System.out.println("la somme des éléments du tableau : " +somme);
		
		 //calcule de moyenne :
		 
		 System.out.println("la moyenne de ses éléments : " +(somme/taille)); 
		 
		 //copier : 
		 
		 System.out.println("*** le deuxiéme tableau *** ");
		 
		  double [] tab2 = new double[taille];
		  for (int i=0;i<taille;i++) {
			  tab2[i]=tableau[i];			  
		  }
		    //affichage : 
		   
		  for (int i=0;i<taille;i++) {
			  System.out.println("la valeur " +(i+1)+ " du tableau est :" +tab2[i]);
		  }
					
         //classement croissant des éléments : 
		  System.out.println("l'affichage dans un ordre croissant");
		  for (int i = 0; i < taille - 1; i++) {
	            for (int j = 0; j < taille - 1 - i; j++) {
	                if (tableau[j] > tableau[j + 1]) {
	                    // Échange des éléments si tableau[j] > tableau[j + 1]
	                    double temp = tableau[j];
	                    tableau[j] = tableau[j + 1];
	                    tableau[j + 1] = temp;
	                }
	            }
	        }
		  
		  for (int i = 0; i < taille; i++) {
	            System.out.print(tableau[i] + " ");
	        }*/
		
		//exc 8 : 
		
		/*Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Création du tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[taille];

        // Demande à l'utilisateur de remplir le tableau
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Calcul du plus grand écart
        int plusGrandEcart = calculerPlusGrandEcart(tableau);

        // Affichage du plus grand écart
        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode pour calculer le plus grand écart dans un tableau
    public static int calculerPlusGrandEcart(int[] tableau) {
        if (tableau == null || tableau.length < 2) {
            throw new IllegalArgumentException("Le tableau doit contenir au moins 2 éléments.");
        }

        int plusGrandEcart = 0;

        // Parcours du tableau pour trouver le plus grand écart
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                int ecart = Math.abs(tableau[i] - tableau[j]);
                if (ecart > plusGrandEcart) {
                    plusGrandEcart = ecart;
                }
            }
        }

        return plusGrandEcart;*/

	}

}
