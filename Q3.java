public class Q3 {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Veuillez saisir un nombre entier");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
}
