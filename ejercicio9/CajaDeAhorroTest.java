package ejercicio9;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	private CajaDeAhorro cajaDeAhorro;
	
	@BeforeEach
	public void setUp() {
		cajaDeAhorro = new CajaDeAhorro();
	}
	@Test
	public void testConstructor() {
		assertEquals(0, cajaDeAhorro.getSaldo());
	}
	@Test
	public void testDepositarAlgo() {
		cajaDeAhorro.depositar(0);
		assertEquals(0, cajaDeAhorro.getSaldo());
	}
	@Test
	void testExtraerConSaldo() {
		cajaDeAhorro.depositar(102.00);
		assertTrue(cajaDeAhorro.extraer(97.00));
		assertEquals(1.019999999999996,cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testExtraerSinSaldo() {
		cajaDeAhorro.depositar(102);
		assertFalse(cajaDeAhorro.extraer(100));
		assertEquals(99.96,cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testTransferirConSaldo() {
		Cuenta cuentaDestino = new CajaDeAhorro();
		cajaDeAhorro.depositar(102);
		assertTrue(cajaDeAhorro.transferirACuenta(97,cuentaDestino));
		assertEquals(1.019999999999996,cajaDeAhorro.getSaldo());
		assertEquals(96.96119999999999,cuentaDestino.getSaldo());
	}
	
	@Test
	void testTransferirSinSaldo() {
		Cuenta cuentaDestino = new CajaDeAhorro();
		cajaDeAhorro.depositar(102);
		assertFalse(cajaDeAhorro.transferirACuenta(100,cuentaDestino));
		assertEquals(99.96,cajaDeAhorro.getSaldo());
		assertEquals(0,cuentaDestino.getSaldo());
	}
	
	
	
}
