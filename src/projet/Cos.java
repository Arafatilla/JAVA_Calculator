package projet;

public class Cos extends OperationUnaire   {
	public Cos (double num) {
		super (num);
	}
	
	public double Cosinus() {
		return Math.cos(num);
	}
	
	public double Calculer() {
		return Cosinus();
	}
	
	public double Sinus() {
		return 0;
	}
	
	public double Logarithme() {
		return 0;
	}
	
	public double Expo() {
		return 0;
	}
	
	public double Racine() {
		return 0;
	}
	

}
