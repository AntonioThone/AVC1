import org.junit.jupiter.api.Test;

public class TestePortaLogicaAnd2 {

	@Test
	public void testAndTrue() {
		PortaLogicaAnd2 porta = new PortaLogicaAnd2();
		assertTrue(porta.and(1, 1)); 
	}

	@Test
	public void testAndFalse() {
		PortaLogicaAnd2 porta = new PortaLogicaAnd2();
		assertFalse(porta.and(1, 0)); 
	}

}

