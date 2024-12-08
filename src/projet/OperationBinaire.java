package projet;

public abstract class OperationBinaire implements CalculMath {
	
	protected double num1; 
	protected double num2;

	public OperationBinaire(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public abstract double  Add();
	public abstract double Sous();
	public abstract double Mul();
	public abstract double Div();
	

}
