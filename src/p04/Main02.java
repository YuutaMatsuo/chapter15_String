package p04;

public class Main02 {
	public static void main(String[] args) {
		double d = 22.0 / 7.0;
		System.out.println(d);
		
		// 小数点以下3桁
		// printf は改行されないので注意！改行させたい場合は \n を最後に入れる 
		System.out.printf("%.3f\n",d);
		System.out.println("こんにちは");
		
		int i1 = 123456;
		int i2 = 789;
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.printf("%6d\n",i1);
		System.out.printf("%6d\n",i2);
		
		String s1 = "あさか";
		String s2 = "みなと";
		
		
	}
}
