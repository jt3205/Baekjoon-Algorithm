import java.util.Scanner;

public class Main_1075 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long f = scanner.nextLong();
		
		n /= 100;
		n *= 100;
		
		for (int i = 0; i < n + 100; i++) {
			if((n + i) % f == 0){
				n += i;
				break; 
			}
		}
		String result = n+"";
		System.out.println(result.substring(result.length()-2, result.length()));
	}

}
