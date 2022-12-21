package examen.Fecha3;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String direccion;
	private List<Contrato> contratos;
	
	public Cliente(String nombre,String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.contratos = new ArrayList<>();
	}
	
	public void contratarUnicaVez(LocalDate fecha, Servicio servicio) {
		ContratoUnico nuevo = new ContratoUnico(fecha,servicio);
		this.contratos.add(nuevo);
	}
	
	public void contratarProlongado(LocalDate fecha,Servicio servicio,int cantDias) {
		ContratoProlongado nuevo = new ContratoProlongado(fecha,servicio,cantDias);
		this.contratos.add(nuevo);
	}
	
	public double montoAPagar() {
		double aPagar =	this.contratos.stream().mapToDouble(c -> c.montoAPagar()).sum();
		return aPagar;				
	}
	
	@Override
	public String toString() {
		String cliente = "Nombre: " + this.nombre + " Direccion: " + this.direccion;
		return cliente;
	}
}
