package projet;

public abstract class OperationUnaire implements CalculMath  {
	protected double num;
	public OperationUnaire(double num) {
		this.num = num;
	}
	public abstract double Cosinus();
	public abstract double Sinus();
	public abstract double Logarithme();
	public abstract double Expo();
	public abstract double Racine();

}
