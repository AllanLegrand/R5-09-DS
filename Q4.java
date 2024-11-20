public class Q4 {
	public static void main(String[] args) {
		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Veuillez saisir un nombre entier");
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
