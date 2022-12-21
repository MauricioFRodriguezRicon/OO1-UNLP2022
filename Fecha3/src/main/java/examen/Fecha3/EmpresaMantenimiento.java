package examen.Fecha3;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class EmpresaMantenimiento {

	private List<Cliente> clientes;
	private List<Servicio> servicios;
	
	public EmpresaMantenimiento() {
		this.clientes = new ArrayList<>();
		this.servicios = new ArrayList<>();
	}
	
	public Cliente registrarCliente(String nombre,String direccion) {
		Cliente nuevo = new Cliente(nombre,direccion);
		this.clientes.add(nuevo);
		return nuevo;
	}
	
	public ServicioLimpieza registrarServicioLimpieza(double precioPorHora,double cantHoras,double tarifaMinima) {
		ServicioLimpieza nuevo = new ServicioLimpieza(precioPorHora,cantHoras,tarifaMinima);
		this.servicios.add(nuevo);
		return nuevo;
	}
	
	public ServicioParquizacion registrarServicioParquizacion(double precioPorHora,double cantHoras,int cantMaquinas, double costoMant) {
		ServicioParquizacion nuevo = new ServicioParquizacion(precioPorHora,cantHoras,cantMaquinas,costoMant);
		this.servicios.add(nuevo);
		return nuevo;
	}
	
	public void contratarUnicaVez(Cliente cliente,LocalDate fecha,Servicio servicio) {
		cliente.contratarUnicaVez(fecha, servicio);
	}
	
	public void contratarProlongado(Cliente cliente,LocalDate fecha, int cantDias,Servicio servicio) {
		cliente.contratarProlongado(fecha, servicio, cantDias);
	}
	
	public double obtenerMontoAPagar(Cliente cliente) {
		return cliente.montoAPagar();
	}
	
	public int obtenerCantidadDeServiciosConMontoMayorA(double monto) {
		int cant =(int) this.servicios.stream().filter(s -> s.montoAPagar() > monto).count();	
		return cant;
	}
	
}
