package model;

import java.util.List;

public class HtmlTableBuilder {
	private StringBuilder sb = new StringBuilder();
	
	public HtmlTableBuilder() {
		sb.append("<table>");
	}
	
	public <E> HtmlTableBuilder appendHeader(List<E> cellContent) {
		sb.append("<tr>");
		for (E content : cellContent) {
			sb.append("<th>"+content+"</th>");
		}
		sb.append("</tr>");
		return this;
	}
	
	public <E> HtmlTableBuilder appendRow(List<E> cellContent, int columnCount) {
		for(int indexCdList=0;indexCdList<cellContent.size();indexCdList++) {
				sb.append("<tr>");
				CD cd = (CD) cellContent.get(indexCdList);
				for (int indexCdVariable =0; indexCdVariable<columnCount; indexCdVariable++) {
					switch (indexCdVariable) {
					case 0:
						sb.append("<td>"+cd.ref+"</td>");
						break;
					case 1:
						sb.append("<td>"+cd.titre+"</td>");
						break;
					case 2:
						sb.append("<td>"+cd.auteur+"</td>");
						break;
					case 3:
						sb.append("<td>"+cd.genre+"</td>");
						break;
					default:
						sb.append("<td>INCONNU</td>");
						break;
					}
				}
				sb.append("</tr>");
		}
		return this;
	}
	
	public String finishTable() {
		sb.append("</table>");
		return sb.toString();
	}

}
