package examen.Fecha3;

public class ServicioParquizacion extends Servicio{
	
	private int cantMaquinas;
	private double costoMant;
	
	public ServicioParquizacion(double costoPorHora,double cantHoras,int cantMaquinas, double costoMant) {
		super(costoPorHora,cantHoras);
		this.cantMaquinas = cantMaquinas;
		this.costoMant = costoMant;
	}
	
	@Override
	public double montoAPagar() {
		double aPagar = super.montoAPagar() + (this.cantMaquinas*this.costoMant);
		return aPagar;
	}
}
