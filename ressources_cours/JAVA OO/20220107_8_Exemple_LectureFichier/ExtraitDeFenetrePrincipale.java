...
	private void setInfos() {
		String ligne = "";
		try {
			BufferedReader f = new BufferedReader(new FileReader("LOTO.CSV"));
			//On récupère la deuxième  ligne
			ligne = f.readLine();
			ligne = f.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(ligne);
		String [] tabInfos = ligne.split(";");
...
