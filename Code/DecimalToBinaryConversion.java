package Code;

public class DecimalToBinaryConversion {
	
	static String bin(int n)
    {
		String bin="";
        for (int i = 1<<30; i > 0; i = i / 2){
        	String t = ((int) (n&i)!=0)  ? "1" : "0";
            bin += t;
        //    bin=bin*2+((n&i)!=0)?1:0;
        }
        return bin;
    }
     
	    static String decimalToBinary(String a) {
	        if (a == null) {
	            return "ERROR";
	        }

	        String[] number = a.split("\\.");
	        if (number.length > 2) {
	            return "ERROR";
	        }

	        int decimal = Integer.parseInt(number[0]);
	        int fractional = 0;
	        if (number.length == 2) {
	            fractional = Integer.parseInt(number[1]);
	        }

	        String binary = bin(decimal);//Integer.toBinaryString(decimal);
	        binary += ".";
	        
	        double d = Double.parseDouble("." + fractional);
	        for (int i = 1; i <= 4; i++) {
	            String t = ((int) 2 * d) >= 1 ? "1" : "0";
	            binary += t;
	            d = 2 * d;
	            if (d >= 1) {
	                d -= 1;
	            }
	        }
	        return binary;
	    }

	    public static void main(String[] args) {
	        System.out.println(decimalToBinary("23.2"));
	        System.out.println(decimalToBinary("6.25"));
	        System.out.println(decimalToBinary("23.2.3"));
	        System.out.println(decimalToBinary(null));
	        System.out.println(decimalToBinary("15"));
	    }
	
}
