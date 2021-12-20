import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadAndConvertLogFile {

	public static void main(String[] args) {
	String fileName = "in010607.log";
	ReadAndConvertLogFile read = new ReadAndConvertLogFile();
	Path pathStart = Paths.get("C:\\Users\\solen\\FORMATION_AFPA");
	try {
		read.findFile(pathStart, fileName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	List<Logs> logs = read.filterByAdressIpHoursAndUri(fileName);
//	StringBuilder sb = new StringBuilder();
//	logs.stream().forEach(x -> sb.append(x.ipAdress+x.date+x.uri+"\n"));
//	
//	String fileNameDest = "src/logs.csv";
//	
//	read.writerFile(fileNameDest, sb.toString());
//	
	}

	public List<Logs> filterByAdressIpHoursAndUri(String textName) {
		List<Logs> logs = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName), Charset.forName("UTF-8"))) {
			String line = null;
			String splitSeparator = ",";

			while ((line = reader.readLine()) != null) {
				String[] infos = line.split(splitSeparator);
				for (int i = 0; i < infos.length; i++) {
					logs.add(new Logs(infos[0] + ",", infos[3] + ",", infos[13] + ","));
				}
				// System.out.println(line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return logs;

	}

	public void writerFile(String textName, String content) {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(textName), Charset.forName("UTF-8"))) {
			writer.write(content);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
public void findFile(Path pathStart, String fileName) throws IOException {
	Stream<Path> stream = Files.find(pathStart, 100000, (path, basicFileAttributes) -> {
		File file = path.toFile(); 
		return !file.isDirectory() && file.getName().equals(fileName);
		});
	stream.forEach(System.out::println);
}
}
