package Fenyuk;

public class Application {
	
	public static void main(String[] args) {
		
		 Byte a = 3;
		 Short b = 3;
		 Integer c = 3;
		 Long d = 3L;
		 Double e = 3.3;
		 Float r= 3.3F;
		 Character j = 97;
		 Boolean t = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(r);
		System.out.println(j);
		System.out.println(t);
		
		System.out.println();
		
		System.out.println("Min Byte = " + Byte.MIN_VALUE);
		System.out.println("Max Byte = " + Byte.MAX_VALUE);
		System.out.println("Min Short = " + Short.MIN_VALUE);
		System.out.println("Max Short = " + Short.MAX_VALUE);
		System.out.println("Min Integer = " + Integer.MIN_VALUE);
		System.out.println("Max Integer = " + Integer.MAX_VALUE);
		System.out.println("Min Long = " + Long.MIN_VALUE);
		System.out.println("Max Long = " + Long.MAX_VALUE);
		System.out.println("Min Double = " + Double.MIN_VALUE);
		System.out.println("Max Double = " + Double.MAX_VALUE);
		System.out.println("Min Float = " + Float.MIN_VALUE);
		System.out.println("Max Float = " + Float.MAX_VALUE);
		
		System.out.println();
	
		int [] ints = {11,25,89,100,5,45,0,40,7,38};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int currentValue : ints) {
			if (currentValue < min) {
				min=currentValue;
			}
		}
		
		System.out.println("min = " + min);
		
		
		for (int currentValue : ints) {
			if (currentValue > max) {
				max=currentValue;
			}
		}
		
		System.out.println("max = " + max);
	}


}
