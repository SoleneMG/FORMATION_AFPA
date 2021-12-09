import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class AfficheFichiersProjet {

	public static void main(String[] args) {
		AfficheFichiersProjet affiche = new AfficheFichiersProjet();
		System.out.println("---------------------------------------------");
		System.out.println("              UTILISATION NIO                ");
		System.out.println("---------------------------------------------");
		String currentDirectory = System.getProperty("user.dir");
		Path path = FileSystems.getDefault().getPath(currentDirectory);

		try {
			affiche.walkFileTree(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------------------");
		System.out.println("UTILISATION CLASSES HISTORIQUE DU PACKAGE IO ");
		System.out.println("---------------------------------------------");
		File currentDirectoryvIO = new File(System.getProperty("user.dir"));
		affiche.walfFileTree(currentDirectoryvIO);

		System.out.println("---------------------------------------------");
		System.out.println("LECTURE/ECRITURE D'UN FICHIER UTILISATION NIO");
		System.out.println("---------------------------------------------");
		String content = """
				src utilis�es pour r�aliser ce TP :
				Apr�s introduction des NIO 2 (JAVA 7)
				https://www.jmdoudoux.fr/java/dej/chap-nio2.htm
				Avant JAVA 7
				https://www.jmdoudoux.fr/java/dej/chap-flux.htm
				""";
		String fileName="test.txt";
		affiche.writerFile(fileName, content);
		affiche.readFile(fileName);
	}

	/**
	 * affiche le contenu du dossier pass� en param�tre sans rentrer en profondeur
	 * Utilisation des fonctionnalit�s propos�es par l'API NIO 2
	 * 
	 * @param path : chemin d'acc�s du dossier � explorer
	 * @throws IOException si le chemin d'acc�s n'est pas accessible
	 */
	public void walkFileTree(Path path) throws IOException {
		Files.walkFileTree(path, new SimpleFileVisitor<Path>() {

			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				if (dir.equals(path)) {
					return FileVisitResult.CONTINUE;
				} else {
					String name = dir.getFileName().toString();
					System.out.println("[" + name + "]");
					return FileVisitResult.SKIP_SUBTREE;
				}
			}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				String name = file.getFileName().toString();
				System.out.println(name);
				return FileVisitResult.CONTINUE;
			}

		});
	}

	/**
	 * affiche le contenu du dossier pass� en param�tre sans rentrer en profondeur
	 * Utilisation des classes du package java.io
	 * 
	 * @param directory : chemin d'acc�s du dossier � explorer
	 */
	public void walfFileTree(File directory) {
		File[] files = directory.listFiles();
		for (File var : files) {
			if (var.isDirectory()) {
				System.out.println("[" + var.getName() + "]");
			} else if (var.isFile()) {
				System.out.println(var.getName());
			} else {
				System.out.println("Tu n'es ni un fichier ni un dossier ! ");
			}
		}
	}

	/**
	 * m�thode qui lit le contenu d'un fichier pour l'afficher sur la console
	 * Utilisation des NIO
	 * 
	 * @param textName nom du fichier � lire
	 */
	public void readFile(String textName) {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName), Charset.forName("UTF-8"))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * m�thode qui �crit du contenu dans un fichier Utilisation des NIO
	 * 
	 * @param textName nom du fichier de destination
	 * @param content  contenu
	 */
	public void writerFile(String textName, String content) {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(textName), Charset.forName("UTF-8"))) {
			writer.write(content);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

//	public Path createANewFile(Path path) throws NullPointerException{
//		Path file = null;
//		try {
//			Files.deleteIfExists(path);
//			file = Files.createFile(path);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return file;
//
//	}

}
