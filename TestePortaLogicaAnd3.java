import org.junit.jupiter.api.Test;

public class TestePortaLogicaAnd3 {

	@Test
	public void testAndTrue() {
		PortaLogicaAnd2 porta = new PortaLogicaAnd3();
		assertTrue(porta.and(1, 1, 1)); 
	}

	@Test
	public void testAndFalse() {
		PortaLogicaAnd2 porta = new PortaLogicaAnd3();
		assertFalse(porta.and(1, 0, 1)); 
	}

}
