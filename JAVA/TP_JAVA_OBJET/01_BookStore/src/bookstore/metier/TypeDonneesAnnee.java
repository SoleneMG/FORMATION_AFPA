package bookstore.metier;

public class TypeDonneesAnnee {
	int annee;

	public TypeDonneesAnnee(int annee) throws IllegalArgumentException {
		String pattern = "[0-9]{4}";
		String anneeS = Integer.toString(annee);
		if (anneeS.matches(pattern)) {
			this.annee = annee;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString() {
		return "TypeDonneesAnnee [annee=" + annee + "]";
	}

	@Override
	public int hashCode() {
		return annee;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TypeDonneesAnnee) {
			if (this.annee == ((TypeDonneesAnnee) obj).annee) {
				return true;
			}
		}
			return false;

	}

}
