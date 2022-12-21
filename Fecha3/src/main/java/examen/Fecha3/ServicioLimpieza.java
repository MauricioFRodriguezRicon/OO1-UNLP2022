package examen.Fecha3;

public class ServicioLimpieza extends Servicio{

	private double tarifaMinima;
	
	public ServicioLimpieza(double precioPorHora,double cantHoras,double tarifaMinima) {
		super(precioPorHora,cantHoras);
		this.tarifaMinima = tarifaMinima;
	}
	
	@Override
	public double montoAPagar() {
		double aPagar = super.montoAPagar();
		if(aPagar<this.tarifaMinima) {
			aPagar = this.tarifaMinima;
		}
		return aPagar;
	}


}