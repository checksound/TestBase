package testbase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DomandaTreTest {

	@Test
	void testDifferentReference() {
		Persona persA = new Persona("A", 5);
		Persona persB = new Persona("A", 5);
		
		assertFalse(persA == persB);
		
		assertNotEquals(persA, persB);
	}
	
	@Test
	void testValueEquals() {
		PersonaEqualsOverridden persA = new PersonaEqualsOverridden("A", 5);
		PersonaEqualsOverridden persB = new PersonaEqualsOverridden("A", 5);
		
		assertFalse(persA == persB);
		
		assertEquals(persA, persB);
	}
	
	@Test
	void testReferenceEqualsAlias() {
		Persona persA = new Persona("A", 5);
		
		// Alias
		Persona persC = persA;
		
		assertTrue(persC == persA);
		
		assertEquals(persA, persC);
		
	}
	
}
