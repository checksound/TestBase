package testbase;

/**
 * Alcuni miglioramenti alla classe Persona:
 *  - attributi privati e final;
 *  - override di equals
 *  
 * @author cam
 *
 */
public class PersonaEqualsOverridden {

	private final String nome;
	private final int eta;
	
	public PersonaEqualsOverridden(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
		
	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}

    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaEqualsOverridden other = (PersonaEqualsOverridden) obj;
		if (eta != other.eta)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + "]";
	}
	
	
}
