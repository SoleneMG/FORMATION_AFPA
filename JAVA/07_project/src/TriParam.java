import java.util.Arrays;

public class TriParam {

	public static void main(String[] args) {

		if (args.length > 0) {
			Arrays.sort(args);
			System.out.println(Arrays.toString(args));
			
		} else {
			System.out.println("Vous devez compl�ter la bo�te de dialogue du \"run\" de TriParam");
		}
		
		

	}

}
