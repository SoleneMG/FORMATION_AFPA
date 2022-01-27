package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import model.CD;
import model.HtmlBuilder;
import model.HtmlTableBuilder;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		String csvFilePath = "res\\CDAUDIO0.CSV";
		String htmlFilePath = "res\\index.html";
		List<CD> dataList = m.extractDataFromCsv(csvFilePath, 0);
		Collections.sort(dataList);
		HtmlBuilder htmlBuilder = new HtmlBuilder();
		String htmlFile = htmlBuilder.appendLang("fr")
				.appendHead()
				.appendMeta("metaTest")
				.appendTitle("titreTest")
				.finishHead()
				.appendStyleBuilder()
				.appendStyleContent(m.generateStyle())
				.finishStyle()
				.appBodyBuilder()
				.appendBodyContent(m.generateTable(dataList))
				.finishBody()
				.build();
//		Path path = FileSystems.getDefault().getPath(htmlFilePath);
//		m.createANewFile(path);
		m.writeintoHtmlFile(htmlFilePath, htmlFile);

	}
	
	private String generateStyle() {
		StringBuilder styleBuilder = new StringBuilder();
		styleBuilder.append("body {\r\n"
				+ "        color: darkblue;\r\n"
				+ "        font-family:Arial, Helvetica, sans-serif;\r\n"
				+ "    }\r\n"
				+ "    table {\r\n"
				+ "        border-spacing: 0;\r\n"
				+ "    }\r\n"
				+ "    th {\r\n"
				+ "        background-color: darkblue;\r\n"
				+ "        color: white;\r\n"
				+ "        border: 1px solid rgb(190, 190, 190);\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "    td {\r\n"
				+ "        background-color: grey;\r\n"
				+ "        border: 1px solid rgb(190, 190, 190);\r\n"
				+ "    }");
		return styleBuilder.toString();
	}
	
	private String generateTable(List<CD> cdList) {
		HtmlTableBuilder tableBuilder = new HtmlTableBuilder();
		String[] headercells = {"Ref", "Titre", "Auteur", "Genre"};
		tableBuilder.appendHeader(Arrays.asList(headercells));
		tableBuilder.appendRow(cdList, headercells.length);
		return tableBuilder.finishTable();
	}

	private void writeintoHtmlFile(String htmlFilePath, String content) {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(htmlFilePath))) {
			writer.write(content);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private List<CD> extractDataFromCsv(String textName, int encodageIndex) {
		List<CD> dataList = new ArrayList<>();
		int firstLine = 0;
		String[] infoCd = new String[4];
		String[] encodageTab = { "UTF-8", "ISO-8859-1" };
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(textName),
				Charset.forName(encodageTab[encodageIndex]))) {

			String line = null;
			String splitSeparator = ";";

			while ((line = reader.readLine()) != null) {
				if (firstLine != 0) {
					infoCd = line.split(splitSeparator);
					String ref = infoCd[0];
					String titre = infoCd[1];
					String auteur = infoCd[2];
					String genre = infoCd[3];
					dataList.add(new CD(ref, titre, auteur, genre));
				}
				firstLine++;

			}
		} catch (IOException ioe) {
			// ioe.printStackTrace();
			return extractDataFromCsv(textName, ++encodageIndex);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dataList;
	}

	private Path createANewFile(Path path) throws NullPointerException {
		Path file = null;
		try {
			Files.deleteIfExists(path);
			file = Files.createFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;

	}

}
