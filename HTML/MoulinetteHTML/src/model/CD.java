package model;

public class CD implements Comparable<CD> {
	public final String ref;
	public final String titre;
	public final String auteur;
	public final String genre;

	public CD(String ref, String titre, String auteur, String genre) {
		super();
		this.ref = ref;
		this.titre = titre;
		this.auteur = auteur;
		this.genre = convertGenre(genre);
	}

	private String convertGenre(String genre) {
		switch (genre) {
		case "0":
			return "Classique";
		case "1":
			return "Variété étrangère";
		case "2":
			return "Jazz";
		case "3":
			return "Variété française";
		case "4":
			return "Musique du monde";
		case "5":
			return "Divers";
		default:
			return "INCONNU";
		}
	}

	@Override
	public int compareTo(CD o) {
		return this.ref.compareTo(o.ref);
	}

}
