package testbase;

public class DomandaTre {

	public static void main(String[] args) {
		
		Persona persA = new Persona("A", 5);
		
		Persona persB = new Persona("A", 5);
		
		if(persA == persB) {
			System.out.println("NON MI SEMBRA!!");
		} else {
			System.out.println("!=");
		}
		
		Persona persC = persA;
		
		if(persC == persA) {
			System.out.println("OK persC == persA");
		}
		
		if(persC.equals(persA)) {
			System.out.println("OK persC equals persA");
		}
		
		if(persB.equals(persA)) {
			System.out.println("OK persB equals persA"); // NO
		} else {
			System.out.println("OK persB NOT equals persA");
		}
		
		// cosa dovrei fare per avere persB.equals(persA) TRUE
		
		// vedi classe Persona2
		
	}
}
