package examen.Fecha3;

public abstract class Servicio {

	private double precioPorHora;
	private double cantHoras;
	
	public Servicio(double precioPorHora,double cantHoras) {
		this.precioPorHora = precioPorHora;
		this.cantHoras = cantHoras;
	}
	
	public double montoAPagar() {
		double aPagar = 0;
		aPagar += this.precioPorHora*this.cantHoras;
		return aPagar;
	}
	
}
