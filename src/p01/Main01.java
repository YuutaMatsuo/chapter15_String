package p01;

public class Main01 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		String s5;
		
		// 文字列を調査する
		
		System.out.println(s1 + s2);
		System.out.println(s1.length());
		System.out.println(s1.equals("スッキリJava"));
		
		// 大文字、小文字を区別せず内容が等しいか調べる
		// equalsIgnoreCase
		System.out.println(s2.equalsIgnoreCase(s3));
		
		// 空文字か（長さが０か）を調べる
		System.out.println(s1.isEmpty());
		System.out.println(s4.isEmpty());
//		System.out.println(s5.isEmpty());
	}
}
