import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		System.out.print("Informe um número: ");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();

		int soma3 = 0;
		int soma5 = 0;

		for (int x = 0; numero >= x; x++) {
			boolean mult3 = true;
			if (x % 3 != 0) {
				mult3 = false;
			} else if (mult3) {
				soma3 = soma3 + x;
			}

			boolean mult5 = true;
			if (x % 5 != 0) {
				mult5 = false;
			} else if (mult5) {
				soma5 = soma5 + x;
			}
		}

		System.out.println("Multiplos de 3" + soma3);
		System.out.println("Multiplos de 5" + soma5);
	}

}
