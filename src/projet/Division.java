package projet;

public   class Division extends OperationBinaire {
	
	public Division (double num1, double num2) {
		super(num1, num2);
	}
	public double Div() {
		if (num2 != 0) {
			
			return (num1 / num2);
		}
		else {
			System.out.println("erreur : on ne paut pas diviser sur 0");
			return Double.NaN;
		}
	}
	public double Calculer() {
		return Div();
	}
	
	public double Add() {
		
		return Add();
	}
	
	public double Sous() {
		
		return Sous();
	}
	
	public double Mul() {
		
		return Mul();
	}
	
	
	
	
}
