package OderCode;

import java.util.Scanner;

public class ConvertBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		System.out.println(Convert(n));
		
	}
// 23.375 10111.011
	private static String Convert(double n) {
		String st = Double.toString(n);
		ConvertNumber s = new ConvertNumber();
		int x = Integer.parseInt(st.substring(0, st.indexOf(".")));		
		float k = pickFloatNumber(st); 
		return s.convert(x,2) + "." + convertFloat(k);
	}
    private static float pickFloatNumber(String st) {
    	return Float.parseFloat("0."+st.substring(st.indexOf(".")+1));
    }

	private static String convertFloat(float value) {
	    String st = "";
	    while (value != 0) {  	
	    	value *= 2 ;
	    	if (value >= 1) {
	    		st =  st + "1" ;
	    		value = pickFloatNumber(Float.toString(value));
	    	}
	    	else st = st + "0" ;
	    }
	    return st;
    }
    

}
