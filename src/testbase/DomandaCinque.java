package testbase;

public class DomandaCinque {
	
	static void modificaTipoPrimitivo(int value) {
		value++; // incremento value di 1
		System.out.println("modificaTipoPrimitivo VALUE: " + value);
	}
    
	static void modificaTipoReference(Persona persona) {
		persona.nome = "Ambrogio";
		persona.eta++; // incremento di 1
		
		System.out.println("modificaTipoReference: NOME: " + 
				persona.nome + " - ETA'; " + persona.eta);
	}
	
	static void modificaTipoReferenceReassignment(Persona persona) {
		
		Persona personaNew = new Persona(persona.nome, persona.eta);
		personaNew.nome = "Ambrogio";
		personaNew.eta++; // incremento di 1
		
		System.out.println("modificaTipoReferenceReassignment: NOME: " + 
				personaNew.nome + " - ETA'; " + personaNew.eta);
	}
	
	public static void main(String[] args) {
		
       int val = 8;
       modificaTipoPrimitivo(val);
       System.out.println("dopo funzione VALUE: " + val);
       
       System.out.println();
       System.out.println("***********************************");
       System.out.println();
       
       Persona pA = new Persona("Mario", 20);
       System.out.println("PRIMA - NOME: " + pA.nome + " - ETA': " + pA.eta);
       modificaTipoReference(pA);
       System.out.println("modificaTipoReference: NOME: " + pA.nome + " - ETA': " + pA.eta);
       
       System.out.println();
       System.out.println("***********************************");
       System.out.println();
       
       Persona pB = new Persona("Chiara", 45);
       System.out.println("PRIMA - NOME: " + pB.nome + " - ETA': " + pB.eta);
       modificaTipoReferenceReassignment(pB);
       System.out.println("modificaTipoReferenceReassignment: NOME: " + pB.nome + " - ETA': " + pB.eta);
	}

}
