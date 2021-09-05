package ConvertNum;

public class Decimal {
	String value;
	public void output() {
		System.out.println(this.value);
	}
	public String toBin() {
		String value = this.value;
		int a = Integer.parseInt(value.substring(0, value.indexOf(".")));
		int b = Integer.parseInt(value.substring(value.indexOf(".")+1));
		return Decimal.DecConvertBin(a,b ) ;
	}
	
	
	
	private static float pickFloatNumber(String st) {
        return Float.parseFloat("0."+st.substring(st.indexOf(".")+1));
    }

    private static String DecConvertBin(int NumberPart, int x){  // 23.375 number=23, demical=375
        String s = "0." + Integer.toString(x);        // chuyen 375 thanh 0.375
        Float DemicalPart = Float.parseFloat(s);

        String res="", head="", tail="";

        head = Integer.toBinaryString(NumberPart);

        while (DemicalPart != 0) {
            DemicalPart *= 2 ;
            if (DemicalPart >= 1) {
                tail =  tail + "1" ;
                DemicalPart = pickFloatNumber(Float.toString(DemicalPart));
            }
            else tail = tail + "0" ;
        }

        res= head +'.'+ tail;
        return res;
    }
}
