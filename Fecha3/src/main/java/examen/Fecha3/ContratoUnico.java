package examen.Fecha3;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ContratoUnico extends Contrato{

	public ContratoUnico(LocalDate fecha,Servicio servicio) {
		super(fecha,servicio);
	}
	
	@Override
	public double montoAPagar() {
		double aPagar = super.montoAPagar();
		DayOfWeek dia = super.getFecha().getDayOfWeek();
		if(dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY)) {
			aPagar += aPagar*0.15;
		}
		return aPagar;
	}
	
	
}
