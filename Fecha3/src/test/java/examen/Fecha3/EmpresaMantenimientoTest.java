package examen.Fecha3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;

class EmpresaMantenimientoTest {
	
	private EmpresaMantenimiento sis;
	private ServicioLimpieza limpia;
	private Cliente clienteLleno;
	private Cliente clienteVacio;
	
	@BeforeEach
	void setUp() {
		sis = new EmpresaMantenimiento();
		limpia = new ServicioLimpieza(100,1,1000);
		clienteLleno = new Cliente("Juan","Contarelli 2199");
		clienteVacio = new Cliente("Miguel","Ayacucho 3000");
		sis.contratarUnicaVez(clienteLleno, LocalDate.of(2022,12,16), limpia);
	}
	
	@Test
	void test() {
		assertEquals(0,sis.obtenerMontoAPagar(clienteVacio));
		assertEquals(1000,sis.obtenerMontoAPagar(clienteLleno));
	}

}
