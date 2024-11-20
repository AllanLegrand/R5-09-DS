public class Q5 {
	public static void main(String[] args) {
		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Veuillez saisir un nombre entier");
		}
		
		for(int i = n-1; i >= 0; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
}
}
