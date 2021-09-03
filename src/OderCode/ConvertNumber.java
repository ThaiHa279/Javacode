package OderCode;

import java.util.Scanner;

public class ConvertNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int code = sc.nextInt();
		System.out.println(convert(x,code));	
	}
	private static String convert(int x,int code) {
		String result = "";
		while (x != 0){
			result = makechar(x%code) + result;		
			x /= code;		
		}
		return result;
	}
	private static String makechar(int i) {
		String result = "";
		if (i > 9) {
			result +=  (char)(55 + i);
		}
		else {
			result += i;
		}
		return result;
	}
}
