# VERIFICA 1° corso Java base 

Argomenti: tipi primitivi, tipi reference, ugualianza per riferimento e ugualianza per valore.

## 1. Domanda: Tipi primitivi vs Tipi reference

Data una classe `Persona`:

```java
public class Persona {

	String nome;
	int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

}

```

Se eseguo in un metodo (ad esempio il `main`) il seguente codice:

```java
    
Persona p = new Persona("Marco", 7);
	
int anno = 2011;
```

Disegnare lo stato della memoria facendo vedere differenza tra i **tipi primitivi** e i **tipi reference**.

```




```

## 2. Domanda: Assegnamento tipi reference

Abbiamo due oggetti `persA` e `persB` della classe `Persona`:

```java
Persona persA = new Persona("A", 5);
		
Persona persB = new Persona("B", 6);
```

Fate vedere con disegno la situazione in memoria delle due variabili di tipo reference:

```




```

Ora se eseguo l'assegnamento:

```java
persB = persA;
```

Fate vedere con disegno come le reference sono cambiate:

```


```

Ora eseguo il seguente assegnamento:

```java
persA.nome = "Giuseppe";
```

Domanda: quanto vale `persB.nome` ?

## 3. Domanda: Verifica ugualianza per riferimento vs ugualianza per valore

Sempre con la classe `Persona` abbiamo il seguente codice:

```java      
Persona persA = new Persona("A", 5);
	
Persona persB = new Persona("A", 5);
```

Domanda: 
* il confronto `persA == persB` è TRUE o FALSE? **RISPOSTA:**

Ora eseguiamo il seguente assegnamento:

```java
Persona persC = persA;
```

Domanda:  
* ora il confronto ```persC == persA``` è TRUE o FALSE? **RISPOSTA e motivazione:**
* `persC.equals(persA)` ritorna TRUE o FALSE?  **RISPOSTA e motivazione:**


**DOMANDA AVANZATA: (Facoltativa)**

`persB.equals(persA)` ritorna FALSE, datene la spiegazione. 

Cosa dovrei fare perchè ritorni TRUE e cioè esegua il confronto per valore? Spiega con tue parole e/o scrivendo il codice (anche se non perfetto, basta che sia chiaro il concetto):

```


```

## 4. Domanda: Tipi wrapper di tipi primitivi e stringhe

Dato il seguente codice:

```java
    String aS = new String("Pippo");
		
    String bS = new String("Pippo");
    
    // 1
    if(aS == bS) {
        System.out.println("aS == bS");
    } else {
        System.out.println("aS NOT == bS");
    }
    
    // 2
    if(aS.equals(bS)) {
        System.out.println("aS equals bS");
    } else {
        System.out.println("aS NOT equals bS");
    }
    
    Integer a1 = new Integer(5);
    Integer a2 = new Integer(5);
    
    // 3
    if(a1 == a2) {
        System.out.println("a1 == b2");
    } else {
        System.out.println("a1 NOT == b2");
    }
    
    // 4
    if(a1.equals(a2)) {
        System.out.println("a1 equals b2");
    } else {
        System.out.println("a1 NOT equals b2");
    }
```

Scrivete l'output del programma:  

| CONDIZIONE   |  OUTPUT                              |
|------|------------------------------------|
| `aS == bS` |                   |
| `aS.equals(bS)` |                     |
| `a1 == a2` |     |
| `a1.equals(a2)` |    |

## 5. Domanda: passaggio dei valori di tipo primitivo e reference

Data la funzione:

```java
    static void modificaTipoPrimitivo(int value) {
		value++; // incremento value di 1
		System.out.println("modificaTipoPrimitivo VALUE: " + value);
	}
```

Eseguendo il seguente codice in un metodo (ad esempio nella funzione main):

```java
int val = 8;
modificaTipoPrimitivo(val);
System.out.println("dopo funzione VALUE: " + val);
```
Scrivere l'output (all'interno del metodo e fuori dal metodo):

```


```
--------------------------------------------------------

Ora data la funzione:

```java
    static void modificaTipoReference(Persona persona) {
		persona.nome = "Ambrogio";
		persona.eta++; // incremento di 1
		
		System.out.println("modificaTipoReference: NOME: " + 
				persona.nome + " - ETA'; " + persona.eta);
	}

```
eseguendo il codice:

```java
    Persona pA = new Persona("Mario", 20);
    System.out.println("PRIMA - NOME: " + pA.nome + " - ETA': " + pA.eta);

    modificaTipoReference(pA);

    System.out.println("modificaTipoReference: NOME: " + pA.nome + " - ETA': " + pA.eta);
```

Scrivere l'output:

```


```

-------------------------------------------------------------

Ora data la funzione:

```java
static void modificaTipoReferenceReassignment(Persona persona) {
		
		Persona personaNew = new Persona(persona.nome, persona.eta);
		personaNew.nome = "Ambrogio";
		personaNew.eta++; // incremento di 1
		
		System.out.println("modificaTipoReferenceReassignment: NOME: " + 
				personaNew.nome + " - ETA'; " + personaNew.eta);
	}
```

eseguendo il codice:

```java
    Persona pB = new Persona("Chiara", 45);
    
    System.out.println("PRIMA - NOME: " + pB.nome + " - ETA': " + pB.eta);
       
    modificaTipoReferenceReassignment(pB);
       
    System.out.println("modificaTipoReferenceReassignment: NOME: " + pB.nome + " - ETA': " + pB.eta);    
```

Scrivere l'output:

```



```
