import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class WriteInfos {

	public static void main(String[] args) {
		String fileName = "resources/infos.properties";
		Properties properties = new Properties();
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("                    ECRITURE DANS UN FICHIER                   ");
//		System.out.println("---------------------------------------------------------------");
//		
//		WriteInfos write = new WriteInfos();
//		String fileNameForUseFunctionOfPropertiesClass = "infosUsingPropertiesClass.properties";
//		String content = write.generateContent(write).toString();
//		write.writerFile(fileName, content);
//		
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("UILISATION DE LA METHODE STORE FOURNIE PAR LA CLASSE PROPERTIES");
//		System.out.println("---------------------------------------------------------------");
//
//		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileNameForUseFunctionOfPropertiesClass), Charset.forName("UTF-8"))) {
//			properties.store(writer, content);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("               AFFICHE LE CHEMIN ABSOLU DU PATH                ");
		System.out.println("---------------------------------------------------------------");
		
		try {
			Path test = Paths.get(fileName);
			System.out.println(test.toRealPath(LinkOption.NOFOLLOW_LINKS));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("                      LECTURE D'UN FICHIER                     ");
		System.out.println("---------------------------------------------------------------");
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), Charset.forName("UTF-8"))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("UTILISATION DE LA METHODE LOAD FOURNIE PAR LA CLASSE PROPERTIES");
		System.out.println("---------------------------------------------------------------");
		
		try (InputStream in = new FileInputStream(fileName)) {
			properties.load(in);
			properties.list(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public List<Object> propertiesOfMV(String matcher) {
		Properties propreties = System.getProperties();
		return propreties.entrySet().stream().
				filter(var -> var.getKey().toString().contains(matcher))
				.filter(var -> !(var.getValue().toString().isEmpty())).
				collect(Collectors.toList());
		
	}
	
	public StringBuilder generateContent(WriteInfos write) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		StringBuilder sb = new StringBuilder();
		String[] matchers= {"os", "vm", "user"};
		ArrayList<Object> content = new ArrayList<>();
		for(int i=0;i<matchers.length;i++) {
			List<Object> properties = write.propertiesOfMV(matchers[i]);
		content.addAll(properties);

		}
		for (Object var : content) {
			sb.append(var+"\n");
		}
		sb.append("modifié le "+ LocalDateTime.now().format(dtf));
		return sb;
	}
	
	public void writerFile(String textName, String content) {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(textName), Charset.forName("UTF-8"))) {
			writer.write(content);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
