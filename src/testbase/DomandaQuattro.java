package testbase;

public class DomandaQuattro {

	public static void main(String[] args) {
		
		String aS = new String("Pippo");
		
		String bS = new String("Pippo");
		
		if(aS == bS) {
			System.out.println("aS == bS");
		} else {
			System.out.println("aS NOT == bS");
		}
		
		if(aS.equals(bS)) {
			System.out.println("aS equals bS");
		} else {
			System.out.println("aS NOT equals bS");
		}
	    
		Integer a1 = new Integer(5);
		Integer a2 = new Integer(5);
		
		if(a1 == a2) {
			System.out.println("a1 == b2");
		} else {
			System.out.println("a1 NOT == b2");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1 equals b2");
		} else {
			System.out.println("a1 NOT equals b2");
		}
		
		
	}

}
