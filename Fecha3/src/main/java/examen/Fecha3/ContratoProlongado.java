package examen.Fecha3;
import java.time.LocalDate;

public class ContratoProlongado extends Contrato{

	private int cantDias;


	public ContratoProlongado(LocalDate fecha,Servicio servicio,int cantDias) {
		super(fecha,servicio);
		this.cantDias = cantDias;
	}
	
	@Override
	public double montoAPagar() {
		double aPagar = super.montoAPagar() * this.cantDias;
		if(this.cantDias > 5) {
			aPagar -= aPagar*0.10;
		}
		return aPagar;
	}
	
}
