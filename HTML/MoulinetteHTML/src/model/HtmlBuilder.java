package model;

public class HtmlBuilder {
	private StringBuilder html = new StringBuilder();
	
	public HtmlBuilder(){ 
		html.append("<!DOCTYPE html>");
	}
	
	public HtmlBuilder appendLang(String language) {
		html.append("<html lang=\""+language+"\">");
		return this;
	}

	public HeadBuilder appendHead() {
		return new HeadBuilder();
	}
	
	public StyleBuilder appendStyleBuilder() {
		return new StyleBuilder();
	}
	
	public BodyBuilder appBodyBuilder() {
		return new BodyBuilder();
	}
	
	public String build() {
		html.append("</html>");
		return html.toString();
	}
	
	public class HeadBuilder {
		
		public HeadBuilder(){
			html.append("<head>");
		}
		
		public HeadBuilder appendMeta(String charset) {
			html.append("<meta charset=\""+charset+"\">");
			return this;
		}
		
		public HeadBuilder appendTitle(String title) {
			html.append("<title>"+title+"</title>");
			return this;
		}
		
		public HtmlBuilder finishHead() {
			html.append("</head>");
			return HtmlBuilder.this;
		}

}
	public class StyleBuilder {
		
		public StyleBuilder() {
		html.append("<style>");
		}
		
		public StyleBuilder appendStyleContent(String styleContent) {
			html.append(styleContent);
			return this;
		}
		
		public HtmlBuilder finishStyle() {
			html.append("</style>");
			return HtmlBuilder.this;
		}
	}
	
	public class BodyBuilder {
		
		public BodyBuilder() {
		html.append("<body>");
		}
		
		public BodyBuilder appendBodyContent(String bodyContent) {
			html.append(bodyContent);
			return this;
		}
		
		public HtmlBuilder finishBody() {
			html.append("</body>");
			return HtmlBuilder.this;
		}
	}

}

