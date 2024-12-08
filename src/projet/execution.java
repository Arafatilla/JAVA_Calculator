package projet;
import java.util.Scanner;

public class execution {

	public static void main(String[] args) {
		int operation;
		double numero1, numero2, rad;
		int arreter = 0;
		String Arreter, val;
		CalculMath tab[] = new CalculMath[9];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voulez vous faire une Operation <<Repondez par oui ou non>> :  ");
		do {
		Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		
		
	while (arreter != 10 && Arreter.equals("oui")  )
		{	
		System.out.println("\nChoiser une operation :\n");
		System.out.println("*****1/Addition\n\n*****2/Soustraction\n\n*****3/Multiplication\n\n*****4/Division\n\n*****5/Calculer le Cosinus\n\n*****6/Caluler le Sinus\n\n*****7/Calculer le Logarithme\n\n*****8/Calculer l'Exponotiele\n\n*****9/Calculer la Racine\n\n*****10/Arreter");
		do {
			
			operation = scanner.nextInt();
			
		}while (operation < 1 || operation > 10);
      
	
	
	
	if(operation == 1) {
		System.out.println("Donnez le premier nombre: \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Donnez le deuxième nombre: \n");
		numero2 = scanner.nextDouble();
		scanner.nextLine();
		tab[0] = new Addition(numero1,numero2);
	    System.out.println("Le resultat de votre Additon est: "+tab[0].Calculer());
	    System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
		
	}
	    
	if (operation == 2) {
		System.out.println("Donnez le premier nombre: \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Donnez le deuxième nombre:\n");
		numero2 = scanner.nextDouble();
		scanner.nextLine();
		tab[1] = new Soustraction(numero1,numero2);
	    System.out.println("Le resultat de votre Soustraction est: "+tab[1].Calculer());
	    System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}
	 
	if(operation == 3) {
		System.out.println("Donne le premier nombre: ");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Donnez le deuxième nombre:");
		numero2 = scanner.nextDouble();
		scanner.nextLine();
		tab[2] = new Multiplication(numero1,numero2);
	    System.out.println("Le resultat de votre Multiplication est: "+tab[2].Calculer());
	    System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}
	
	    
	if(operation == 4) {
		System.out.println("Donne le premier nombre: \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Donnez le deuxième nombre:\n");
		numero2 = scanner.nextDouble();
		scanner.nextLine();
		tab[3] = new Division(numero1,numero2);
	    System.out.println("Le resultat de votre Division est: "+tab[3].Calculer());
	    System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));	
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}   
	
	 
	if(operation == 5) {
		System.out.println("Donnez un nombre en radiane: \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();            
		rad = numero1;
		/* on roncontre de complication l'hors de l'execution de l'opertation cos a cause de  la plage d'erreur des calculs en virgule flottante
		  donc on a elaborer deux solution soit on oblige l'utilisateur a travailer avec le radian comme on a fait  soit l'utilisateur
		 donne quelconque valeur et apres on lui pose la question si il travaille avec le radian  sinon si la valeur
		donnez est on dergre on l'a convertie en radian en utilisant le programe comme est montrer si dessous:
		
		System.out.println("est ce que le val introduit est en degre rapondez par oui ou non: ");
		do {
			val = scanner.nextLine();
		}while(!val.equals("oui") && !val.equals("non"));
		if (val.equals("oui")) {
        	rad = Math.toRadians(numero1); 
		}*/
		tab[4] = new Cos(rad);
		System.out.println("Le Cos("+numero1+") = "+tab[4].Calculer());
		System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}	
	
	if(operation == 6) {
		System.out.println("Donnez un nombre en radian : \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		rad = numero1;
		/* on roncontre de complication l'hors de l'execution de l'opertation sin  a cause de  la plage d'erreur des calculs en virgule flottante
		  donc on a elaborer deux solution soit on oblige l'utilisateur a travailer avec le radian comme on a fait soit l'utilisateur
		 donne quelconque valeur et apres on lui pose la quistion si il travaille avec le radian rien no chanche sinon si la valeur
		donnez est on dergre on l'a convertie en radian en utilisant le programe comme est montrer si dessous:
		System.out.println("est ce que le val introduit est en degre repondez par oui ou non: ");
		do {
			val = scanner.nextLine();
		}while(!val.equals("oui") && !val.equals("non"));
		if (val.equals("oui")) {
        	rad = Math.toRadians(numero1); 
		}*/
		tab[5] = new Sin(rad);
		System.out.println("Le Sin("+numero1+") = "+tab[5].Calculer());
		System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}
		
	if(operation == 7) {
		System.out.println("Donnez un nombre: \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		tab[6] = new Log(numero1);
		System.out.println("Le Log("+numero1+") = "+tab[6].Calculer());
		System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do  {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}
	
		
	if(operation == 8) {
		System.out.println("Donnez un nombre : \n");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		tab[7] = new Exp(numero1);
		System.out.println("L'Expo("+numero1+") = "+tab[7].Calculer());
		System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}
		
	if(operation == 9) {
		System.out.println("Donnnez un nombre:\n ");
		numero1 = scanner.nextDouble();
		scanner.nextLine();
		tab[8] = new Sqrt(numero1);
		System.out.println("La racine de ("+numero1+") = "+tab[8].Calculer());
		System.out.println("Voulez vous refaire une opperation <<Repondez par oui ou non>> : \n");
		do {
			Arreter = scanner.nextLine();
		}while(!Arreter.equals("oui") && !Arreter.equals("non"));
		if (Arreter.equals("non")) {
			System.out.println("\nGood Bye");
		}
	}
	
	
	if(operation == 10) {
		System.out.println("\nGood Bye");
		break;
	}
	
	}
	
	
	scanner.close();
}
	
	
}

