package testbase;

public class DomandaDue {

	public static void main(String[] args) {
		
		Persona persA = new Persona("A", 5);
		
		Persona persB = new Persona("B", 6);
		
		persB = persA;
		
		System.out.println("persB.name:" + persB.nome);
		
		persA.nome = "Giuseppe";
		
		System.out.println("persB.name:" + persB.nome);
	}

}
