
public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(fatorial(n));
	}

	private static int fatorial(int n) {
		if (n == 0) { //Condição de parada
			return 1;
		}else {
			return n * fatorial (n-1);
			
		}
	}

}
