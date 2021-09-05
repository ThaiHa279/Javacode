package ConvertNum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		
		if (choose == 10) {
			Decimal num1 = new Decimal();
			num1.value = sc.next();
			// xử lí số
			choose = sc.nextInt();
			if (choose == 1) {
				Binary num2 = new Binary();
				num2.value = num1.toBin();
				num2.output();
			}
		}

		if (choose == 2) {
			Binary num1 = new Binary();
			num1.value = sc.next();
			// xử lí số
			choose = sc.nextInt();
			if (choose == 1) {
				Decimal num2 = new Decimal();
				num2.value = num1.toDec();
				num2.output();
			}
		}
	}
}
