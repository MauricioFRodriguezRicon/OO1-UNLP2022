package examen.Fecha3;
import java.time.LocalDate;

public abstract class Contrato {

	private LocalDate fecha;
	private Servicio servicio;
	
	public Contrato(LocalDate fecha, Servicio servicio) {
		this.fecha = fecha;
		this.servicio = servicio;
	}
		
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double montoAPagar() {
		double aPagar = 0;
		aPagar += this.servicio.montoAPagar();
		return aPagar;
	}

	
}
