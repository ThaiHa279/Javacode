package ConvertNum;

public class Binary {
	String value;
	public void output() {
		System.out.println(this.value);
	}
	public String toDec() {
		double result = 0;
		String value = this.value;
		float temp = 1;
		for (int i =value.length(); i>value.indexOf(".")+1; i--) {
			temp /= 2;
		}
		for (int i = value.length()-1; i>=0; i--) {
			String ch = value.charAt(i)+"";
			if (ch.equals(".") != true) {
				int j = Integer.parseInt(value.charAt(i)+"");
				result += j* temp; 
				temp *= 2;
			}
		}
		return Double.toString(result);
	}
}
